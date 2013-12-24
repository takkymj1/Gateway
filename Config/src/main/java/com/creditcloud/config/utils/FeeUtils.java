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
import com.creditcloud.model.loan.OverduePenalty;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.util.logging.Logger;
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
     * @param repayment
     * @return
     */
    public static OverduePenalty overdueFee(FeeConfig config, Repayment repayment) {
        if (repayment == null) {
            return OverduePenalty.NONE;
        }
        if (LocalDate.now().compareTo(repayment.getDueDate()) <= 0) {
            return OverduePenalty.NONE;
        }
        //计算天数
        long nowTime = LocalDate.now().toDate().getTime();
        long dueTime = repayment.getDueDate().toDate().getTime();
        BigDecimal days = BigDecimal.valueOf((nowTime - dueTime) / DateUtils.MILLIS_PER_DAY);

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
                    logger.warning(String.format("Illegal argument %s for penalty fee. only DAILY and SINGLE allowed", penaltyFee.getPeriod()));
            }
        }

        return new OverduePenalty(overdueAmount, penaltyAmount);
    }
}
