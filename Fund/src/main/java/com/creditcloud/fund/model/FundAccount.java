/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.model.user.fund.BankAccount;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 资金账号
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FundAccount extends BaseObject {

    private static final long serialVersionUID = 20131117L;

    private String id;

    /**
     * 资金账号类型USER或CORPORATION,为null也表示USER
     */
    private Realm category;

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

    /**
     * 是否为快捷充值卡
     * 
     * @return
     */
    @Setter
    @Getter
    private boolean expressAccount;
    
    private Date timeRecorded;

    public FundAccount(String id,
                       String userId,
                       BankAccount account,
                       boolean valid,
                       boolean defaultAccount,
                       Date timeRecorded) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.valid = valid;
        this.defaultAccount = defaultAccount;
        this.timeRecorded = timeRecorded;
        this.expressAccount = false;
    }

    public FundAccount(String id,
                       String userId,
                       BankAccount account,
                       boolean valid,
                       boolean defaultAccount,
                       boolean expressAccount,
                       Date timeRecorded) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.valid = valid;
        this.defaultAccount = defaultAccount;
        this.timeRecorded = timeRecorded;
        this.expressAccount = expressAccount;
    }
    
    public Realm getCategory() {
        //老数据没有category，默认是USER
        return category == null ? Realm.USER : category;
    }
}
