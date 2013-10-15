/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRepayService {

    /**
     * list all repayment for a user by repayment status
     *
     * @param clientCode
     * @param userId
     * @param status
     * @param pageInfo
     * @return
     */
    PagedResult<LoanRepayment> listRepayByStatus(String clientCode, String userId, PageInfo pageInfo, RepaymentStatus... status);

    /**
     * 列出所有到today为止逾期或违约的LoanRepayment
     *
     * @param clientCode
     * @param today
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<LoanRepayment> listOverdueRepay(String clientCode, LocalDate today, PageInfo pageInfo);

    /**
     * 列出一段时间内到期的LoanRepayment
     *
     * @param client
     * @param from
     * @param to
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<LoanRepayment> listDueRepay(String clientCode,
                                            LocalDate from,
                                            LocalDate to,
                                            PageInfo pageInfo,
                                            RepaymentStatus... status);

    /**
     * list loan repayment by loanId
     *
     * @param clientCode
     * @param loanId
     * @return emptyList if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<LoanRepayment> listRepayByLoanId(String clientCode, String loanId);

    /**
     * get repayment by its id
     *
     * @param clientCode
     * @param repaymentId
     * @return
     */
    LoanRepayment getRepayById(String clientCode, String repaymentId);

    /**
     * 更新一组LoanRepayment,一般只会更新还款日期和还款状态
     *
     * @param clientCode
     * @param repayment
     * @return
     */
    boolean updateLoanRepayment(String clientCode, LoanRepayment... repayment);
}
