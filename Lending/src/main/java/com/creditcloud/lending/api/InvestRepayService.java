/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.AdvanceRepayDetail;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.OverduePenalty;
import com.creditcloud.model.loan.OverdueRepayDetail;
import com.creditcloud.model.loan.RepayDetail;
import com.creditcloud.model.loan.Repayment;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.service.model.DisburseInfo;
import com.creditcloud.service.model.RepayInfo;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService extends InvestRepayQueryService {

    boolean addNew(InvestRepayment repay);

    /**
     * 更新还款计划</p>
     * TODO暂时只能更新金额部分
     *
     * @param investRepayId
     * @param repayment
     * @return
     */
    boolean updateRepayment(String investRepayId, Repayment repayment);

    public boolean markStatus(RepaymentStatus status, List<String> ids);

    public boolean markStatusByLoan(RepaymentStatus status,
                                    RepaymentStatus currentStatus,
                                    String loanId,
                                    int period);

    public boolean repay(String id, BigDecimal repayAmount, RealmEntity repaySource);
    
    /**
     * 债权转让全部转出后，更新债权人还款计划时使用
     * @param id
     * @param repayAmount
     * @param repaySource
     * @param status
     * @param repayment
     * @return 
     */
    public boolean creditAssignDeprecated(String id, BigDecimal repayAmount, RealmEntity repaySource, RepaymentStatus status, Repayment repayment);

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

    InvestRepayment getByInvestAndPeriod(String investId, int period);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算未还款状态的
     *
     * @param repayInfo
     * @return
     */
    RepayDetail getRepayDetail(RepayInfo repayInfo);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算逾期和违约状态的
     *
     *
     * @param repayInfo
     * @return
     */
    OverdueRepayDetail getOverdueRepayDetail(RepayInfo repayInfo);

    /**
     * 计算单笔invest repayment逾期相关费用
     *
     * @param investRepayId
     * @param feeConfig
     * @return null if invest repay not found
     */
    OverduePenalty getOverduePenalty(String investRepayId, FeeConfig feeConfig);

    /**
     * 提前还款详情，一般与getRepayDetail返回内容相同，对于收取提前还款违约金的客户有所不同
     *
     * @param repayInfo
     * @return
     */
    AdvanceRepayDetail getAdvanceRepayDetail(RepayInfo repayInfo);

    /**
     * 垫付明细
     *
     * @param disburseInfo
     * @return
     */
    RepayDetail getDisburseDetail(DisburseInfo disburseInfo);
    
    /**
     * 计算投资人的本金总和
     * @param investId
     * @param statusList
     * @return 
     */
    public BigDecimal sumPrincipalByInvest(String investId, List<RepaymentStatus> statusList);

    /**
     * 提前还款接口
     * @param investId
     * @param repayAmount
     * @param repaySource
     * @return
     */
    public boolean preRepay(String investId, BigDecimal repayAmount, RealmEntity repaySource);
}
