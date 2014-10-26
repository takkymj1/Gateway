/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class TransStatResult extends BaseObject {

    private static final long serialVersionUID = 20131113L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    private QueryTransType QueryTransType;

    private TransStat TransStat;

    public TransStatResult() {
    }

    public TransStatResult(String OrdId,
                           String OrdDate,
                           QueryTransType QueryTransType,
                           TransStat TransStat) {
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.QueryTransType = QueryTransType;
        this.TransStat = TransStat;
    }

    public String getOrdId() {
        return OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public QueryTransType getQueryTransType() {
        return QueryTransType;
    }

    public TransStat getTransStat() {
        return TransStat;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public void setQueryTransType(QueryTransType QueryTransType) {
        this.QueryTransType = QueryTransType;
    }

    public void setTransStat(TransStat TransStat) {
        this.TransStat = TransStat;
    }
}
