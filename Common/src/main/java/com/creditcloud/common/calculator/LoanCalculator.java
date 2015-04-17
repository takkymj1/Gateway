/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.common.utils.LoanValidateUtils;
import com.creditcloud.common.utils.ValidateResult;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.constant.TimeConstant;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import static com.creditcloud.model.enums.loan.RepaymentMethod.BulletRepayment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualInstallment;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualInterest;
import static com.creditcloud.model.enums.loan.RepaymentMethod.EqualPrincipal;
import static com.creditcloud.model.enums.loan.RepaymentMethod.MonthlyInterest;
import static com.creditcloud.model.enums.loan.RepaymentMethod.YearlyInterest;
import com.creditcloud.model.enums.loan.RepaymentPeriod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.LoanDetail;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import org.joda.time.LocalDate;
import java.util.List;

/**
 *
 * @author sobranie
 */
public final class LoanCalculator {

    private static final BigDecimal ZERO = new BigDecimal(0).setScale(2);

    private static final BigDecimal ONE = new BigDecimal(1).setScale(2);

    private static final BigDecimal monthsPerYear = new BigDecimal(TimeConstant.MONTHS_PER_YEAR);

    private static final BigDecimal daysPerYear = new BigDecimal(TimeConstant.DAYS_PER_YEAR);

    /**
     * rate is in format like 2400 which is actually 24.00%
     */
    private static final BigDecimal rateScale = new BigDecimal(10000);

    private static final MathContext mc = new MathContext(16, NumberConstant.ROUNDING_MODE);

    /**
     * @deprecated analyze方法已经修正了每月最后一天的问题
     *
     * @param asOfDate
     * @param nextKMonth
     * @return
     */
    public static LocalDate countDueDate(final LocalDate asOfDate, int nextKMonth) {
        final int[][] leap = {{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int year = asOfDate.getYear();
        int month = asOfDate.getMonthOfYear();
        int day = asOfDate.getDayOfMonth();
        int i = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 0 : 1;
        int nextYear = year + (month + nextKMonth - 1) / 12;
        int nextMonth = (month + nextKMonth - 1) % 12;
        int j = ((nextYear % 4 == 0 && nextYear % 100 != 0) || (nextYear % 400 == 0)) ? 0 : 1;
        int maxNextDay = leap[j][nextMonth];
        int maxCurrentDay = leap[i][month - 1];
        LocalDate local;
        if (day < maxCurrentDay && day < maxNextDay) {
            local = new LocalDate(nextYear, nextMonth + 1, day);
        } else {
            local = new LocalDate(nextYear, nextMonth + 1, maxNextDay);
        }
        return local;
    }

    /**
     *
     * @deprecated analyze方法已经修正了每月最后一天的问题
     *
     * @param amount
     * @param duration
     * @param rate
     * @param method
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyzeNew(final int amount,
                                        final Duration duration,
                                        final int rate,
                                        final RepaymentMethod method,
                                        final LocalDate asOfDate) {
        LocalDate local;
        LoanDetail loan = analyze(amount, duration, rate, method, asOfDate);
        List<Repayment> list = loan.getRepayments();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                local = countDueDate(asOfDate, i + 1);
                list.get(i).setDueDate(local);
            }
        }
        return loan;
    }

    /**
     *
     * @param amount
     * @param duration
     * @param rate     2400 means 24.00%
     * @param method
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(final int amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate) {
        return analyze(BigDecimal.valueOf(amount), duration, rate, method, asOfDate);
    }

    /**
     * 根据参数分析还款表.
     *
     * @param amount
     * @param duration
     * @param rate     2400 means 24.00%
     * @param method
     * @param asOfDate 起息日，1月31日起息，三个月，还款日应为: 2月28(闰年29)、3月31、4月30
     * @param period   还款周期
     * @return
     */
    public static LoanDetail analyze(final BigDecimal amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate,
                                     final RepaymentPeriod period) {
        if (period == null) {
            return analyze(amount, duration, rate, method, asOfDate);
        }
        if (!method.isExtensible()) {
            throw new IllegalArgumentException(method + "is not extensible repayment.");
        }
        if (!method.equals(BulletRepayment)) {//一次性还款不需要验证
            //period和RepaymentMethod的组合是否合规
            ValidateResult validateResult = LoanValidateUtils.validatePeriodAndDuration(period, duration);
            if (!validateResult.isSuccess()) {
                throw new IllegalArgumentException(validateResult.getMessage());
            }
        }

        LoanDetail result = null;
        //principal
        BigDecimal principal = amount;
        //now get rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal ratePeriod = rateMonth.multiply(new BigDecimal(period.getMonthsOfPeriod()));
        //dealing with different methods
        BigDecimal interest, amortizedInterest, amortizedPrincipal, outstandingPrincipal;

        int tenure;
        switch (method) {
            case BulletRepayment:
                analyze(amount, duration, rate, method, asOfDate);
                break;
            case MonthlyInterest: //按period付息，到期还本
                tenure = duration.getTotalMonths() / period.getMonthsOfPeriod();
                amortizedInterest = principal.multiply(ratePeriod).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(tenure));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);
                //add amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i < tenure - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(ZERO, amortizedInterest, principal,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {    //last ONE we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    }
                }
                break;
            case EqualInstallment: //按period等额本息
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                BigDecimal[] is = new BigDecimal[tenure + 1];
                for (int i = 0; i <= tenure; i++) {
                    is[i] = ratePeriod.add(ONE).pow(i);
                }
                BigDecimal baseInterest = principal.multiply(ratePeriod);
                //calc installment
                BigDecimal installment = baseInterest.multiply(is[tenure]).divide(is[tenure].subtract(ONE), mc);
                installment = installment.setScale(2, NumberConstant.ROUNDING_MODE);
                //reset total interest
                interest = ZERO;
                //create loanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    amortizedInterest = baseInterest.subtract(installment, mc).multiply(is[i]).add(installment, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    amortizedPrincipal = installment.subtract(amortizedInterest);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {  //last ONE we need to fix the rounding error and let the oustanding principal be ZERO
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    }
                    interest = interest.add(amortizedInterest);
                }
                //fix interest
                result.setInterest(interest);
                break;
            case EqualPrincipal: //按period等额本金
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                //calc amortized principal first
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //calc by each month
                BigDecimal[] interests = new BigDecimal[tenure];
                BigDecimal[] outstandingPrincipals = new BigDecimal[tenure];
                outstandingPrincipal = principal;
                interest = ZERO;
                for (int i = 0; i < tenure; i++) {
                    interests[i] = outstandingPrincipal.multiply(ratePeriod, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    interest = interest.add(interests[i]);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    outstandingPrincipals[i] = outstandingPrincipal;
                }
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualPrincipal);
                //deal with amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipals[i]),
                                                                 interests[i],
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 interests[i],
                                                                 outstandingPrincipals[i],
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    }
                }
                break;
            case EqualInterest: //按period平息
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                //calc amortized principal and interest
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                amortizedInterest = principal.multiply(ratePeriod).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualInterest);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    }
                }
                break;
        }
        return result;
    }

    /**
     * 根据参数分析还款表.
     *
     * @param amount
     * @param duration
     * @param rate     2400 means 24.00%
     * @param method
     * @param asOfDate 起息日，1月31日起息，三个月，还款日应为: 2月28(闰年29)、3月31、4月30
     * @return
     */
    public static LoanDetail analyze(final BigDecimal amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate) {
        return analyze(amount, duration, rate, method, asOfDate, NumberConstant.ROUNDING_MODE);
    }

    public static LoanDetail analyze(final BigDecimal amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate,
                                     final RoundingMode rm) {
        RoundingMode roundingMode = rm;
        if (roundingMode == null) {
            roundingMode = NumberConstant.ROUNDING_MODE;
        }

        LoanDetail result = null;
        //principal
        BigDecimal principal = amount;
        //now get rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //dealing with different methods
        BigDecimal interest, amortizedInterest, amortizedPrincipal, outstandingPrincipal;
        int tenure;
        switch (method) {
            case BulletRepayment:
                //天数不为0直接按照日息计算,还款计划也按照日来累加，保证还款计划天数与计息天数一致
                if (duration.getDays() > 0) {
                    interest = principal.multiply(rateDay).multiply(new BigDecimal(duration.getTotalDays()));
                } else {
                    //add yearly interest
                    interest = principal.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
                    //add monthly interest
                    interest = interest.add(principal.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
                }

                //ceilling the interest
                interest = interest.setScale(2, roundingMode);
                //create result
                result = new LoanDetail(principal, interest, duration, BulletRepayment);
                //天数不为0直接按照日息计算,还款计划也按照日来累加，保证还款计划天数与计息天数一致
                if (duration.getDays() > 0) {
                    result.getRepayments().add(new Repayment(principal, interest, ZERO, DateUtils.offset(asOfDate, duration.getTotalDays())));
                } else {
                    result.getRepayments().add(new Repayment(principal, interest, ZERO, DateUtils.offset(asOfDate, duration)));
                }
                break;
            case MonthlyInterest:   //in this case we don't need to worry about duration.days since that must be 0
                amortizedInterest = principal.multiply(rateMonth).setScale(2, roundingMode);
                interest = amortizedInterest.multiply(new BigDecimal(duration.getTotalMonths()));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);
                //add amortized items
                for (int i = 0; i < duration.getTotalMonths(); i++) {
                    if (i < duration.getTotalMonths() - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(ZERO, amortizedInterest, principal, DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    } else {    //last ONE we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, ZERO, DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    }
                }
                break;
            case EqualInstallment:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //pre-calc
                BigDecimal[] is = new BigDecimal[tenure + 1];
                for (int i = 0; i <= tenure; i++) {
                    is[i] = rateMonth.add(ONE).pow(i);
                }
                BigDecimal baseInterest = principal.multiply(rateMonth);
                //calc installment
                BigDecimal installment = baseInterest.multiply(is[tenure]).divide(is[tenure].subtract(ONE), mc);
                installment = installment.setScale(2, roundingMode);
                //reset total interest
                interest = ZERO;
                //create loanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    amortizedInterest = baseInterest.subtract(installment, mc).multiply(is[i]).add(installment, mc).setScale(2, roundingMode);
                    amortizedPrincipal = installment.subtract(amortizedInterest);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {  //last ONE we need to fix the rounding error and let the oustanding principal be ZERO
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    }
                    interest = interest.add(amortizedInterest);
                }
                //fix interest
                result.setInterest(interest);
                break;
            case EqualPrincipal:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //calc amortized principal first
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, roundingMode);
                //calc by each month
                BigDecimal[] interests = new BigDecimal[tenure];
                BigDecimal[] outstandingPrincipals = new BigDecimal[tenure];
                outstandingPrincipal = principal;
                interest = ZERO;
                for (int i = 0; i < tenure; i++) {
                    interests[i] = outstandingPrincipal.multiply(rateMonth, mc).setScale(2, roundingMode);
                    interest = interest.add(interests[i]);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    outstandingPrincipals[i] = outstandingPrincipal;
                }
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualPrincipal);
                //deal with amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipals[i]),
                                                                 interests[i],
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 interests[i],
                                                                 outstandingPrincipals[i],
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    }
                }
                break;
            case EqualInterest:
                //times of repayments in months
                tenure = duration.getYears() * 12 + duration.getMonths();
                //calc amortized principal and interest
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, roundingMode);
                amortizedInterest = principal.multiply(rateMonth).setScale(2, roundingMode);
                interest = amortizedInterest.multiply(new BigDecimal(tenure), mc).setScale(2, roundingMode);
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualInterest);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(asOfDate, new Duration(0, i + 1, 0))));
                    }
                }
                break;
            case YearlyInterest:
                //times of repayments.
                tenure = duration.getYears();
                //calc amortized interest and interest
                amortizedInterest = principal.multiply(rateYear).setScale(2, roundingMode);
                interest = amortizedInterest.multiply(new BigDecimal(tenure), mc).setScale(2, roundingMode);
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, YearlyInterest);
                //add amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i < tenure - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(ZERO, amortizedInterest, principal, DateUtils.offset(asOfDate, new Duration(i + 1, 0, 0))));
                    } else {    //last ONE we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, ZERO, DateUtils.offset(asOfDate, new Duration(i + 1, 0, 0))));
                    }
                }
                break;
        }
        return result;
    }

    /**
     *
     * @param request
     * @param asOfDate
     * @return
     */
    public static LoanDetail analyze(LoanRequest request, LocalDate asOfDate) {
        return analyze(request.getAmount(),
                       request.getDuration(),
                       request.getRate(),
                       request.getMethod(),
                       asOfDate);
    }

    /**
     * 根据参数分析还款表.
     *
     * @param amount
     * @param duration
     * @param rate             2400 means 24.00%
     * @param method
     * @param asOfDate         起息日，1月31日起息，三个月，还款日应为: 2月28(闰年29)、3月31、4月30
     * @param period           还款周期
     * @param repayDateOfMonth 固定还款日期
     * @return
     */
    public static LoanDetail analyze(final BigDecimal amount,
                                     final Duration duration,
                                     final int rate,
                                     final RepaymentMethod method,
                                     final LocalDate asOfDate,
                                     final RepaymentPeriod period,
                                     final int repayDateOfMonth) {
        if (period == null) {
            return analyze(amount, duration, rate, method, asOfDate);
        }
        if (repayDateOfMonth == 0) {
            return analyze(amount, duration, rate, method, asOfDate, period);
        }
        if (!method.isExtensible()) {
            throw new IllegalArgumentException(method + "is not extensible repayment.");
        }
        if (!method.equals(BulletRepayment)) {//一次性还款不需要验证
            //period和RepaymentMethod的组合是否合规
            ValidateResult validateResult = LoanValidateUtils.validatePeriodAndDuration(period, duration);
            if (!validateResult.isSuccess()) {
                throw new IllegalArgumentException(validateResult.getMessage());
            }
        }
        LoanDetail result = null;

        //principal
        BigDecimal principal = amount;
        //now get rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal ratePeriod = rateMonth.multiply(new BigDecimal(period.getMonthsOfPeriod()));

        //起息日与固定日相差天数，把时间累积到第一期，最后一期相应的时间也会缩短
        int fixDays = repayDateOfMonth - asOfDate.getDayOfMonth();
        int fixMonth = asOfDate.getMonthOfYear() - 1;
        //如果用户设定31号还款，只一月等具有31号
        LocalDate fixAsOfDate = new LocalDate(asOfDate.getYear(), 1, repayDateOfMonth);
        if (fixDays < 0) {
            fixAsOfDate = fixAsOfDate.plusMonths(1);
        }

        //dealing with different methods
        BigDecimal interest, amortizedInterest, amortizedPrincipal, outstandingPrincipal;

        int tenure;
        switch (method) {
            case BulletRepayment:
                //一次性还款，不可再指定固定还款日
                analyze(amount, duration, rate, method, asOfDate);
                break;
            case MonthlyInterest: //按period付息，到期还本
                tenure = duration.getTotalMonths() / period.getMonthsOfPeriod();
                amortizedInterest = principal.multiply(ratePeriod).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(tenure));
                //create result
                result = new LoanDetail(principal, interest, duration, MonthlyInterest);

                //add amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i < tenure - 1) {    //only interest, no principal
                        result.getRepayments().add(new Repayment(ZERO, amortizedInterest, principal,
                                                                 DateUtils.offset(fixAsOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod() + fixMonth, 0))));
                    } else {    //last ONE we pay off the principal as well as interest
                        result.getRepayments().add(new Repayment(principal, amortizedInterest, ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    }
                }
                break;
            case EqualInstallment: //按period等额本息
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                BigDecimal[] is = new BigDecimal[tenure + 1];
                for (int i = 0; i <= tenure; i++) {
                    is[i] = ratePeriod.add(ONE).pow(i);
                }
                BigDecimal baseInterest = principal.multiply(ratePeriod);
                //calc installment
                BigDecimal installment = baseInterest.multiply(is[tenure]).divide(is[tenure].subtract(ONE), mc);
                installment = installment.setScale(2, NumberConstant.ROUNDING_MODE);
                //reset total interest
                interest = ZERO;
                //create loanDetail
                result = new LoanDetail(principal, interest, duration, EqualInstallment);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    amortizedInterest = baseInterest.subtract(installment, mc).multiply(is[i]).add(installment, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    amortizedPrincipal = installment.subtract(amortizedInterest);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {  //last ONE we need to fix the rounding error and let the oustanding principal be ZERO
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(fixAsOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod() + fixMonth, 0))));
                    }
                    interest = interest.add(amortizedInterest);
                }
                //fix interest
                result.setInterest(interest);
                break;
            case EqualPrincipal: //按period等额本金
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                //calc amortized principal first
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //calc by each month
                BigDecimal[] interests = new BigDecimal[tenure];
                BigDecimal[] outstandingPrincipals = new BigDecimal[tenure];
                outstandingPrincipal = principal;
                interest = ZERO;
                for (int i = 0; i < tenure; i++) {
                    interests[i] = outstandingPrincipal.multiply(ratePeriod, mc).setScale(2, NumberConstant.ROUNDING_MODE);
                    interest = interest.add(interests[i]);
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    outstandingPrincipals[i] = outstandingPrincipal;
                }
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualPrincipal);
                //deal with amortized items
                for (int i = 0; i < tenure; i++) {
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipals[i]),
                                                                 interests[i],
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 interests[i],
                                                                 outstandingPrincipals[i],
                                                                 DateUtils.offset(fixAsOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod() + fixMonth, 0))));
                    }
                }
                break;
            case EqualInterest: //按period平息
                //times of repayments in months
                tenure = (duration.getYears() * 12 + duration.getMonths()) / period.getMonthsOfPeriod();
                //calc amortized principal and interest
                amortizedPrincipal = principal.divide(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                amortizedInterest = principal.multiply(ratePeriod).setScale(2, NumberConstant.ROUNDING_MODE);
                interest = amortizedInterest.multiply(new BigDecimal(tenure), mc).setScale(2, NumberConstant.ROUNDING_MODE);
                //create LoanDetail
                result = new LoanDetail(principal, interest, duration, EqualInterest);
                //deal with amortized items
                outstandingPrincipal = principal;
                for (int i = 0; i < tenure; i++) {
                    outstandingPrincipal = outstandingPrincipal.subtract(amortizedPrincipal);
                    if (i == tenure - 1) {
                        result.getRepayments().add(new Repayment(amortizedPrincipal.add(outstandingPrincipal),
                                                                 amortizedInterest,
                                                                 ZERO,
                                                                 DateUtils.offset(asOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod(), 0))));
                    } else {
                        result.getRepayments().add(new Repayment(amortizedPrincipal,
                                                                 amortizedInterest,
                                                                 outstandingPrincipal,
                                                                 DateUtils.offset(fixAsOfDate, new Duration(0, (i + 1) * period.getMonthsOfPeriod() + fixMonth, 0))));
                    }
                }
                break;
        }

        return result;
    }

    /**
     * 快速计算利息
     *
     * @param amount   金额
     * @param rate     利率，2400代表24%
     * @param duration 期限
     * @return
     */
    public static BigDecimal quickInterest(int amount, int rate, Duration duration) {
        return quickInterest(new BigDecimal(amount), rate, duration);
    }

    /**
     * 快速计算利息
     *
     * @param amount   金额
     * @param rate     利率，2400代表24%
     * @param duration 期限
     * @return
     */
    public static BigDecimal quickInterest(BigDecimal amount, int rate, Duration duration) {
        //rates
        BigDecimal rateYear = new BigDecimal(rate).divide(rateScale, mc);
        BigDecimal rateMonth = rateYear.divide(monthsPerYear, mc);
        BigDecimal rateDay = rateYear.divide(daysPerYear, mc);
        //calc
        BigDecimal interest = amount.multiply(rateYear).multiply(new BigDecimal(duration.getYears()));
        //add monthly interest
        interest = interest.add(amount.multiply(rateMonth).multiply(new BigDecimal(duration.getMonths())));
        //add daily interest
        interest = interest.add(amount.multiply(rateDay).multiply(new BigDecimal(duration.getDays())));
        //return
        return interest.setScale(2, NumberConstant.ROUNDING_MODE);
    }
}
