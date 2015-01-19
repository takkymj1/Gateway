/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.Fee;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.config.enums.FeePeriod;
import static com.creditcloud.config.enums.FeePeriod.DAILY;
import static com.creditcloud.config.enums.FeePeriod.SINGLE;
import com.creditcloud.config.enums.FeeScope;
import static com.creditcloud.config.enums.FeeScope.BOTH;
import static com.creditcloud.config.enums.FeeScope.INTEREST;
import static com.creditcloud.config.enums.FeeScope.PRINCIPAL;
import com.creditcloud.config.enums.FeeType;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.loan.AdvancePenalty;
import com.creditcloud.model.loan.LoanFee;
import com.creditcloud.model.loan.OverduePenalty;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.util.logging.Logger;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public class FeeUtils {

    private static final Logger logger = Logger.getLogger(FeeUtils.class.getName());

    /**
     * 根据收费项和具体金额返回实际收费
     *
     * @param fee
     * @param amount
     * @return
     */
    public static BigDecimal calculate(Fee fee, BigDecimal amount) {
        if (fee == null || amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        switch (fee.getType()) {
            case NONE:
                return BigDecimal.ZERO;
            case FIXED:
                return fee.getFixed().setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
            case FLOATING:
                return amount.multiply(fee.getRate()).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
            case BOTH:
                return amount.multiply(fee.getRate()).add(fee.getFixed()).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
        }
        return BigDecimal.ZERO;
    }

    /**
     * 提前还款费用计算
     *
     * @param config
     * @param repayment
     * @param type
     * @return
     */
    public static AdvancePenalty advanceFee(FeeConfig config, Repayment repayment, RepayType type) {
        if (repayment == null) {
            return new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        if (!isValidAdvanceRepay(config, repayment)) {
            return new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }

        Fee feeToClient = config.getAdvanceRepayClientFee();
        Fee feeToInvest = config.getAdvanceRepayInvestFee();
        BigDecimal toInvestAmount = BigDecimal.ZERO;
        BigDecimal toClientAmount = BigDecimal.ZERO;
        switch (type) {
            case Principal:
                toClientAmount = repayment.getAmountPrincipal();
                toInvestAmount = repayment.getAmountPrincipal();
                break;
            case PrincipalAndInterest:
                toClientAmount = repayment.getAmount();
                toInvestAmount = repayment.getAmount();
                break;
            default:
        }
        toClientAmount = FeeUtils.calculate(feeToClient, toClientAmount);
        toInvestAmount = FeeUtils.calculate(feeToInvest, toInvestAmount);

        return new AdvancePenalty(toClientAmount, toInvestAmount);
    }

    /**
     * 提前还款费用
     *
     * @param config
     * @param repayment
     * @return
     */
    @Deprecated
    public static AdvancePenalty advanceFee(FeeConfig config, Repayment repayment) {
        if (repayment == null) {
            return new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        if (!isValidAdvanceRepay(config, repayment)) {
            return new AdvancePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }

        BigDecimal toClientAmount = BigDecimal.ZERO;
        Fee feeToClient = config.getAdvanceRepayClientFee();
        if (feeToClient != null) {
            switch (feeToClient.getScope()) {
                case INTEREST:
                    toClientAmount = repayment.getAmountInterest();
                    break;
                case PRINCIPAL:
                    toClientAmount = repayment.getAmountPrincipal();
                    break;
                case BOTH:
                    toClientAmount = repayment.getAmount();
                    break;
                default:
                    logger.warning(String.format("illegal scope %s for advance fee", feeToClient.getScope()));
            }

            switch (feeToClient.getPeriod()) {
                case SINGLE:
                    toClientAmount = FeeUtils.calculate(feeToClient, toClientAmount);
                    break;
                default:
                    toClientAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for advance repay fee. only SINGLE allowed.", feeToClient.getPeriod()));
            }
        }

        BigDecimal toInvestAmount = BigDecimal.ZERO;
        Fee feeToInvest = config.getAdvanceRepayInvestFee();
        if (feeToInvest != null) {
            switch (feeToInvest.getScope()) {
                case INTEREST:
                    toInvestAmount = repayment.getAmountInterest();
                    break;
                case PRINCIPAL:
                    toInvestAmount = repayment.getAmountPrincipal();
                    break;
                case BOTH:
                    toInvestAmount = repayment.getAmount();
                    break;
                default:
                    logger.warning(String.format("illegal scope %s for advance fee", feeToClient.getScope()));
            }
            switch (feeToInvest.getPeriod()) {
                case SINGLE:
                    toInvestAmount = FeeUtils.calculate(feeToInvest, toInvestAmount);
                    break;
                default:
                    toInvestAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for advance repay fee. only SINGLE allowed.", feeToInvest.getPeriod()));
            }
        }

        return new AdvancePenalty(toClientAmount, toInvestAmount);
    }

    /**
     * 计算欠款的逾期费用
     *
     * @param config
     * @param repayment
     * @return
     */
    public static OverduePenalty overdueFee(FeeConfig config, Repayment repayment) {
        if (repayment == null) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        if (LocalDate.now().compareTo(repayment.getDueDate()) <= 0) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        //计算天数
        long nowTime = LocalDate.now().toDate().getTime();
        long dueTime = repayment.getDueDate().toDate().getTime();
        BigDecimal days = BigDecimal.valueOf(Math.min(config.getMaxDaysForOverdueFee(), (nowTime - dueTime) / DateUtils.MILLIS_PER_DAY));

        /**
         * 逾期管理费计算
         */
        BigDecimal overdueAmount = BigDecimal.ZERO;
        Fee overdueFee = config.getLoanOverdueFee();
        if (overdueFee != null) {
            switch (overdueFee.getScope()) {
                case INTEREST:
                    overdueAmount = repayment.getAmountInterest();
                    break;
                case PRINCIPAL:
                    overdueAmount = repayment.getAmountPrincipal();
                    break;
                case BOTH:
                    overdueAmount = repayment.getAmount();
                    break;
                case OUTSTANDING:
                    overdueAmount = repayment.getAmountOutstanding();
            }
            switch (overdueFee.getPeriod()) {
                case DAILY:
                    overdueAmount = FeeUtils.calculate(overdueFee, overdueAmount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    overdueAmount = FeeUtils.calculate(overdueFee, overdueAmount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    overdueAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for overdue fee. only DAILY and SINGLE allowed.", overdueFee.getPeriod()));
            }
        }

        /**
         * 逾期罚息计算
         */
        BigDecimal penaltyAmount = BigDecimal.ZERO;
        Fee penaltyFee = config.getLoanPenaltyFee();
        if (penaltyFee != null) {
            switch (penaltyFee.getScope()) {
                case INTEREST:
                    penaltyAmount = repayment.getAmountInterest();
                    break;
                case PRINCIPAL:
                    penaltyAmount = repayment.getAmountPrincipal();
                    break;
                case BOTH:
                    penaltyAmount = repayment.getAmount();
                    break;
                case OUTSTANDING:
                    penaltyAmount = repayment.getAmountOutstanding();
            }
            switch (penaltyFee.getPeriod()) {
                case DAILY:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, penaltyAmount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, penaltyAmount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    penaltyAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for penalty fee. only DAILY and SINGLE allowed", penaltyFee.getPeriod()));
            }
        }

        return new OverduePenalty(overdueAmount, penaltyAmount);
    }

    /**
     * 计算欠款的逾期费用
     *
     * @param config
     * @param dueDate
     * @param amount
     * @return
     */
    public static OverduePenalty overdueFee(FeeConfig config, LocalDate dueDate, BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        if (dueDate == null || LocalDate.now().compareTo(dueDate) <= 0) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        //计算天数
        long nowTime = LocalDate.now().toDate().getTime();
        long dueTime = dueDate.toDate().getTime();
        BigDecimal days = BigDecimal.valueOf(Math.min(config.getMaxDaysForOverdueFee(), (nowTime - dueTime) / DateUtils.MILLIS_PER_DAY));

        /**
         * 逾期管理费计算
         */
        BigDecimal overdueAmount = BigDecimal.ZERO;
        Fee overdueFee = config.getLoanOverdueFee();
        if (overdueFee != null) {
            switch (overdueFee.getPeriod()) {
                case DAILY:
                    overdueAmount = FeeUtils.calculate(overdueFee, amount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    overdueAmount = FeeUtils.calculate(overdueFee, amount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    overdueAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for overdue fee. only DAILY and SINGLE allowed.", overdueFee.getPeriod()));
            }
        }

        /**
         * 逾期罚息计算
         */
        BigDecimal penaltyAmount = BigDecimal.ZERO;
        Fee penaltyFee = config.getLoanPenaltyFee();
        if (penaltyFee != null) {
            switch (penaltyFee.getPeriod()) {
                case DAILY:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, amount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, amount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    penaltyAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for penalty fee. only DAILY and SINGLE allowed", penaltyFee.getPeriod()));
            }
        }

        return new OverduePenalty(overdueAmount, penaltyAmount);
    }
    
    /**
     * 计算欠款的逾期费用
     *
     * @param config
     * @param dueDate
     * @param repayDate
     * @param amount
     * @return
     */
    public static OverduePenalty overdueFee(FeeConfig config, LocalDate dueDate, LocalDate repayDate, BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        if (dueDate == null || repayDate == null) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        //计算天数
        long repayTime = repayDate.toDate().getTime();
        long dueTime = dueDate.toDate().getTime();
        BigDecimal days = BigDecimal.valueOf(Math.min(config.getMaxDaysForOverdueFee(), (repayTime - dueTime) / DateUtils.MILLIS_PER_DAY));

        /**
         * 逾期管理费计算
         */
        BigDecimal overdueAmount = BigDecimal.ZERO;
        Fee overdueFee = config.getLoanOverdueFee();
        if (overdueFee != null) {
            switch (overdueFee.getPeriod()) {
                case DAILY:
                    overdueAmount = FeeUtils.calculate(overdueFee, amount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    overdueAmount = FeeUtils.calculate(overdueFee, amount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    overdueAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for overdue fee. only DAILY and SINGLE allowed.", overdueFee.getPeriod()));
            }
        }

        /**
         * 逾期罚息计算
         */
        BigDecimal penaltyAmount = BigDecimal.ZERO;
        Fee penaltyFee = config.getLoanPenaltyFee();
        if (penaltyFee != null) {
            switch (penaltyFee.getPeriod()) {
                case DAILY:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, amount).multiply(days).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, amount).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    penaltyAmount = BigDecimal.ZERO;
                    logger.warning(String.format("Illegal argument %s for penalty fee. only DAILY and SINGLE allowed", penaltyFee.getPeriod()));
            }
        }

        return new OverduePenalty(overdueAmount, penaltyAmount);
    }

    /**
     * 合并默认的Fee和rate/scope
     *
     * @param defaultFee
     * @param rate
     * @param scope
     * @return
     */
    public static Fee mergeFee(Fee defaultFee, BigDecimal rate, FeeScope scope) {
        //LoanFee为null则返回系统默认费用
        if (rate != null) {
            if (defaultFee == null) {
                //找不到系统收费配置，那么尝试用LoanFee来生成费用
                return new Fee(FeeType.FLOATING,
                               BigDecimal.ZERO,
                               rate,
                               FeePeriod.SINGLE,
                               scope);
            } else {
                FeeType feeType = defaultFee.getType();
                //如果配置文件不收取此费用，那么按照LoanFee为准仍然收取，且按照浮动费率收取
                if (feeType.equals(FeeType.NONE)) {
                    feeType = FeeType.FLOATING;
                }
                return new Fee(feeType,
                               defaultFee.getFixed(),
                               rate,
                               defaultFee.getPeriod(),
                               defaultFee.getScope());
            }
        }
        return defaultFee;
    }

    /**
     * 合并默认的FeeConfig和LoanFee
     *
     * @param config
     * @param loanFee
     * @return
     */
    public static FeeConfig mergeLoanFee(FeeConfig config, LoanFee loanFee) {
        FeeConfig mergedConfig = copyOf(config);
        if (loanFee != null) {
            if (loanFee.getInvestInterestFee() != null) {
                mergedConfig.setInvestInterestFee(mergeFee(mergedConfig.getInvestInterestFee(),
                                                           loanFee.getInvestInterestFee(),
                                                           FeeScope.PRINCIPAL));
            }
            if (loanFee.getLoanGuaranteeFee() != null) {
                mergedConfig.setLoanGuaranteeFee(mergeFee(mergedConfig.getLoanGuaranteeFee(),
                                                          loanFee.getLoanGuaranteeFee(),
                                                          FeeScope.PRINCIPAL));
            }
            if (loanFee.getLoanInterestFee() != null) {
                mergedConfig.setLoanInterestFee(mergeFee(mergedConfig.getLoanInterestFee(),
                                                         loanFee.getLoanInterestFee(),
                                                         FeeScope.PRINCIPAL));
            }
            if (loanFee.getLoanManageFee() != null) {
                mergedConfig.setLoanManageFee(mergeFee(mergedConfig.getLoanManageFee(),
                                                       loanFee.getLoanManageFee(),
                                                       FeeScope.PRINCIPAL));
            }
            if (loanFee.getLoanServiceFee() != null) {
                mergedConfig.setLoanServiceFee(mergeFee(mergedConfig.getLoanServiceFee(),
                                                        loanFee.getLoanServiceFee(),
                                                        FeeScope.PRINCIPAL));
            }
            if (loanFee.getLoanRiskFee() != null) {
                mergedConfig.setLoanRiskFee(mergeFee(mergedConfig.getLoanRiskFee(),
                                                     loanFee.getLoanRiskFee(),
                                                     FeeScope.PRINCIPAL));
            }
        }
        return mergedConfig;
    }

    /**
     * copy FeeConfig
     *
     * @param config
     * @return
     */
    public static FeeConfig copyOf(FeeConfig config) {
        return SerializationUtils.clone(config);
    }

    /**
     * 是否是提前还款
     *
     * @param config
     * @param repayment
     * @return
     */
    public static boolean isValidAdvanceRepay(FeeConfig config, Repayment repayment) {
        return repayment.getDueDate().isAfter(LocalDate.now().plusDays(config.getMinDaysForAdvanceRepay()));
    }
}
