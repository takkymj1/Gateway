/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 华安货币基金响应报文通用部分<br>
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class CommonResponseMessage extends CommonMessage {

    private String contentXMLPayloadDecoded;//	XML Payload 的解密内容

    /**
     * 从解密后的XML payload contentXMLPayloadDecoded 里面把字段放到相应的对象成员变量里面
     */
    public abstract void resolveXMLPaylod();

    protected Map<String, String> parseXMLPayload(String decodedXML) {
        ObjectMapper xmlMapper = new XmlMapper();
        Map<String, String> result = new HashMap<>();
        try {
            result = xmlMapper.readValue(decodedXML, result.getClass());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }
}
