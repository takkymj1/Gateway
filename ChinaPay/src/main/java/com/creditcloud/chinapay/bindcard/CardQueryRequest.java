/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.bindcard;

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
public class CardQueryRequest extends BaseObject {

    private static final long serialVersionUID = 20150311L;

    private String appSysId;

    private final String serviceType = "1056";

    private String signMethod;

    private String signature;

    private String cardNo;

}
