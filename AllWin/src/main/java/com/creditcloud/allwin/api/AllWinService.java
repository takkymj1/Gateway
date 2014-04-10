package com.creditcloud.allwin.api;

import com.creditcloud.allwin.model.CheckApply;
import com.creditcloud.allwin.model.ContractApply;
import com.creditcloud.allwin.model.CreateApply;
import com.creditcloud.allwin.model.CreditReport;
import com.creditcloud.allwin.model.LoanCreditor;
import com.creditcloud.allwin.model.LoanOverdue;
import com.creditcloud.allwin.model.PatchCreditor;
import com.creditcloud.allwin.model.PatchOverdue;
import javax.ejb.Remote;

/**
 * 安融惠众的的服务访问接口,各个接口返回征信报告，如果CreditReport为null，则出现了异常
 *
 * @author sobranie
 */
@Remote
public interface AllWinService {

    /**
     *
     * 贷款申请
     * <br>向lcsp端导入新的申请数据,发起相关借款人的信用报告查询
     * <br>
     * 该接口调用需注意以下几点：
     * <p>
     * 1.loanMoney(申请金额)必须大于100.0
     * <p>
     * 2. applyDate(申请日期)不能大于上报日期
     * <p>
     * 3. applyId（申请编码）必须是唯一的。如果系统内存在重复的数据，如果尚未审批，则覆盖旧的申请。
     * 如果已经审批，审批结果为审批通过/审批取消/客户取消，则本次申请失败，不会被接受。
     *
     * @param createApply
     * @return 征信报告
     */
    public CreditReport createApply(CreateApply createApply);

    /**
     * 提交贷款审核信息
     * <br> 向lcsp端导入相关贷款申请的审批结果 调用该接口需注意以下：
     * <p>
     * 1. applyId(申请编号)必须在系统内存在
     * <p>
     * 2. 审批日期不能大于数据提交日期
     *
     * @param chechApply
     * @return 征信报告
     */
    public CreditReport checkApply(CheckApply chechApply);

    /**
     * 提交贷款合同数据
     *
     * <br>成功调用该接口需要注意：
     * <p>
     * 1. 所有的字段都是必须的，除了backMoney（应还款总数, 应还款总额可以不填写,但是如果填写了,那么不能小于loanMoney（贷款金额）
     * <p>
     * 2. 系统内必须存在applyId所对应的借款申请,且此笔申请审批状态为'审批通过'，且此笔申请在系统内不存在对应的合同信息.
     * <p>
     * 3. loanAccount(合同编号)所对应的合同在系统内不存在.
     * <p>
     * 4. creditStartDate(借款日期)不能大于数据提交日期.
     *
     * @param contractApply
     * @return 征信报告
     */
    public CreditReport contractApply(ContractApply contractApply);

    /**
     *
     * 提交贷款债券信息 <br> 每笔贷款的整个正常还款过程中,每3个月更新一次贷款的相关信息
     * <br>向lcsp端导入新的债权数据,发起相关借款人的信用报告查询
     * <br> 调用该接口需注意：
     * <p>
     * 1.
     * loanAccount(合同编号)和isClear（是否结清）是必输的。nbsMoney（未偿还本金），nbMoney（未偿还总金额），cleanDate（结清日期）是非必输的。
     * <p>
     * 2. loanAccount对应的合同信息必须在存在，且未结清
     * <p>
     * 3. 如果isClear==1的话，nbsMoney和nbMoney如果有数值，必须为0. isClear 符合：1. 结清， 0： 未结清
     * <p>
     * cleanDate如果有值，不能大于数据提交日期
     * <p>
     * nbsMoney和nbMoney有值的话，nbsMoney<=nbMoney
     *
     *
     * @param loanCreditor
     * @return 征信报告
     */
    public CreditReport loanCreditor(LoanCreditor loanCreditor);

    /**
     * 提交贷款逾期数据
     * <br>
     * 向lcsp端导入新的逾期数据,发起相关借款人的信用报告查询
     * <br>向lcsp端导入新的逾期数据,发起相关借款人的信用报告查询
     * <p>
     * 调用此接口需注意：
     * <p>
     * 1. 所有字段必输， 除了overdueEndDate（逾期截止日期）。
     * <p>
     * 2.loanAccount对应的合同信息在系统内存在，且未结清
     * <p>
     * 3. overDueStartDate 必须大于creditStartDate(合同借款日期)
     * <p>
     * 4. overDueEndDate(逾期截止日期)如果没有值,默认此笔借款至今还在逾期中.如果有值,则系统认为此笔借款逾期已经结束.
     * <p>
     * 5. overDueEndDate > overDueStartDate
     *
     *
     * @param loanOverdue
     * @return 征信报告
     */
    public CreditReport loanOverdue(LoanOverdue loanOverdue);

    /**
     * 补录债券数据
     * <br>向lcsp端导入新的债权数据,发起相关借款人的信用报告查询
     *
     *
     * @param patchCreditor
     * @return
     */
    public CreditReport patchCreditor(PatchCreditor patchCreditor);

    /**
     * 补录逾期信息
     * <br>调用信息补录逾期接口传递贷款逾期信息
     *
     * @param patchOverdue
     * @return
     */
    public CreditReport patchOverdue(PatchOverdue patchOverdue);

}
