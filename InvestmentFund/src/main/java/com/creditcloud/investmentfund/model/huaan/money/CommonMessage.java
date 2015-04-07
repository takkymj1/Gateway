/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonMessage extends BaseObject{

    private String vernum;//	8位	版本号(20140401)
    private String platformid;//	8位	云中信ID
    private String merchantid;//	12位	商家ID
    private String sysdate;//	8位	系统日期(yyyymmdd)
    private String systime;//	6位	系统时间(hhmmss)
    private String txcode;//	4位	交易代码
    private String seqno;//	24位	云中信通讯流水号，与请求表单对应
    private String maccode;//	16位	校验串，对明文内容进行MD5
    private String content;//	加密内容

    protected String buildPlainTextForMaccode() {
        StringBuilder sb = new StringBuilder();

        sb.append(StringUtils.nonNull(getVernum()));
        sb.append(StringUtils.nonNull(platformid));
        sb.append(StringUtils.nonNull(merchantid));
        sb.append(StringUtils.nonNull(sysdate));
        sb.append(StringUtils.nonNull(systime));
        sb.append(StringUtils.nonNull(txcode));
        sb.append(StringUtils.nonNull(seqno));
        sb.append(StringUtils.nonNull(content));

        return sb.toString();
    }

    protected String buildMaccode() {
        String plainText = buildPlainTextForMaccode();
        String md5 = null;
        //TODO： 这里需要做MD5摘要
        return md5;
    }

    public boolean checkMaccode() {
        String actualDigest = buildMaccode();
        String expectedDigest = this.maccode;

        boolean match = StringUtils.nonNull(actualDigest).equalsIgnoreCase(expectedDigest);
        return match;
    }
}
