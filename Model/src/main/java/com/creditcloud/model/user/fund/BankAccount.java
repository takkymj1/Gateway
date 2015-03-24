/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.BankAccountNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.model.enums.misc.Bank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 银行账号
 *
 * @author rooseek
 */
@AllArgsConstructor
@XmlRootElement
public class BankAccount extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    /**
     * 开户人
     */
    @Getter
    @Setter
    @RealName
    private String name;

    /**
     * 开户银行:中国工商银行
     */
    @Getter
    @Setter
    @NotNull
    private Bank bank;

    /**
     * 开户行所在地:北京市西城区长安街12号
     */
    @Getter
    @Setter
    private String location;

    /**
     * 开户支行:工行北京分行海淀支行
     */
    @Getter
    @Setter
    private String branch;

    /**
     * 账号
     */
    @Getter
    @Setter
    @BankAccountNumber
    private String account;

    /**
     * 账号所在省份
     *
     * @return
     */
    @Getter
    @Setter
    private String province;

    /**
     * 账号所在城市
     *
     * @return
     */
    @Getter
    @Setter
    private String city;

    /**
     * 银行预留手机号
     */
    @Getter
    @Setter
    private String bankMobile;

    public BankAccount() {
    }

    public BankAccount(String name, Bank bank, String location, String branch, String account) {
        this.name = name;
        this.bank = bank;
        this.location = location;
        this.branch = branch;
        this.account = account;
    }

}
