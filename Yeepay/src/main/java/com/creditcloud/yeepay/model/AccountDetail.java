/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeepay.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 商户子账户详情，为兼容页面而使用
 *
 * @author rooseek
 */
@XmlRootElement
public class AccountDetail extends BaseObject {

    private static final long serialVersionUID = 20131113L;

    @NotNull
    private SubAccountType AcctType;

    @NotNull
    private String SubAcctId;

    @NotNull
    private BigDecimal AvlBal;

    @NotNull
    private BigDecimal AcctBal;

    @NotNull
    private BigDecimal FrzBal;

    public AccountDetail() {
    }

    public void setAcctType(SubAccountType AcctType) {
        this.AcctType = AcctType;
    }

    public void setAvlBal(BigDecimal AvlBal) {
        this.AvlBal = AvlBal;
    }

    public void setSubAcctId(String SubAcctId) {
        this.SubAcctId = SubAcctId;
    }

    public void setAcctBal(BigDecimal AcctBal) {
        this.AcctBal = AcctBal;
    }

    public String getSubAcctId() {
        return SubAcctId;
    }

    public BigDecimal getAcctBal() {
        return AcctBal;
    }

    public void setFrzBal(BigDecimal FrzBal) {
        this.FrzBal = FrzBal;
    }

    public SubAccountType getAcctType() {
        return AcctType;
    }

    public BigDecimal getAvlBal() {
        return AvlBal;
    }

    public BigDecimal getFrzBal() {
        return FrzBal;
    }
}
