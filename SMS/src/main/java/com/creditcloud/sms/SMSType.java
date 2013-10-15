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
    NOTIFICATION_LOANREQUEST_STATUS("notification.loanrequest.status");

    private final String key;

    private SMSType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}