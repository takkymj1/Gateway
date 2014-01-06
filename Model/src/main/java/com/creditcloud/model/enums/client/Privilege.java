/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;
import com.creditcloud.model.enums.Realm;

/**
 * 员工权限集合
 *
 * @author sobranie
 *
 */
public enum Privilege implements BaseEnum {

    /**
     * 用户相关权限
     */
    USER_LIST("列出用户", Realm.USER, "用户相关权限"),
    USER_DETAIL("查看用户详情,包括用户的各种认证信息", Realm.USER, "用户相关权限"),
    USER_ALTER("添加更改用户信息,包括上传用户认证信息", Realm.USER, "用户相关权限"),
    USER_DELETE("删除用户", Realm.USER, "用户相关权限"),
    /**
     * 员工相关权限
     */
    EMPLOYEE_LIST("列出员工", Realm.EMPLOYEE, "员工相关权限"),
    EMPLOYEE_DETAIL("查看员工详情", Realm.EMPLOYEE, "员工相关权限"),
    EMPLOYEE_ADD("添加员工记录", Realm.EMPLOYEE, "员工相关权限"),
    EMPLOYEE_ALTER("更改员工信息", Realm.EMPLOYEE, "员工相关权限"),
    EMPLOYEE_DELETE("删除员工", Realm.EMPLOYEE, "员工相关权限"),
    EMPLOYEE_GRANT("调整员工权限", Realm.EMPLOYEE, "员工相关权限"),
    /**
     * 组织结构相关
     */
    ROLE_VIEW("查看角色权限配置", Realm.ROLE, "组织结构相关"),
    ROLE_ASSIGN("分配角色权限", Realm.ROLE, "组织结构相关"),
    /**
     * 借款申请相关权限
     */
    LOANREQUEST_LIST("列出借款申请", Realm.LOANREQUEST, "借款申请相关权限"),
    LOANREQUEST_DETAIL("查看借款申请详情，包括申请的各种认证信息", Realm.LOANREQUEST, "借款申请相关权限"),
    LOANREQUEST_ALTER("更改借款申请信息，包括上传申请认证信息", Realm.LOANREQUEST, "借款申请相关权限"),
    LOANREQUEST_QUICK("快速录入借款申请，包括用户及其银行卡", Realm.LOANREQUEST, "借款申请相关权限"),
    /**
     * 调控借款申请的流程<p>
     * 例如申请提交后先让初审和(风控)人员审核借款和客户信息<p>
     * 根据初审意见再給外勤人员分配实地勘察任务,外勤人员完成任务后任务评审通过.<p>
     * 再推进流程让风控人员介入评审制定授信额度等<p>
     * 出现逾期和违约时再分配催款任务让外勤人员介入
     */
    LOANREQUEST_REVIEW("借款申请评审", Realm.LOANREQUEST, "借款申请相关权限"),
    LOANREQUEST_APPROVE("批准借款申请", Realm.LOANREQUEST, "借款申请相关权限"),
    LOANREQUEST_REJECT("拒绝借款申请，添加审批意见后打回用户", Realm.LOANREQUEST, "借款申请相关权限"),
    /**
     * 借款相关权限
     */
    LOAN_DETIAL("借款详情", Realm.LOAN, "借款相关权限"),
    LOAN_LIST("列出借款", Realm.LOAN, "借款相关权限"),
    LOAN_SPLIT("借款申请批准后拆标", Realm.LOAN, "借款相关权限"),
    LOAN_SCHEDULE("拆标后发标", Realm.LOAN, "借款相关权限"),
    LOAN_SETTLE("借款满标流标后审核", Realm.LOAN, "借款相关权限"),
    POST_LOAN_MANAGE("贷后管理", Realm.LOAN, "借款相关权限"),
    LOAN_REPAY("还款", Realm.LOAN, "借款相关权限"),
    LOAN_DISBURSE("垫付", Realm.LOAN, "借款相关权限"),
    /**
     * 任务相关权限
     */
    TASK_ASSIGN("创建和分配任务", Realm.TASK, "任务相关权限"),
    TASK_UNDERTAKE("承接和执行任务", Realm.TASK, "任务相关权限"),
    TASK_REVIEW("评审任务", Realm.TASK, "任务相关权限"),
    /**
     * 资金相关权限
     */
    FUND_VIEW("查看平台资金", Realm.FUND, "资金相关权限"),
    FUND_RECONCILIATION("商户对账", Realm.FUND, "资金相关权限"),
    CLIENT_CASH_AUDIT("商户提现审批", Realm.FUND, "资金相关权限"),
    USER_CASH_AUDIT("用户提现审批", Realm.FUND, "资金相关权限"),
    FUND_DEPOSIT("商户充值", Realm.FUND, "资金相关权限"),
    FUND_WITHDRAW("商户提现", Realm.FUND, "资金相关权限"),
    CLIENT_DIRECT_WITHDRAW("商户快速提现", Realm.FUND, "资金相关权限"),
    USER_DIRECT_WITHDRAW("用户快速提现", Realm.FUND, "资金相关权限"),
    CLIENT_TRANSFER("商户调账", Realm.FUND, "资金相关权限"),
    USER_TRANSFER("商户向用户转账", Realm.FUND, "资金相关权限"),
    USER_TRANSFER_AUDIT("商户向用户转账审批", Realm.FUND, "资金相关权限"),
    /**
     * 合同相关权限
     */
    CONTRACT_VIEW("查看借款合同", Realm.CONTRACT, "合同相关权限");

    private final String key;

    private final Realm realm;

    private final String description;

    Privilege(String key, Realm realm, String description) {
        this.key = key;
        this.realm = realm;
        this.description = description;
    }

    @Override
    public String getKey() {
        return key;
    }

    public Realm getRealm() {
        return realm;
    }

    public String getDescription() {
        return description;
    }
}
