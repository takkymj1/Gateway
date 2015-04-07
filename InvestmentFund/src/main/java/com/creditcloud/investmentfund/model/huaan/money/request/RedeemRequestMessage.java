/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

import com.creditcloud.investmentfund.model.huaan.money.CommonRequestMessage;
import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import java.util.HashMap;
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
public class RedeemRequestMessage extends CommonRequestMessage {

    private String MerchantId;//	8位	商家ID	是
    private String MerchantDate;//	8位	商户日期	是
    private String LogisticsInfo;//	17位	交易号(对应资产)	否
    private String TotalQuty;//	18位	赎回资产份额数	是
    private String TradeAppendInfo;//	20位	交易附加信息	否
    private String AssignBuyer;//	12位	客户协议号	是
    private String AssbuyerName;//	120位	客户姓名	是
    private String AssbuyerIdTp;//	1位	客户证件类型(0为身份证)	是
    private String AssbuyerIdNo;//	32位	客户证件号码	是
    private String Fee = "0";//	18位	手续费(此处填0)	否
    private String CommonReturn;//200位	公共回传字段	否
    private String RetURL;//	100位	返回地址	是
    private String Memo;//120位	定单描述	否

    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();
        
        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("LogisticsInfo", StringUtils.nonNull(LogisticsInfo));
        map.put("TotalQuty", StringUtils.nonNull(TotalQuty));
        map.put("TradeAppendInfo", StringUtils.nonNull(TradeAppendInfo));
        map.put("AssignBuyer", StringUtils.nonNull(AssignBuyer));
        map.put("AssbuyerName", StringUtils.nonNull(AssbuyerName));
        map.put("AssbuyerIdTp", StringUtils.nonNull(AssbuyerIdTp));
        map.put("AssbuyerIdNo", StringUtils.nonNull(AssbuyerIdNo));
        map.put("Fee", StringUtils.nonNull(Fee));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        map.put("Memo", StringUtils.nonNull(Memo));

        return map;
    }

}
