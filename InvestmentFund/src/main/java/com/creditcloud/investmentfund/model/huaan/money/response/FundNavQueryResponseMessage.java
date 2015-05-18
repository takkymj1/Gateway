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
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundNavQueryResponseMessage extends CommonResponseMessage {

    private String MerchantId;//	8位	商家ID
    private String AllPageNo;//	10位	总页数
    private String CurPageNo;//	10位	当前页码
    private String FundNo;//	6位	货币基金代码
    private String FundName;//20位	货币基金名称
    private String BonusCurrDate;//	8位	净值当前日期
    private String BonusCurrAmt;//	9位	净值当前每万份收益
    private String BonusCurrRatio;//	9位	净值当前7日年化收益率
    private String BonusBefDate;//	8位	净值上一日期
    private String BonusBefAmt;//	9位	净值上一日期每万份收益
    private String BonusBefRatio;//	9位	净值上一日7日年化收益率

    @Override
    public void resolveXMLPaylod() {
        String decodedXML = this.getContentXMLPayloadPlainText();
        Map<String, String> parameters = parseXMLPayload(decodedXML);

        MerchantId = parameters.get("MerchantId");
        AllPageNo = parameters.get("AllPageNo");
        CurPageNo = parameters.get("CurPageNo");
        FundNo = parameters.get("FundNo");
        FundName = parameters.get("FundName");
        BonusCurrDate = parameters.get("BonusCurrDate");
        BonusCurrAmt = parameters.get("BonusCurrAmt");
        BonusCurrRatio = parameters.get("BonusCurrRatio");
        BonusBefDate = parameters.get("BonusBefDate");
        BonusBefAmt = parameters.get("BonusBefAmt");
        BonusBefRatio = parameters.get("BonusBefRatio");
        RetCode = parameters.get("RetCode");
        RetMsg = parameters.get("RetMsg");
    }

}
