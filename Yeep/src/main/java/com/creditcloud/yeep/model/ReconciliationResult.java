/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.yeep.model.service.record;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */
@XmlRootElement
public class ReconciliationResult extends BaseResponse {
 
    private static final long serialVersionUID = 20150127L;

    @NotNull
    private List<record> records;

    @NotNull
    private String fee;

    @NotNull
    private String balance;

    @NotNull
    private String amount;


    public ReconciliationResult() {
    }

    public ReconciliationResult(String platformNo, 
                                String code, 
                                String description,
                                List<record> records,
                                String fee, 
                                String balance, 
                                String amount) {
        super(platformNo, code, description);
        this.records = records;
        this.fee = fee;
        this.balance = balance;
        this.amount = amount;
    }

    public List<record> getRecords() {
        return records;
    }

    public String getFee() {
        return fee;
    }

    public String getBalance() {
        return balance;
    }

    public String getAmount() {
        return amount;
    }

    public void setRecords(List<record> records) {
        this.records = records;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }



}
