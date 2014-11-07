/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.impl;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanPurpose;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanFee;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.LoanReward;
import com.creditcloud.model.loan.LoanStatistics;
import com.creditcloud.model.loan.SubmitRequestResult;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.service.ManagerLoanService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rooseek
 */
public class AbstractManagerLoanService implements ManagerLoanService {

    @Override
    public boolean markLoanStatus(String clientCode, String loanId, LoanStatus status, int bidNumber, int bidAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loan getLoanById(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Loan> listLoanByUser(String clientCode, String userId, PageInfo pageInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Loan> listLoanByUser(String clientCode, String userId, Date from, Date to, PageInfo pageInfo, LoanStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Loan> listLoanByRequest(String clientCode, String requestId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Loan> listLoanByStatus(String clientCode, PageInfo pageInfo, LoanStatus... statusList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Loan> listLoanByStatusAndMethod(String clientCode, PageInfo pageInfo, List<LoanStatus> statusList, List<RepaymentMethod> methodList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<Loan> listLoanByStatusAndPurpose(String clientCode, PageInfo pageInfo, List<LoanStatus> statusList, List<LoanPurpose> purposeList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Loan> listPersonalLoanByStatus(String clientCode, LoanStatus... statusList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanStatistics getLoanStatistics(String clientCode, String userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoanReward> listLoanReward(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Loan> listByCorporationUser(String clientCode, RealmEntity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SubmitRequestResult submitLoanRequest(String clientCode, LoanRequest loanRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanRequest getRequestById(String clientCode, String requestId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRequest> listRequestByUserAndStatus(String clientCode, String userId, PageInfo pageInfo, LoanRequestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRequest> listRequestByEmployeeAndStatus(String clientCode, String employeeId, PageInfo pageInfo, LoanRequestStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateLoanRequest(String clientCode, LoanRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanFee getLoanFee(String clientCode, String requestId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanFee getLoanFeeByLoanId(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * ****************client scoped methods*****************
     */
    @Override
    public PagedResult<Loan> listLoanByComplexCondition(String clientCode, List<RepaymentMethod> methodList, int minRate, int maxRate, int minDuration, int maxDuration, PageInfo pageInfo, List<LoanStatus> statusList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
