/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.AdvanceRepayDetail;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.OverdueRepayDetail;
import com.creditcloud.model.loan.RepayDetail;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.service.model.DisburseInfo;
import com.creditcloud.service.model.RepayInfo;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService extends InvestRepayQueryService{

    boolean addNew(InvestRepayment repay);

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
     * 根据dueDate统计InvestRepayment之和
     * 
     * @param userId
     * @param from
     * @param to
     * @param statusList
     * @return 
     */
    int countByIntervalAndStatus(String userId, LocalDate from, LocalDate to, List<RepaymentStatus> statusList);
    
    
    /**
     * 根据dueDate统计InvestRepayment amount之和
     * 
     * @param userId
     * @param repayType
     * @param from
     * @param to
     * @param statusList
     * @return 
     */
    BigDecimal sumByIntervalAndStatus(String userId,RepayType repayType, LocalDate from, LocalDate to , List<RepaymentStatus> statusList);
    
}
