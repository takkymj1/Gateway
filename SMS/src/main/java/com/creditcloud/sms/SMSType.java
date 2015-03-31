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
     * CreditMarket中充值的短信确认码
     */
    CONFIRM_CREDITMARKET_DEPOSIT("confirm.creditmarket.deposit"),
    /**
     * CreditMarket中提现的短信确认码
     */
    CONFIRM_CREDITMARKET_WITHDRAW("confirm.creditmarket.withdraw"),
    /**
     * CreditMarket中投标的短信确认码
     */
    CONFIRM_CREDITMARKET_TENDER("confirm.creditmarket.tender"),
    /**
     * CreditMarket中用户忘记密码时候重设密码
     */
    CREDITMARKET_RESET_PASSWORD("creditmarket.reset.password"),
    /**
     * CreditMarket中仅发送验证码
     */
    CREDITMARKET_CAPTCHA("creditmarket.captcha"),
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
     * 参数：loan.title, InvestRepayment.currentPeriod,
     * InvestRepayment.repayAmount, client.name, client.helpPhone
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
    NOTIFICATION_WITHDRAW_APPLY("notification.withdraw.apply"),
    /**
     * 用户还款提前10天短信告知提示
     */
    POSTLOAN_REPAYMENT_BEFORETEN_REMIND("postloan.repayment.beforeten.remind"),
    /**
     * 用户申请债权转让
     */
    NOTIFICATION_CREDITMARKET_CREDITASSIGN("notification.creditmarket.creditassign"),
    /**
     * 投资成功提示
     */
    NOTIFICATION_CREDITMARKET_INVEST("notification.creditmarket.invest"),
    /**
     * 结息日提示
     */
    NOTIFICATION_CREDITMARKET_SETTLEINTEREST("notification.creditmarket.settleinterest"),
    /**
     * 用户邀请提示
     */
    NOTIFICATION_CREDITMARKET_USERINVITATION("notification.creditmarket.userinvitation"),
    /**
     * 充值提示
     */
    NOTIFICATION_CREDITMARKET_CHARGE("notification.creditmarket.charge"),
    /**
     * 基金申购时提示
     */
    NOTIFICATION_CREDITMARKET_PURCHASE("notification.creditmarket.purchase"),
    /**
     * 不使用短信模板
     */
    WITHOUT_TEMPLATE("");

    private final String key;

    private SMSType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
