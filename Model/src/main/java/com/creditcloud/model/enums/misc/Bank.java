/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 支持的银行列表
 * 
 * @author sobranie
 */
public enum Bank implements BaseEnum {
    
    ICBC("中国工商银行"),
    ABC("中国农业银行"),
    CMB("招商银行"),
    CCB("建设银行"),
    BCCB("北京银行"),
    BJRCB("北京农村商业银行"),
    BOC("中国银行"),
    BOCOM("交通银行"),
    CMBC("民生银行"),
    BOS("上海银行"),
    CBHB("渤海银行"),
    CEB("光大银行"),
    CIB("兴业银行"),
    CITIC("中信银行"),
    CZB("浙商银行"),
    GDB("广发银行"),
    HKBEA("东亚银行"),
    HXB("华夏银行"),
    HZCB("杭州银行"),
    NJCB("南京银行"),
    PINGAN("平安银行"),
    PSBC("邮政储蓄银行"),
    SDB("深发银行"),
    SPDB("浦发银行"),
    SRCB("上海农村商业银行");
    
    private final String key;
    
    Bank(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
