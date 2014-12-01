/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 支持的银行列表, 汇付天下(PNR)和联动优势(UMP)通过属性区分
 * 
 * @author sobranie
 */
public enum Bank implements BaseEnum {
    
    ICBC("中国工商银行", true, true),
    ABC("中国农业银行", true, true),
    CMB("招商银行", true, true),
    CCB("建设银行", true, true),
    BCCB("北京银行", true, "BCCB", true, "BJBANK"),
    BJRCB("北京农村商业银行", true, false),
    BOC("中国银行", true, true),
    BOCOM("交通银行", true, "BOCOM", true, "COMM"),
    CMBC("民生银行", true, true),
    BOS("上海银行", true, false),
    CBHB("渤海银行", true, false),
    CEB("光大银行", true, true),
    CIB("兴业银行", true, true),
    CITIC("中信银行", true, true),
    CZB("浙商银行", true, false),
    GDB("广发银行", true, true),
    HKBEA("东亚银行", true, "HKBEA", true, "BEA"),
    HXB("华夏银行", true, true),
    HZCB("杭州银行", true, false),
    NJCB("南京银行", true, false),
    PINGAN("平安银行", true, "PINGAN", true,"SPAB"),
    PSBC("邮政储蓄银行", true, true),
    SDB("深发银行", true, false),
    SPDB("浦发银行", true, true),
    SRCB("上海农村商业银行", true, "SRCB", true, "SHRCB"),
    WZCB("温州银行", false, true);
    
    private static Map<String, Bank> pnrMap;
    private static Map<String, Bank> umpMap;
    
    private final String key;
    private final boolean pnrSupport;
    private final boolean umpSupport;
    private final String pnrCode;
    private final String umpCode;
    
    static {
        Map<String, Bank> thePnrMap = new HashMap<>(Bank.values().length);
        Map<String, Bank> theUmpMap = new HashMap<>(Bank.values().length);
        for(Bank bank : Bank.values()) {
            if(bank.isPnrSupport()) {
                thePnrMap.put(bank.getPnrCode(), bank);
            }
            if(bank.isUmpSupport()) {
                theUmpMap.put(bank.getUmpCode(), bank);
            }
        }
        pnrMap = Collections.unmodifiableMap(thePnrMap);
        umpMap = Collections.unmodifiableMap(theUmpMap);
    }
    
    /**
     * 构造Bank对象, 分别为UMP和PNR指定代码和支持程度
     * 
     * @param key 可视化描述
     * @param supportPNR PNR支持此银行
     * @param pnrCode PNR代码
     * @param supportUMP UMP支持此银行
     * @param umpCode UMP代码
     */
    Bank(String key, boolean pnrSupport, String pnrCode, boolean umpSupport, String umpCode ) {
        this.key = key;
        this.pnrSupport = pnrSupport;
        this.umpSupport = umpSupport;
        this.pnrCode = pnrCode;
        this.umpCode = umpCode;
    }
    
    /**
     * 以name()作为PNR和UMP的代码, 适用于两家代码相同的情况
     * 
     * @param key 可视化描述
     * @param pnrSupport PNR支持此银行
     * @param umpSupport UMP支持此银行
     */
    Bank(String key, boolean pnrSupport, boolean umpSupport) {
        this.key = key;
        this.pnrSupport = pnrSupport;
        this.umpSupport = umpSupport;
        this.pnrCode = name();
        this.umpCode = name();
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * PNR是否支持该银行
     * 
     * @return 
     */
    public boolean isPnrSupport() {
        return pnrSupport;
    }

    /**
     * Ump是否支持该银行
     * 
     * @return 
     */
    public boolean isUmpSupport() {
        return umpSupport;
    }

    /**
     * 获得与PNR通信的代码
     * 
     * @return 
     */
    public String getPnrCode() {
        return pnrCode;
    }

    /**
     * 获得与UMP通信的代码
     * 
     * @return 
     */
    public String getUmpCode() {
        return umpCode;
    }
    
    /**
     * 从PNR代码构造Bank对象
     * 
     * @param pnrCode
     * @return 
     */
    public static Bank getEnumFromPnrCode(String pnrCode) {
        return pnrMap.get(pnrCode);
    }
    
    /**
     * 从UMP代码构造Bank对象
     * 
     * @param umpCode
     * @return 
     */
    public static Bank getEnumFromUmpCode(String umpCode) {
        return umpMap.get(umpCode);
    }
    
    /**
     * 所有UMP支持的银行列表
     * 
     * @return 
     */
    public static Collection<Bank> getUmpBanks() {
        return umpMap.values();
    }
    
    /**
     * 所有PNR支持的银行列表
     * 
     * @return 
     */
    public static Collection<Bank> getPnrBanks() {
        return pnrMap.values();
    }
}
