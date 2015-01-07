/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.payment.model.chinapnr.enums.UsrStat;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class QueryUsrInfoResult extends PaymentResult {

    private static final long serialVersionUID = 20150107L;

    private String UsrCustId;

    private String UsrId;

    private String CertId;

    private UsrStat UsrStat;

    public QueryUsrInfoResult(String UsrCustId,
                              String UsrId,
                              String CertId,
                              UsrStat UsrStat,
                              String RespCode,
                              String RespDesc) {
        super(RespCode, RespDesc);
        this.UsrCustId = UsrCustId;
        this.UsrId = UsrId;
        this.CertId = CertId;
        this.UsrStat = UsrStat;
    }

}
