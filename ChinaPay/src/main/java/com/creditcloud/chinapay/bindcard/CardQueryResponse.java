/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.bindcard;

import com.creditcloud.chinapay.ChinaPayConstant;
import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 银行卡Bin查询
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CardQueryResponse extends BaseObject {

    private static final long serialVersionUID = 20150311L;

    private String appSysId;

    private String serviceType;

    private String signMethod;

    private String signature;

    private String cardNo;

    private String cardSpec = "0001";

    private String cardBin;

    private String cardLen;

    private String dcType;
    
    private String cardIssuer;

    private String cardIssuerName;

    private String respcode;

    private String respmsg;

    public boolean success() {
        return ChinaPayConstant.ACCOUNT_VALIDATION_SUCCESS_CODE.equals(respcode);
    }
}
