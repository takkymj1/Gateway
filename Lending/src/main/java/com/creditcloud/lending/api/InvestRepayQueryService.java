/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.RepayAmount;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public interface InvestRepayQueryService {

    /**
     * TODO 因为回款可能会逾期，所以应该按照dueDate和实际repayDate来list，目前只按照dueDate来list
     *
     * @param userId
     * @param from   dueDate，应还款日期
     * @param to     dueDate，应还款日期
     * @return
     */
    public List<InvestRepayment> listByDate(String userId, Date from, Date to);

    public List<InvestRepayment> listByInvest(String investId, List<RepaymentStatus> statusList);

    /**
     * 按照投标invest和还款状态统计
     *
     * @param investId
     * @param statusList
     * @return
     */
    public int countByInvest(String investId, List<RepaymentStatus> statusList);

    /**
     * 根据贷款Id和第几期还款列出所有的InvestRepayment.
     *
     * @param loanId
     * @param period
     * @param statusList
     * @return
     */
    public List<InvestRepayment> listByLoanAndPeriodAndStatus(String loanId, int period, List<RepaymentStatus> statusList);

    /**
     * 列出特定状态的回款
     *
     * @param userId
     * @param statusList
     * @return
     */
    public List<InvestRepayment> listByStatus(String userId, List<RepaymentStatus> statusList);

    public int countByStatus(String userId, List<RepaymentStatus> statusList);

    /**
     * 根据状态加总统计用户的投资回款信息
     *
     * @param userId
     * @param statusList
     * @return
     */
    public RepayAmount sumRepayByUserAndStatus(String userId, List<RepaymentStatus> statusList);

    /**
     * 统计贷款的分期还款总和
     *
     * @param loanId
     * @return
     */
    public Map<Integer, com.creditcloud.model.loan.Repayment> sumRepaymentByLoan(String loanId);

    /**
     * 统计到today日期为止逾期和违约的金额<p>
     * 此方法功能LoanRepayService中已提供，且更高效<p>
     * 主要用來跟LoanRepayment做比对测试用
     *
     * @param today
     * @param statusList
     * @return
     */
    public RepayAmount sumOverdueRepay(LocalDate today, List<RepaymentStatus> statusList);

    /**
     * 统计一段时间内到期的还款总和
     * <p>
     * 此方法功能LoanRepayService中已提供，且更高效<p>
     * 主要用來跟LoanRepayment做比对测试用
     *
     * @param from       dueDate，应还款日期
     * @param to         dueDate，应还款日期
     * @param statusList
     * @return
     */
    public RepayAmount sumDueRepay(LocalDate from, LocalDate to, List<RepaymentStatus> statusList);



    public RepayAmount sumDueRepay(String userId,List<RepaymentStatus> statusList);

    public BigDecimal sumAlreadyAmount(String userId,List<RepaymentStatus> statusList);

    /**
     * 按照userId和实际repayDate来list
     *
     * @param userId
     * @param from     repayDate,实际回款日期
     * @param to       repayDate,实际回款日期
     * @param pageInfo
     * @return
     */
    public PagedResult<InvestRepayment> listByRepayDate(String userId, Date from, Date to, PageInfo pageInfo);

    /**
     * 根据dueDate统计InvestRepayment之和
     *
     * @param userId
     * @param from       dueDate，应还款日期
     * @param to         dueDate，应还款日期
     * @param statusList
     * @return
     */
    int countByUser(String userId, LocalDate from, LocalDate to, List<RepaymentStatus> statusList);

    /**
     * 根据dueDate统计InvestRepayment amount之和
     *
     * @param userId
     * @param repayType
     * @param from       dueDate，应还款日期
     * @param to         dueDate，应还款日期
     * @param statusList
     * @return
     */
    BigDecimal sumByUser(String userId, RepayType repayType, LocalDate from, LocalDate to, List<RepaymentStatus> statusList);
}
