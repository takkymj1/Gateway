/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.ElementCount;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.Repayment;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestService extends InvestRepayService {

    /**
     * list Invest by user Id
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<Invest> listInvestbyUserId(String clientCode, String userId, PageInfo info);

    /**
     * list Invest by loan Id
     *
     * @param clientCode
     * @param loanId
     * @param info
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<Invest> listInvestByLoanId(String clientCode, String loanId, PageInfo info);

    /**
     * notify a status of loan to all its invests
     *
     * @param clientCode
     * @param loanId
     * @param status
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void notifyLoanStatus(String clientCode, String loanId, LoanStatus status);

    /**
     * settle a loan , generate related invest repayment
     *
     * @param clientCode
     * @param loanId
     * @return 根据贷款所有投资金额生成的还款计划，用于更新贷款的LoanRepayment中的Repayment
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<ElementCount<Repayment>> settleLoan(String clientCode, Loan loan);

    /**
     * repayment of a loan, set repayment status and generate fund record
     *
     * @param clientCode
     * @param loanRepay
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void repayLoan(String clientCode, LoanRepayment loanRepay);

    /**
     * query the bid progress about a loan
     *
     * @param clientCode
     * @param loanId
     * @return left balance of a loan
     */
    int getLoanBalance(String clientCode, String loanId);
}
