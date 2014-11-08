/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.impl;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepayLoanResult;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.RepayAmount;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.service.ManagerLoanRepayService;
import com.creditcloud.service.model.LoanRepaymentCorrection;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public class AbstractManagerLoanRepayService implements ManagerLoanRepayService {

    @Override
    public PagedResult<LoanRepayment> listRepayByStatus(String clientCode, String userId, PageInfo pageInfo, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRepayment> listOverdueRepay(String clientCode, LocalDate today, PageInfo pageInfo, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRepayment> listOverdueRepayByUser(String clientCode, String userId, LocalDate today, PageInfo pageInfo, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRepayment> listDueRepay(String clientCode, LocalDate from, LocalDate to, PageInfo pageInfo, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult<LoanRepayment> listDueRepayByUser(String clientCode, String userId, LocalDate from, LocalDate to, PageInfo pageInfo, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepayAmount sumDueRepay(String clientCode, LocalDate from, LocalDate to, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepayAmount sumOverdueRepay(String clientCode, LocalDate today, RepaymentStatus... status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoanRepayment> listRepayByLoan(String clientCode, String loanId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanRepayment getRepayById(String clientCode, String repaymentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean markStatus(String clientCode, RepaymentStatus status, String... repayIds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean correctOnCreditAssign(String clientCode, List<LoanRepaymentCorrection> corrections) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepayLoanResult repayLoan(String clientCode, String userId, String repayId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countByUserAndStatus(String clientCode, String userId, RepaymentStatus... statusList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
