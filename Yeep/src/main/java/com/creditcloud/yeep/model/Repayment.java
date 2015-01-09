/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;
import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
/**
 *
 * @author tinglany
 */
@XmlType
public class Repayment extends BaseObject {
    
    //投标时用的请求流水号
    @NotNull
    private String paymentRequestNo;
    
    //投资人平台用户编号
    @NotNull
    private String targetUserNo;
    
    //还款金额。投资人到账金额=还款金额-平台分润,至少 0.01 元
    @NotNull
    private String amount;
    
    //平台分润
    @NotNull
    private String fee;

    public Repayment() {
    }
    
    
    public Repayment(String paymentRequestNo,
                     String targetUserNo,
                     String amount,
                     String fee) {
        this.paymentRequestNo = paymentRequestNo;
        this.targetUserNo = targetUserNo;
        this.amount = amount;
        this.fee = fee;
    }

    public String getPaymentRequestNo() {
        return paymentRequestNo;
    }

    public String getTargetUserNo() {
        return targetUserNo;
    }

    public String getAmount() {
        return amount;
    }

    public String getFee() {
        return fee;
    }

    public void setPaymentRequestNo(String paymentRequestNo) {
        this.paymentRequestNo = paymentRequestNo;
    }

    public void setTargetUserNo(String targetUserNo) {
        this.targetUserNo = targetUserNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
   
}
