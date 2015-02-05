/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 解冻返回结果
 *
 * @author tinglany
 */
@XmlRootElement
public class UnFreezeResult extends YeepResult {

    private static final long serialVersionUID = 20131122L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    private String OrdDate;

    @Size(min = 18, max = 18)
    private String TrxId;

    public UnFreezeResult() {
    }

    public UnFreezeResult(String RespCode,
                          String RespDesc,
                          String OrdId,
                          String OrdDate,
                          String TrxId) {
        super(RespCode, RespDesc);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.TrxId = TrxId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public String getTrxId() {
        return TrxId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }
}