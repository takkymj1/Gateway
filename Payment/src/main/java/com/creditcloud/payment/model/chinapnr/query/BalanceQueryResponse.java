/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;

/**
 * 余额查询的返回结果
 * 
 * @author sobranie
 */
public class BalanceQueryResponse extends UserResponse {
    
    private String AvlBal;
    
    private String AcctBal;
    
    private String FrzBal;
    
    public BalanceQueryResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(getAvlBal()).append(getAcctBal()).append(getFrzBal());
        return sb.toString();
    }

    public String getAvlBal() {
        return AvlBal;
    }

    public void setAvlBal(String AvlBal) {
        this.AvlBal = AvlBal;
    }

    public String getAcctBal() {
        return AcctBal;
    }

    public void setAcctBal(String AcctBal) {
        this.AcctBal = AcctBal;
    }

    public String getFrzBal() {
        return FrzBal;
    }

    public void setFrzBal(String FrzBal) {
        this.FrzBal = FrzBal;
    }
    
}
