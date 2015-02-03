/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.yeep.enums.ActiveStatus;
import com.creditcloud.yeep.enums.CardStatus;
import com.creditcloud.yeep.enums.MemberType;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分账账户
 *
 * @author tinglany
 */
@Data
@XmlRootElement
public class AccountDetail extends YeepResult {

    private static final long serialVersionUID = 20131115L;

    @NotNull
    protected String platfromNo;

    @NotNull
    protected MemberType memberType;

    @NotNull
    protected ActiveStatus activeStatus;

    @NotNull
    protected BigDecimal balance;

    @NotNull
    protected BigDecimal availableAmount;

    @NotNull
    protected BigDecimal freezeAmount;

    protected String cardNo;

    protected CardStatus cardStatus;

    protected String bank;

    public AccountDetail() {
    }

    public AccountDetail(String platfromNo,
                         String code,
                         String description,
                         MemberType memberType,
                         ActiveStatus activeStatus,
                         BigDecimal balance,
                         BigDecimal availableAmount,
                         BigDecimal freezeAmount,
                         String cardNo,
                         CardStatus cardStatus,
                         String bank) {
        super(code, description);
        this.memberType = memberType;
        this.activeStatus = activeStatus;
        this.balance = balance;
        this.availableAmount = availableAmount;
        this.freezeAmount = freezeAmount;
        this.cardNo = cardNo;
        this.cardStatus = cardStatus;
        this.bank = bank;
    }
}
