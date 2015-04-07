/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.request;

import com.creditcloud.investmentfund.model.huaan.money.CommonMessage;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 华安货币基金请求报文通用部分<br>
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public  class CommonRequestMessage extends CommonMessage {

    private final String vernum = "20140401";//	8位	版本号(20140401)
    
    //public abstract Map<String,String> convertXMLPayloadParametersToMap();
}
