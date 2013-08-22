/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.RealName;
import javax.validation.constraints.NotNull;

/**
 * 银行账号
 *
 * @author rooseek
 */
public class BankAccount extends BaseObject {

    /**
     * 开户人
     */
    @RealName
    private String name;

    /**
     * 开户银行:中国工商银行
     */
    @NotNull
    private String bank;

    /**
     * 开户行所在地:北京市西城区长安街12号
     */
    @NotNull
    private String location;

    /**
     * 开户支行:工行北京分行海淀支行
     */
    @NotNull
    private String branch;

    /**
     * 账号
     */
    @NotNull
    private String account;

    public BankAccount(String name, String bank, String location, String branch, String account) {
        this.name = name;
        this.bank = bank;
        this.location = location;
        this.branch = branch;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public String getLocation() {
        return location;
    }

    public String getBranch() {
        return branch;
    }

    public String getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
