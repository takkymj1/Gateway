/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.sms;

/**
 *
 * @author sobranie
 */
public enum SMSType {

    /**
     * 注册 CreditMarket 的手机激活码
     */
    CONFIRM_CREDITMARKET_REGISTER("confirm.creditmarket.register"),
    /**
     * CreditMarket用户账号绑定手机
     */
    CONFIRM_CREDITMARKET_AUTHENTICATE_MOBILE("confirm.creditmarket.authenticate.mobile"),
    /**
     * CreditMarke中用戶更改密码发送确认码
     */
    CONFIRM_CREDITMARKET_CHANGE_LOGIN_PASSWORD("confirm.creditmarket.change.login.password"),
    /**
     * CreditMarket中用户忘记密码时候重设密码
     */
    CREDITMARKET_RESET_PASSWORD("creditmarket.reset.password"),
    /**
     * CreditManager 内 Message
     */
    CREDITMANAGER_MESSAGE("creditmanager.message"),
    /**
     * CreditManager 中给员工重置密码.
     * 
     * 包含client.shortName, new password
     */
    CREDITMANAGER_RESET_PASSWORD("creditmanager.reset.password"),
    /**
     * CreditManager 内给新建员工的短信，包含初始密码. 参数为：client.name, employee.loginName,
     * password
     */
    NOTIFICATION_CREDITMANAGER_EMPLOYEE_CREATED("notification.creditmanager.employee.created"),
    /**
     * CreditMarket 内给新建用户的短信，包含初始的随机密码，适用于后台开户. 参数为：client.name,
     * user.loginName, password
     */
    NOTIFICATION_CREDITMARKET_USER_CREATED("notification.creditmarket.user.created"),
    /**
     * LoanRequest 的 状态发生改变时给用户发送的提示信息.
     */
    NOTIFICATION_LOANREQUEST_STATUS("notification.loanrequest.status"),
    /**
     * Loan状态变化时发送给用户信息
     */
    NOTIFICATION_LOAN_STATUS("notification.loan.status"),
    /**
     * InvestRepay成功发生时发送给investor的提示信息.
     * 
     * 参数：loan.title, InvestRepayment.currentPeriod, InvestRepayment.repayAmount, client.name, client.helpPhone
     */
    NOTIFICATION_LOAN_REPAY("notification.loan.repay"),
    /**
     * Loan还清时发送给investor的提示信息.
     * 
     * 参数：loan.title, client.helpPhone
     */
    NOTIFICATION_LOAN_CLEARED("notification.loan.cleared"),
    /**
    * 用户提交取现申请，参数为 client.shortName, user.name, amount, supportPhone
    */
    NOTIFICATION_WITHDRAW_APPLY("notification.withdraw.apply");

    private final String key;

    private SMSType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}