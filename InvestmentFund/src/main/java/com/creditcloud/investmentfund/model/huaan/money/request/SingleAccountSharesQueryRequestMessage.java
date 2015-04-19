/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

import com.creditcloud.investmentfund.api.huaan.money.enums.TransactionCode;
import com.creditcloud.investmentfund.model.huaan.money.CommonRequestMessage;
import com.creditcloud.investmentfund.api.utils.StringUtils;
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
public class SingleAccountSharesQueryRequestMessage extends CommonRequestMessage {

    private String AssignBuyer;//	12位	客户协议号	是
    private String CommonReturn;//	200位	公共回传字段	否

    public SingleAccountSharesQueryRequestMessage() {
        setTxcode(TransactionCode.SINGLE_ACCOUNT_SHARES_QUERY.getCode());
    }    
    
    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();

        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("AssignBuyer", StringUtils.nonNull(AssignBuyer));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        map.put("Memo", StringUtils.nonNull(Memo));

        return map;
    }
}
