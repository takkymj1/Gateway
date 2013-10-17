/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;

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
    USER_LIST("列出用户"),
    USER_DETAIL("查看用户详情,包括用户的各种认证信息"),
    USER_ALTER("添加更改用户信息,包括上传用户认证信息"),
    USER_DELETE("删除用户"),
    /**
     * 员工相关权限
     */
    EMPLOYEE_LIST("列出员工"),
    EMPLOYEE_DETAIL("查看员工详情"),
    EMPLOYEE_ALTER("添加更改员工信息,包括员工的角色和权限"),
    EMPLOYEE_DELETE("删除员工"),
    /**
     * 贷款申请相关权限
     */
    LOANREQUEST_LIST("列出贷款申请"),
    LOANREQUEST_DETAIL("查看贷款申请详情,包括申请的各种认证信息"),
    LOANREQUEST_ALTER("更改贷款申请信息,包括上传申请认证信息"),
    /**
     * 调控贷款申请的流程<p>
     * 例如申请提交后先让初审和(风控)人员审核贷款和客户信息<p>
     * 根据初审意见再給外勤人员分配实地勘察任务,外勤人员完成任务后任务评审通过.<p>
     * 再推进流程让风控人员介入评审制定授信额度等<p>
     * 出现逾期和违约时再分配催款任务让外勤人员介入
     */
    LOANREQUEST_REVIEW("贷款申请评审"),
    LOANREQUEST_APPROVE("批准贷款申请"),
    LOANREQUEST_REJECT("拒绝贷款申请,添加审批意见后打回用户"),
    /**
     * 贷款相关权限
     */
    LOAN_SPLIT("贷款申请批准后拆标"),
    LOAN_SCHEDULE("拆标后发标"),
    LOAN_SETTLE("贷款满标后审核并结算"),
    /**
     * 任务相关权限
     */
    TASK_ASSIGN("创建和分配任务"),
    TASK_UNDERTAKE("承接和执行任务"),
    TASK_REVIEW("评审任务");

    private final String key;

    Privilege(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
