/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import com.creditcloud.model.BaseObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * 华安货币基金报文通用部分<br>
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonMessage extends BaseObject {

    private String vernum;//	8位	版本号(20140401)
    private String platformid;//	8位	云中信ID
    private String merchantid;//	12位	商家ID
    private String sysdate;//	8位	系统日期(yyyymmdd)
    private String systime;//	6位	系统时间(hhmmss)
    private String txcode;//	4位	交易代码
    private String seqno;//	24位	云中信通讯流水号，与请求表单对应
    private String maccode;//	16位	校验串，对明文内容进行MD5
    private String contentXMLPayload;//	加密内容
    private String contentXMLPayloadPlainText;//	XML Payload 的明文
    
    public String buildPlainTextForMaccode() {
        StringBuilder sb = new StringBuilder();

        sb.append(StringUtils.nonNull(getVernum()));
        sb.append(StringUtils.nonNull(platformid));
        sb.append(StringUtils.nonNull(merchantid));
        sb.append(StringUtils.nonNull(sysdate));
        sb.append(StringUtils.nonNull(systime));
        sb.append(StringUtils.nonNull(txcode));
        sb.append(StringUtils.nonNull(seqno));
        sb.append(StringUtils.nonNull(contentXMLPayload));

        return sb.toString();
    }

    protected static Map<String, String> parseResponseText(String responseText) {
        List<String> lines = StringUtils.parseLines(responseText);
        Map<String, String> parameters = new HashMap<>();
        final String splitterKeyValue = "=";
        for (String line : lines) {
            Pair<String, String> kv = StringUtils.parseNamedValue(line, splitterKeyValue);
            String k = kv.getKey();
            String v = kv.getValue();
            parameters.put(k, v);
        }
        return parameters;
    }

    public void parse(String responseText) {
        Map<String, String> parameters = parseResponseText(responseText);
        fromMap(parameters);
    }

    protected void fromMap(Map<String, String> items) {
        vernum = StringUtils.nonNull(items.get("vernum"));
        platformid = StringUtils.nonNull(items.get("platformid"));
        merchantid = StringUtils.nonNull(items.get("merchantid"));
        sysdate = StringUtils.nonNull(items.get("sysdate"));
        systime = StringUtils.nonNull(items.get("systime"));
        txcode = StringUtils.nonNull(items.get("txcode"));
        seqno = StringUtils.nonNull(items.get("seqno"));
        maccode = StringUtils.nonNull(items.get("maccode"));
        contentXMLPayload = StringUtils.nonNull(items.get("content"));
    }
}
