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
 *
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
public class AccountsSharesQueryResponseMessage extends CommonResponseMessage {

    private String MerchantId;//	8位	商家ID
    private String AllPageNo;//	10位	总页数
    private String CurPageNo;//	10位	当前页码
    private String AllCount;//	18位	总笔数
    private String Content;//	对账单内容，详细内容见备注说明
    private String RetCode;//	4位	查询结果
    private String RetMsg;//	200位	返回信息

    @Override
    public void resolveXMLPaylod() {
        String decodedXML = this.getContentXMLPayloadDecoded();
        Map<String, String> parameters = parseXMLPayload(decodedXML);

        MerchantId = parameters.get("MerchantId");
        AllPageNo = parameters.get("AllPageNo");
        CurPageNo = parameters.get("CurPageNo");
        AllCount = parameters.get("AllCount");
        Content = parameters.get("Content");
        RetCode = parameters.get("RetCode");
        RetMsg = parameters.get("RetMsg");
    }

}
