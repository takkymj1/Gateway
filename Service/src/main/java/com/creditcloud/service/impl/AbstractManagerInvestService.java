/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.service.impl;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.AdvanceRepayDetail;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanInvestStatistics;
import com.creditcloud.model.loan.OverdueRepayDetail;
import com.creditcloud.model.loan.RepayDetail;
import com.creditcloud.model.loan.SettleLoanResult;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.ReferralUser;
import com.creditcloud.service.ManagerInvestService;
import com.creditcloud.service.model.DisburseInfo;
import com.creditcloud.service.model.RepayInfo;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author peili
 */
public class AbstractManagerInvestService implements ManagerInvestService {

    @Override
    public PagedResult<Invest> listInvestbyUser(String clientCode, String userId, PageInfo info, InvestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Invest> listInvestByLoan(String clientCode, String loanId, PageInfo info, InvestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countInvestByLoan(String clientCode, String loanId, InvestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyLoanStatus(String clientCode, String loanId, LoanStatus status, List<LoanStatus> currentStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SettleLoanResult settleLoan(String clientCode, Loan loan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postSettle(String clientCode, Loan loan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelFailedLoan(String clientCode, Loan loan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelScheduledLoan(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanInvestStatistics getLoanInvestStatistics(String clientCode, String userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public Map<String, Integer> getOpenLoanBidNumber(String clientCode) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Map<String, Integer> getOpenLoanBalance(String clientCode) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Loan getOpenLoanById(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelInvest(String clientCode, String investId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invest getInvestById(String clientCode, String investId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<ReferralUser> listByReferral(String clientCode, String userId, Date from, Date to, PageInfo pageInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InvestRepayment> listRepayByInvest(String clientCode, String investId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean repayLoan(String clientCode, RepayInfo repayInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean disburseLoan(String clientCode, DisburseInfo disburseInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepayDetail getRepayDetail(String clientCode, RepayInfo repayInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OverdueRepayDetail getOverdueRepayDetail(String clientCode, RepayInfo repayInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdvanceRepayDetail getAdvanceRepayDetail(String clientCode, RepayInfo repayInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepayDetail getDisburseDetail(String clientCode, DisburseInfo disburseInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * ****************client scoped methods*****************
     */
    @Override
    public Invest getInvestByLoanAndUserId(String clientCode, String loanId, String userId, InvestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelLoan(String clientCode, Loan loan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean preRepayLoan(String clientCode, RepayInfo repayInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

