/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.enums.TransStat;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class QueryTransDetailResult extends PaymentResult {

    private static final long serialVersionUID = 20150107L;

    private String OrdId;

    private String OrdDate;

    private QueryTransType QueryTransType;

    private String TransAmt;

    private TransStat TransStat;

    private String FeeAmt;

    private String FeeCustId;

    private String FeeAcctId;

    private String GateBusiId;

    private String RespExt;

    public QueryTransDetailResult(String OrdId,
                                  String OrdDate,
                                  QueryTransType QueryTransType,
                                  String TransAmt,
                                  TransStat TransStat,
                                  String FeeAmt,
                                  String FeeCustId,
                                  String FeeAcctId,
                                  String GateBusiId,
                                  String RespCode,
                                  String RespDesc) {
        super(RespCode, RespDesc);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.QueryTransType = QueryTransType;
        this.TransAmt = TransAmt;
        this.TransStat = TransStat;
        this.FeeAmt = FeeAmt;
        this.FeeCustId = FeeCustId;
        this.FeeAcctId = FeeAcctId;
        this.GateBusiId = GateBusiId;
    }
}
