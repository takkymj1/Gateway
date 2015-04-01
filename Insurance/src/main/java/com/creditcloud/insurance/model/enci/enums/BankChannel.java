/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum BankChannel implements BaseEnum{
    
    CIB("兴业银行", "8600080", "兴业银行"),
    CZB("浙商银行", "8600170", "浙商银行"),
    GCB("广州商业银行", "8600450", "广州银行"),
    BOC("中国银行", "8600090", "中国银行"),
    CITIC("中信银行", "8600100", "中信银行"),
    CMB("招商银行", "8600070", "招商银行"),
    SPDB("浦东发展银行", "8600130", "浦发银行"),
    SDB("深圳发展银行", "8600140", "深发银行"),
    CMBC("民生银行", "8600060", "民生银行"),
    GDB("广东发展银行", "8600180", "广发银行"),
    JSB("江苏银行", "8600470", "江苏银行"),
    NCXYS("农村信用社", "8600110", "未知银行"),
    PSBC("邮政储蓄银行", "8600040", "邮政储蓄银行"),
    XMCCB("厦门银行", "8600410", "厦门银行"),
    ABC("中国农业银行", "8600050", "中国农业银行"),
    BOCOM("中国交通银行", "8600120", "交通银行"),
    JLB("吉林银行", "8600310", "吉林市商业银行"),
    BCCB("北京银行", "8600030", "北京银行"),
    ICBC("工商银行", "8600010", "中国工商银行"),
    CEB("光大银行", "8600150", "光大银行"),
    HZCB("杭州银行", "8600480", "杭州银行"),
    BOS("上海银行", "8600290", "上海银行"),
    CCB("中国建设银行", "8600020", "建设银行"),
    DGB("东莞银行", "8600460", "东莞市商业银行"),
    MSDXXYK("民生电销信用卡", "8600061", "未知银行"),
    DLB("大连银行", "8600440", "大连银行"),
    HXB("华夏银行", "8600160", "华夏银行"),
    NJCB("南京银行", "8600530", "南京银行"),
    HEBNX("河北农信社", "8600111", "河北省农村信用社"),
    BFGSYH("北分工商银行", "8600011", "未知银行"),
    JHYBT("建行银保通", "8600021", "未知银行"),
    ZGNYYH("中国农业银行", "8600051", "中国农业银行"),
    XYKYH("信用卡银行", "8600001", "未知银行"),
    PINGAN("平安银行", "8600490", "未知银行");
    
    /**
     * 代码
     */
    private final String key;
    
    /**
     * 新华银行编码
     */
    private final String enciBankCode;
    
    /**
     * 平台内银行
     */
    private final String platBank;

    private BankChannel(String key, String enciBankCode, String platBank){
        this.key = key;
        this.enciBankCode = enciBankCode;
        this.platBank = platBank;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getEnciBankCode() {
        return enciBankCode;
    }
    
    public String getPlatBank() {
        return platBank;
    }
}
