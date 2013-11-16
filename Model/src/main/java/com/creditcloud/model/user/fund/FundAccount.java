/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 资金账号
 *
 * @author rooseek
 */
@XmlRootElement
public class FundAccount extends BaseObject {

    private static final long serialVersionUID = 20131117L;

    private String id;

    @NotNull
    private String userId;

    @NotNull
    private BankAccount account;

    /**
     * 是否已经验证通过
     */
    private boolean valid;

    /**
     * 是否为首选默认银行账号,充值提现时将显示在第一个
     */
    private boolean defaultAccount;

    public FundAccount() {
    }

    public FundAccount(String id, String userId, BankAccount account, boolean valid, boolean defaultAccount) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.valid = valid;
        this.defaultAccount = defaultAccount;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isDefaultAccount() {
        return defaultAccount;
    }

    public void setDefaultAccount(boolean defaultAccount) {
        this.defaultAccount = defaultAccount;
    }
}
