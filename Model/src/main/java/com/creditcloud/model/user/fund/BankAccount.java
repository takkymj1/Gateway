/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.BankAccountNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.enums.misc.Bank;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 * 银行账号
 *
 * @author rooseek
 */
@XmlRootElement
public class BankAccount extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    /**
     * 开户人
     */
    @RealName
    private String name;

    /**
     * 开户银行:中国工商银行
     */
    @NotNull
    private Bank bank;

    /**
     * 开户行所在地:北京市西城区长安街12号
     */
    private String location;

    /**
     * 开户支行:工行北京分行海淀支行
     */
    private String branch;

    /**
     * 账号
     */
    @BankAccountNumber
    private String account;

    @Getter
    @Setter
    private String province;

    @Getter
    @Setter
    private String city;

    public BankAccount() {
    }

    public BankAccount(String name, Bank bank, String location, String branch, String account) {
        this.name = name;
        this.bank = bank;
        this.location = location;
        this.branch = branch;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Bank getBank() {
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

    public void setAccount(String account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
