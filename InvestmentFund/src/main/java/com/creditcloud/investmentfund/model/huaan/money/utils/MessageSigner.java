/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.utils;

import com.creditcloud.investmentfund.api.lion.moneyfund.utils.StringUtils;
import com.creditcloud.investmentfund.model.huaan.money.CommonMessage;
import com.creditcloud.investmentfund.model.huaan.money.CommonRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.CommonResponseMessage;

/**
 *
 * @author guohuazhang
 */
public class MessageSigner {

    public void encode(CommonRequestMessage request) {
        String xml = request.buildXMLPayload();
        String signedXMLContent = encode(xml);
        request.setContent(signedXMLContent);
    }

    private String encode(String xml) {
        //TODO : 这里要使用华安提供的key信息加密XML内容
        return null;
    }
    
    public void decode (CommonResponseMessage response){
        String decodedXML=response.getContent();
        response.resolveXMLPaylod(decodedXML);
    }
    
    private String decode(String xml){
         //TODO : 这里要使用华安提供的key信息解密XML内容
        return null;
    }

    public String buildMaccode(CommonMessage message) {
        String plainText = message.buildPlainTextForMaccode();
        String md5 = null;
        //TODO： 这里需要做MD5摘要
        return md5;
    }

    public boolean checkMaccode(CommonMessage message) {
        String actualDigest = buildMaccode(message);
        String expectedDigest = message.getMaccode();

        boolean match = StringUtils.nonNull(actualDigest).equalsIgnoreCase(expectedDigest);
        return match;
    }
}
