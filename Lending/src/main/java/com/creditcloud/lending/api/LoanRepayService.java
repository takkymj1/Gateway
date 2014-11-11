/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.common.entities.embedded.RealmEntity;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRepayService extends LoanRepayQueryService {

    public LoanRepayment find(String id);

    public void addNew(LoanRepayment repay);

    public void update(LoanRepayment repay);

    /**
     * 还款
     *
     * @param repayId
     * @param repayAmount
     * @param repaySource
     * @return
     */
    public boolean repay(String repayId, BigDecimal repayAmount, RealmEntity repaySource);

    public boolean markStatus(RepaymentStatus status, String... ids);
}
