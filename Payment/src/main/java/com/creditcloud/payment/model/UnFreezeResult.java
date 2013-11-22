/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 解冻返回结果
 *
 * @author rooseek
 */
@XmlRootElement
public class UnFreezeResult extends BaseObject {

    private static final long serialVersionUID = 20131122L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @Size(min = 18, max = 18)
    private String TrxId;

    public UnFreezeResult() {
    }

    public UnFreezeResult(String OrdId, 
                          String OrdDate,
                          String TrxId) {
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
