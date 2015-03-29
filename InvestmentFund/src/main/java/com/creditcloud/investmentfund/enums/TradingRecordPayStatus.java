/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 基金支付状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordPayStatus implements BaseEnum {

    UNPAID("未支付", "00"),
    PORCESSING("处理中", "01"),
    SUCCESSFUL("支付成功", "02"),
    FAILED("支付失败", "03");

    private final String key;
    
    private final String lionFundCode;
    
    private static final Map<String, TradingRecordPayStatus> lionFundMap;
    
    static {
        Map<String, TradingRecordPayStatus> map = new HashMap<>(TradingRecordPayStatus.values().length);
        for (TradingRecordPayStatus status : TradingRecordPayStatus.values()) {
            map.put(status.getLionFundCode(), status);
        }
        lionFundMap = Collections.unmodifiableMap(map);
    }
    
    TradingRecordPayStatus(String key, String lionFundCode) {
        this.key = key;
        this.lionFundCode = lionFundCode;
    }
    
    @Override
    public String getKey() {
        return key;
    }

    public String getLionFundCode() {
        return lionFundCode;
    }
    
    /**
     * 从LionFund代码构造TradingRecordPayStatus对象
     *
     * @param lionFundCode
     * @return 找不到code则返回NULL
     */
    public static TradingRecordPayStatus getEnumFromLionFundCode(String lionFundCode) {
        return lionFundMap.containsKey(lionFundCode) ? lionFundMap.get(lionFundCode) : null;
    }
}
