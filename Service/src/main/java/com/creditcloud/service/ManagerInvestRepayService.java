/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.service;

import com.creditcloud.model.loan.AdvanceRepayDetail;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.OverdueRepayDetail;
import com.creditcloud.model.loan.RepayDetail;
import com.creditcloud.service.model.DisburseInfo;
import com.creditcloud.service.model.RepayInfo;
import java.util.List;

/**
 *
 * @author peili
 */
interface ManagerInvestRepayService {
    
    /**
     * list InvestRepayment by invest id
     *
     * @param clientCode
     * @param investId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<InvestRepayment> listRepayByInvest(String clientCode, String investId);

    /**
     * repayment of a loan, set repayment status and generate fund record
     *
     * @param clientCode
     * @param repayInfo
     * @return
     */
    boolean repayLoan(String clientCode, RepayInfo repayInfo);
    
    boolean preRepayLoan(String clientCode, RepayInfo repayInfo);

    /**
     * 商户垫付支付
     *
     * @param clientCode
     * @param disburseInfo
     * @return
     */
    boolean disburseLoan(String clientCode, DisburseInfo disburseInfo);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算未还款状态的
     *
     * @param clientCode
     * @param repayInfo
     * @return
     */
    RepayDetail getRepayDetail(String clientCode, RepayInfo repayInfo);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算逾期和违约状态的
     *
     *
     * @param clientCode
     * @param repayInfo
     * @return
     */
    OverdueRepayDetail getOverdueRepayDetail(String clientCode, RepayInfo repayInfo);

    /**
     * 提前还款详情，一般与getRepayDetail返回内容相同，对于收取提前还款违约金的客户有所不同
     *
     * @param clientCode
     * @param repayInfo
     * @return
     */
    AdvanceRepayDetail getAdvanceRepayDetail(String clientCode, RepayInfo repayInfo);

    /**
     * 垫付明细
     *
     * @param clientCode
     * @param disburseInfo
     * @return
     */
    RepayDetail getDisburseDetail(String clientCode, DisburseInfo disburseInfo);

}
