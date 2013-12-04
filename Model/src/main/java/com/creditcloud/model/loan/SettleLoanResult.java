/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Market中贷款所有投标结算结果
 *
 * @author rooseek
 */
public class SettleLoanResult extends BaseObject {

    private static final long serialVersionUID = 20131204L;

    public static final SettleLoanResult FAIL = new SettleLoanResult(false, new HashMap<Integer, Repayment>());

    private final boolean success;

    /**
     * 根据所有invest还款计算的loan还款明细
     */
    private final Map<Integer, Repayment> repayments;

    public SettleLoanResult(boolean success, Map<Integer, Repayment> repayments) {
        this.success = success;
        this.repayments = repayments;
    }

    public boolean isSuccess() {
        return success;
    }

    public Map<Integer, Repayment> getRepayments() {
        return repayments;
    }
}
