/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

import com.creditcloud.investmentfund.api.huaan.money.enums.TransactionCode;
import com.creditcloud.investmentfund.api.utils.StringUtils;
import com.creditcloud.investmentfund.model.huaan.money.CommonRequestMessage;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * 定义参考 : 华安云中信通讯接口说明_机构.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NewFundTransKeyRequestMessage extends CommonRequestMessage {

    private String CommonReturn;//200位	公共回传字段	否

    public NewFundTransKeyRequestMessage() {
        setTxcode(TransactionCode.MERCHANT_EXCHANGE_KEY.getCode());
    }

    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();
        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("Memo", StringUtils.nonNull(Memo));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        return map;
    }

}
