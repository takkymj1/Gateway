/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.Fee;
import com.creditcloud.config.FeeConfig;
import static com.creditcloud.config.enums.FeePeriod.DAILY;
import static com.creditcloud.config.enums.FeePeriod.SINGLE;
import static com.creditcloud.config.enums.FeeScope.BOTH;
import static com.creditcloud.config.enums.FeeScope.INTEREST;
import static com.creditcloud.config.enums.FeeScope.PRINCIPAL;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.OverduePenalty;
import java.math.BigDecimal;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public class FeeUtils {

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
                return fee.getFixed();
            case FLOATING:
                return amount.multiply(fee.getRate());
            case BOTH:
                return amount.multiply(fee.getRate()).add(fee.getFixed());
        }
        return BigDecimal.ZERO;
    }

    /**
     * 计算欠款的逾期费用
     *
     * @param config
     * @param loanRepay
     * @return
     */
    public static OverduePenalty overdueFee(FeeConfig config, LoanRepayment loanRepay) {
        if (loanRepay == null) {
            return OverduePenalty.NONE;
        }
        if (LocalDate.now().compareTo(loanRepay.getRepayment().getDueDate()) <= 0) {
            return OverduePenalty.NONE;
        }
        //计算天数
        long nowTime = LocalDate.now().toDate().getTime();
        long dueTime = loanRepay.getRepayment().getDueDate().toDate().getTime();
        BigDecimal days = BigDecimal.valueOf((nowTime - dueTime) / DateUtils.MILLIS_PER_DAY);

        /**
         * 逾期管理费计算
         */
        BigDecimal overdueAmount = BigDecimal.ZERO;
        Fee overdueFee = config.getLoanOverdueFee();
        if (overdueFee != null) {
            switch (overdueFee.getScope()) {
                case INTEREST:
                    overdueAmount = loanRepay.getRepayment().getAmountInterest();
                    break;
                case PRINCIPAL:
                    overdueAmount = loanRepay.getRepayment().getAmountPrincipal();
                    break;
                case BOTH:
                    overdueAmount = loanRepay.getRepayment().getAmount();
                    break;
            }
            switch (overdueFee.getPeriod()) {
                case DAILY:
                    overdueAmount = FeeUtils.calculate(overdueFee, overdueAmount).multiply(days).setScale(2, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    overdueAmount = FeeUtils.calculate(overdueFee, overdueAmount).setScale(2, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    throw new IllegalArgumentException(String.format("Illegal argument {} for overdue fee", overdueFee.getPeriod()));
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
                    penaltyAmount = loanRepay.getRepayment().getAmountInterest();
                    break;
                case PRINCIPAL:
                    penaltyAmount = loanRepay.getRepayment().getAmountPrincipal();
                    break;
                case BOTH:
                    penaltyAmount = loanRepay.getRepayment().getAmount();
                    break;
            }
            switch (penaltyFee.getPeriod()) {
                case DAILY:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, penaltyAmount).multiply(days).setScale(2, NumberConstant.ROUNDING_MODE);
                    break;
                case SINGLE:
                    penaltyAmount = FeeUtils.calculate(penaltyFee, penaltyAmount).setScale(2, NumberConstant.ROUNDING_MODE);
                    break;
                default:
                    //逾期类罚息只可能是上两种
                    throw new IllegalArgumentException(String.format("Illegal argument {} for penalty fee", penaltyFee.getPeriod()));
            }
        }

        return new OverduePenalty(overdueAmount, penaltyAmount);
    }
}
