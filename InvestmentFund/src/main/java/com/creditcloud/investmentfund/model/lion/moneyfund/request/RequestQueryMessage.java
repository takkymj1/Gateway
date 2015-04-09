/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.lion.moneyfund.request;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import com.creditcloud.investmentfund.constant.FundInterfaceConstants;
import com.creditcloud.model.BaseObject;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 诺安货币基金通用查询请求报文<br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestQueryMessage extends BaseObject {

    protected final String version = FundInterfaceConstants.LOIN_MONEY_FUND_INTERFACE_VERSION;//	版本号 char(7)	R	目前版本号：2.0
    protected String instId;//	机构标识 char(10)	R	报文发送方的机构标识。 电商平台用：dianshang01
    protected String certId;//	数字证书标识 char(16)	R	基金公司端证书标识码，对报文进行签名的数字证书标识. 电商平台用：dianshang0101
    protected String tradeacco;// 诺安交易账户	char(32)	R	
    protected String applicationNo;// 请求流水号 char (50)	R	需要查询的原申请单编号
    protected String transName;//业务类型		Char(10)	业务类型	 原申请单业务类型
    protected String sign;//	char(500)	R	 签名

    public Map<String, String> toMap() {
        Map<String, String> parameters = new HashMap<>();

        parameters.put("version", StringUtils.nonNull(version));
        parameters.put("instId", StringUtils.nonNull(instId));
        parameters.put("certId", StringUtils.nonNull(certId));
        parameters.put("applicationNo", StringUtils.nonNull(applicationNo));
        parameters.put("tradeacco", StringUtils.nonNull(tradeacco));
        parameters.put("transName", StringUtils.nonNull(transName));
        parameters.put("sign", StringUtils.nonNull(sign));

        return parameters;
    }
}
