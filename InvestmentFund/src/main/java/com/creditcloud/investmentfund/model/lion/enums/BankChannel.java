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

    ICBC("工行快捷", "001002"),
    HXB("华夏银行快捷", "001017"),
    PSBC("邮储银行快捷", "001015"),
    ABC("农行快捷", "001003"),
    BOC("中行快捷", "001004"),
    CEB("光大银行快捷", "001012"),
    BOS("上海银行快捷", "001018"),
    CMB("招行快捷", "001007"),
    PINGAN("平安银行快捷", "001010"),
    CIB("兴业快捷", "001011"),
    CMBC("民生快捷", "001014"),
    BOCOM("交通快捷", "001006"),
    CITIC("中信快捷", "001008"),
    SPDB("浦发快捷", "001009"),
    BCCB("北京银行快捷", "001016");
    
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
