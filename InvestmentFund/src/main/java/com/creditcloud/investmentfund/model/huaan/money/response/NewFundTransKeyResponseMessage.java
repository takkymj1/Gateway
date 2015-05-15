/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

import com.creditcloud.investmentfund.model.huaan.money.CommonResponseMessage;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定义参考 : 华安云中信通讯接口说明_机构.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NewFundTransKeyResponseMessage extends CommonResponseMessage {

    private String MerchantId;//12位	商家ID（华安基金账号）

    private String MerchantDate;//8位	商户日期

    private String NewAESCode;//25位	密钥

    private String RetCode;//4位	返回码(0000为成功)

    private String RetMsg;//200位	返回信息

    private String CommonReturn;//200位	公共回传字段

    @Override
    public void resolveXMLPaylod() {
        String decodedXML = this.getContentXMLPayloadPlainText();
        Map<String, String> parameters = parseXMLPayload(decodedXML);

        MerchantId = parameters.get("MerchantId");
        MerchantDate = parameters.get("MerchantDate");
        NewAESCode = parameters.get("NewAESCode");
        RetCode = parameters.get("RetCode");
        RetMsg = parameters.get("RetMsg");
        CommonReturn = parameters.get("CommonReturn");
    }
}
