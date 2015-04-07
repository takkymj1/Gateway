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
public class TransQueryRequestMessage extends CommonRequestMessage {

    private String MerchantId;//	8位	商家ID	是
    private String MerchantDate;//	8位	商户日期	是
    private String OrgMerchantDate;//	8位	原定单商户日期	是
    private String OrgOrderNO;//	24位	原定单号	是
    private String OrgTxCode;//	4位	原交易类型	是
    private String CommonReturn;//	200位	公共回传字段	否
    private String RetURL;//	100位	返回地址	是
    private String Memo;//	120位	定单描述	否

    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();

        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("OrgMerchantDate", StringUtils.nonNull(OrgMerchantDate));
        map.put("OrgOrderNO", StringUtils.nonNull(OrgOrderNO));
        map.put("OrgTxCode", StringUtils.nonNull(OrgTxCode));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        map.put("Memo", StringUtils.nonNull(Memo));

        return map;
    }

}
