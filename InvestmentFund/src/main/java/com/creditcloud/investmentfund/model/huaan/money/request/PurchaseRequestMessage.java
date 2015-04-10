/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

import com.creditcloud.investmentfund.api.huaan.money.enums.TransactionCode;
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
public class PurchaseRequestMessage extends CommonRequestMessage {

    private String TotalAmt;//18位	申购金额（单位：圆）	是
    private String TradeAppendInfo;//	20位	交易附加信息	否
    private String AssignBuyer;//	12位	客户协议号	是
    private String Fee = "0";//	18位	手续费(此处填0)	否
    private String CommonReturn;//	200位	公共回传字段	否

    public PurchaseRequestMessage() {
        setTxcode(TransactionCode.MONEY_FUND_PURCHASE.getCode());
    }    
    
    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();

        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("TotalAmt", StringUtils.nonNull(TotalAmt));
        map.put("TradeAppendInfo", StringUtils.nonNull(TradeAppendInfo));
        map.put("AssignBuyer", StringUtils.nonNull(AssignBuyer));
        map.put("Fee", StringUtils.nonNull(Fee));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        map.put("Memo", StringUtils.nonNull(Memo));

        return map;
    }

}
