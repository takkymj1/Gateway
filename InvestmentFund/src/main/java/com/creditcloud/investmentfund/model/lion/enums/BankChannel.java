/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.enums;

import com.creditcloud.model.enums.BaseEnum;
import lombok.Getter;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum BankChannel implements BaseEnum {

    ICBC("工商银行", "001002"),
    ABC("农业银行", "001003"),
    CCB("建设银行", "003005"),
    CITIC("中信银行", "001008"),
    CEB("光大银行", "001012"),
    CIB("兴业银行", "001011"),
    BOS("上海银行", "002018"),
    PINGAN("平安银行", "002010"),
    BOC("中国银行", "002004"),
    HXB("华夏银行", "002017"),
//    BOCOM("交通银行", "001006"),
//    PSBC("邮储银行", "001015"),
    CMB("招商银行", "002007"),
    CMBC("民生银行", "002014");
    
    
            
    private final String key;
    
    @Getter
    private final String channelId;
    
    BankChannel(String channelName, String channelId) {
        this.key = channelName;
        this.channelId = channelId;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
