/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.common.entities.embedded.RealmEntity;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.RepayAmount;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService {

    boolean addNew(InvestRepayment repay);

    InvestRepayment getByInvestAndPeriod(String investId, int period);

    public List<InvestRepayment> listByInvest(String investId, List<RepaymentStatus> statusList);

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
     * TODO 因为回款可能会逾期，所以应该按照dueDate和实际repayDate来list，目前只按照dueDate来list
     *
     * @param userId
     * @param from
     * @param to
     * @return
     */
    public List<InvestRepayment> listByDate(String userId, Date from, Date to);

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
     * 用戶待收的贷款金额总和.
     *
     * 包括未到期、逾期以及违约总和
     *
     * @param userId
     * @return
     */
    public RepayAmount sumDueLoanRepayByUser(String userId);

    /**
     * 用戶逾期和违约的待收金额总和
     *
     * @param userId
     * @return
     */
    public RepayAmount sumOverdueLoanRepayByUser(String userId);

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
     * @param from
     * @param to
     * @param statusList
     * @return
     */
    public RepayAmount sumDueRepay(LocalDate from, LocalDate to, List<RepaymentStatus> statusList);

    public boolean markStatus(RepaymentStatus status, List<String> ids);

    public boolean markStatusByLoan(RepaymentStatus status,
                                    RepaymentStatus currentStatus,
                                    String loanId,
                                    int period);

    public boolean repay(String id, BigDecimal repayAmount, RealmEntity repaySource);

    /**
     * get first invest repayment by invest and status with ascending duedate
     *
     * @param investId
     * @param statusList
     * @return
     */
    public InvestRepayment getFirstByInvestAndStatus(String investId, List<RepaymentStatus> statusList);

    /**
     * get last invest repayment by invest and status with descending duedate
     *
     * @param investId
     * @param statusList
     * @return
     */
    public InvestRepayment getLastByInvestAndStatus(String investId, List<RepaymentStatus> statusList);

}
