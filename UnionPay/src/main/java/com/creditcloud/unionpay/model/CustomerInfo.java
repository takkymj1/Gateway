/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.unionpay.api.enums.CardType;
import com.creditcloud.unionpay.api.enums.CertificationType;
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
public class CustomerInfo extends BaseObject {

    private String certifTp = CertificationType.ID.getCode(); //证件类型 N2 01：身份证 02：军官证 03：护照 04：回乡证 05：台胞证 06：警官证 07：士兵证 99：其它证件
    private String certifId;//证件号码 ANS1..20
    private String customerNm;//姓名 ANS1..32 支持汉字
    private String phoneNo;//手机号 N1..20
    private String smsCode;//短信验证码 N6
    //private String encryptData;//加密信息域 ANS1..512 , 2015-04-23, 和文档v1.4不一致,客服建议依据例子代码
    private String cardType = CardType.DEBIT.getCode();//卡类型
    private String cardNo;//卡号
    private transient String pin;//持卡人密码
    private transient String cvn2;//cvn2
    private transient String expired;// 有效期 YYMM

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.MULTI_LINE_STYLE, false, false);
    }

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
    
    public boolean isUsingCreditCard(){
        return CardType.CREDIT.getCode().equals(this.cardType);
    }
    public boolean isUsingDebitCard(){
        return CardType.DEBIT.getCode().equals(this.cardType);
    }
}
