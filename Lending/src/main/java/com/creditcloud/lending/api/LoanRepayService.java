/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import org.joda.time.LocalDate;

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

    /**
     * hugang.liu 20150425 added
     * 根据loanId和当前时间count loanRepayment记录
     * @param loanId
     * @param today
     * @return
     */
    public int countDuedateByLoanId(String loanId, LocalDate today);

    /**
     * hugang.liu added 2015.4.28 过滤掉提前还款的项目
     * 按特定借款人在时间区间和还款状态列出一段时间内所有到期的LoanRepayment
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param status
     * @return
     */
    public PagedResult<LoanRepayment> listDueRepayNoPreRepay(LocalDate from, LocalDate to, PageInfo info, RepaymentStatus... status);

    public boolean preRepay(String loanId, BigDecimal repayAmount, RealmEntity repaySource);

    public com.creditcloud.model.loan.LoanRepayment getFirstByLoanAndStatus(String loanId, RepaymentStatus status);

    public com.creditcloud.model.loan.LoanRepayment getLastByLoanAndStatus(String loanId, RepaymentStatus status);

    int countOverdDueByLoanAndStatus(String loanId);
}
