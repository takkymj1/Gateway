/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.model;

import com.creditcloud.unionpay.api.enums.CardType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerAccountInfo extends CustomerInfo {

    private String cardType = CardType.DEBIT.getCode();//卡类型
    private String cardNo;//卡号
    private transient String pin;//持卡人密码
    private transient String cvn2;//cvn2
    private transient String expired;// 有效期 YYMM

    public void setDebitCard(String cardNo, String pin) {
        cardType = CardType.DEBIT.getCode();
        this.cardNo = cardNo;
        this.pin = pin;
    }

    public void setCreditCard(String cardNo, String cvn2, String expired) {
        cardType = CardType.CREDIT.getCode();
        this.cardNo = cardNo;
        this.cvn2 = cvn2;
        this.expired = expired;
    }

    public boolean isCreditCard() {
        return CardType.CREDIT.getCode().equals(this.cardType);
    }

    public boolean isDebitCard() {
        return CardType.DEBIT.getCode().equals(this.cardType);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}
