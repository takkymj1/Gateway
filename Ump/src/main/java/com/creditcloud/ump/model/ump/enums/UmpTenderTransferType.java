/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kdliu
 */
public enum UmpTenderTransferType implements BaseEnum {
    /**
     * 投标
     */
    INVEST("投标", "01"),
    /**
     * 债权购买
     */
    CREDIT_ASSIGN("债权购买", "02"),
    /**
     * 还款
     */
    REPAY("还款", "03"),
    /**
     * 偿付
     */
    DISBURSE("偿付", "04"),
    /**
     * 贴现
     */
    DISCOUNT("贴现", "05"),
    /**
     * 流标后返款
     */
    FAILED_REFUND("流标后返款", "51"),
    /**
     * 平台收费
     */
    PLATFORM_CHARGE("平台收费", "52"),
    /**
     * 放款
     */
    LOAN("放款", "53"),
    /**
     * 还款后返款
     */
    REPAY_REFUND("还款后返款", "54"),
    /**
     * 偿付后返款
     */
    DISBURSE_REFUND("偿付后返款", "55"),
    /**
     * 债权转让的返款
     */
    CREDIT_REFUND("债权转让的返款", "56"),
    /**
     * 撤资后的返款
     */
    DINVEST_REFUND("撤资后的返款", "57");
   
    private static Map<String, UmpTenderTransferType> codeMap;
    
    private String key;
    private String code;
    
    static {
        Map<String, UmpTenderTransferType> map = new HashMap<>(UmpTenderTransferType.values().length);
        for(UmpTenderTransferType type : UmpTenderTransferType.values()) {
            map.put(type.getCode(), type);
        }
        codeMap = Collections.unmodifiableMap(map);
    }
        
    UmpTenderTransferType(String key, String code) {
        this.key = key;
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getKey() {
        return key;
    }
    
    public static UmpTenderTransferType fromCode(String code) {
        return codeMap.get(code);
    }
}
