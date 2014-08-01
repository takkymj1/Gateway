/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.enums.loan.DisburseType;
import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.loan.AdvanceRepayDetail;
import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.OverdueRepayDetail;
import com.creditcloud.model.loan.RepayDetail;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService {

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
     * @param repayDetails
     * @param type                  目前只有提前还款用到此参数,也将用于逾期违约等还款处理
     * @param advanceRepayWhenUndue 如果未到还款日还款是否按照提前还款流程走，false则按正常还款流程
     * @return
     */
    boolean repayLoan(String clientCode, Map<String, Object> repayDetails, RepayType type, boolean advanceRepayWhenUndue);

    /**
     * 商户垫付支付
     *
     * @param clientCode
     * @param loanRepay
     * @param type
     * @return
     */
    boolean disburseLoan(String clientCode, LoanRepayment loanRepay, DisburseType type);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算未还款状态的
     *
     * @param clientCode
     * @param loanRepay
     * @return
     */
    RepayDetail getRepayDetail(String clientCode, LoanRepayment loanRepay);

    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差<p>
     * 只计算逾期和违约状态的
     *
     *
     * @param clientCode
     * @param loanRepay
     * @return
     */
    OverdueRepayDetail getOverdueRepayDetail(String clientCode, LoanRepayment loanRepay);

    /**
     * 提前还款详情，一般与getRepayDetail返回内容相同，对于收取提前还款违约金的客户有所不同
     *
     * @param clientCode
     * @param repayDetails
     * @param type
     * @return
     */
    AdvanceRepayDetail getAdvanceRepayDetail(String clientCode, Map<String, Object> repayDetails, RepayType type);

    /**
     * 垫付明细
     *
     * @param clientCode
     * @param loanRepay
     * @param type
     * @return
     */
    RepayDetail getDisburseDetail(String clientCode, LoanRepayment loanRepay, DisburseType type);

}
