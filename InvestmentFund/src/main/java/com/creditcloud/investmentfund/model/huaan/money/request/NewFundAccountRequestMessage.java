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
public class NewFundAccountRequestMessage extends CommonRequestMessage {

    private String OrderNo;//	24位	定单号	是
    private String AssignBuyer;//	12位	客户协议号（双方唯一标识）	是
    private String AssbuyerName;//	120位	机构名称	是
    private String AssbuyerIdTp;//	1位	客户证件类型(营业执照\组织机构代码证)	是
    private String AssbuyerIdNo;//	32位	客户证件号码	是
    private String AssbuyerMobile;//	12位	经办人手机号	是
    private String AssbuyerType;//	2位	客户类型结构	否
    private String Fee;//18位	手续费(此处为0)	否
    private String AssbuyerMemo;//	120位	客户备注	否
    private String CommonReturn;//	200位	公共回传字段	否
    private String IsDirectRedeem;//	1位	是否直接赎回	否
    private String PageURL;//	100位	页面跳转地址	否

    public NewFundAccountRequestMessage() {
        setTxcode(TransactionCode.MONEY_FUND_NEW_ACCOUNT.getCode());
    }

    @Override
    public Map<String, String> toMapFromXMLPayloadParameters() {
        Map<String, String> map = new HashMap<>();
        map.put("MerchantId", StringUtils.nonNull(MerchantId));
        map.put("MerchantDate", StringUtils.nonNull(MerchantDate));
        map.put("OrderNo", StringUtils.nonNull(OrderNo));
        map.put("AssignBuyer", StringUtils.nonNull(AssignBuyer));
        map.put("AssbuyerName", StringUtils.nonNull(AssbuyerName));
        map.put("AssbuyerIdTp", StringUtils.nonNull(AssbuyerIdTp));
        map.put("AssbuyerIdNo", StringUtils.nonNull(AssbuyerIdNo));
        map.put("AssbuyerMobile", StringUtils.nonNull(AssbuyerMobile));
        map.put("AssbuyerType", StringUtils.nonNull(AssbuyerType));
        map.put("Fee", StringUtils.nonNull(Fee));
        map.put("AssbuyerMemo", StringUtils.nonNull(AssbuyerMemo));
        map.put("CommonReturn", StringUtils.nonNull(CommonReturn));
        map.put("IsDirectRedeem", StringUtils.nonNull(IsDirectRedeem));
        map.put("RetURL", StringUtils.nonNull(RetURL));
        map.put("PageURL", StringUtils.nonNull(PageURL));
        map.put("Memo", StringUtils.nonNull(Memo));
        return map;
    }

}
