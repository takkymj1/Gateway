/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money;

import com.creditcloud.investmentfund.api.huaan.money.enums.HuaAnFundReturnCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * 华安货币基金响应报文通用部分<br>
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
public abstract class CommonResponseMessage extends CommonMessage {

    protected String RetCode;//4位	返回码(0000为成功)

    protected String RetMsg;//200位	返回信息

    public boolean isSuccess() {
        boolean isSuccess = HuaAnFundReturnCode.SUCCESS.getCode().equalsIgnoreCase(RetCode);
        return isSuccess;
    }

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
