/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

import com.creditcloud.investmentfund.model.huaan.money.CommonResponseMessage;
import java.util.Map;
import lombok.Data;

/**
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
public class SingleAccountSharesQueryResponseMessage extends CommonResponseMessage {

    private String MerchantId;//	8位	商家ID
    private String MerchantDate;//	8位	商户日期
    private String AssignBuyer;//	12位	买家信息(客户协议号)	
    private String AssbuyerName;//	120位	客户姓名
    private String AssbuyeIdTp;//	1位	客户证件类型(0为身份证)
    private String TotalQuty;//	18位	总资产金额
    private String AvailQuty;//	18位	可用资产额
    private String TotalIncome;//	18位	累计收益
    private String LastIncome;//	18位	最新收益
    private String RetCode;//	4位	返回码(0000为成功)
    private String RetMsg;//	200位	返回信息
    private String CommonReturn;//	200位	公共回传字段

    @Override
    public void resolveXMLPaylod() {
        String decodedXML = this.getContentXMLPayloadPlainText();
        Map<String, String> parameters = parseXMLPayload(decodedXML);

        MerchantId = parameters.get("MerchantId");
        MerchantDate = parameters.get("MerchantDate");
        AssignBuyer = parameters.get("AssignBuyer");
        AssbuyerName = parameters.get("AssbuyerName");
        TotalQuty = parameters.get("TotalQuty");
        AvailQuty = parameters.get("AvailQuty");
        TotalIncome = parameters.get("TotalIncome");
        LastIncome = parameters.get("LastIncome");
        RetCode = parameters.get("RetCode");
        RetMsg = parameters.get("RetMsg");
        CommonReturn = parameters.get("CommonReturn");
    }

}
