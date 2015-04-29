/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRepayService extends LoanRepayQueryService, LoanRepayStatService {

    public LoanRepayment find(String id);

    public void addNew(LoanRepayment repay);

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
    
    public boolean preRepay(String loanId, BigDecimal repayAmount, RealmEntity repaySource);
    
    public LoanRepayment getFirstByLoanAndStatus(String loanId, RepaymentStatus status);
    
    public LoanRepayment getLastByLoanAndStatus(String loanId, RepaymentStatus status);
    
}
