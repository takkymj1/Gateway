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
 * 交易记录状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordStatus implements BaseEnum {

    PREPARE_REVIEW("待复核", "00"),
    PREPARE_BLENDING("待勾兑", "01"),
    UNCONFIRMED("待确认", "02/06/07"),
    UNDO("撤销", "04/05"),
    CONFIRMED("已确认", "08");

    private final String key;
    
    private final String lionFundCode;
    
    private static final Map<String, TradingRecordStatus> lionFundMap;
    
    static {
        Map<String, TradingRecordStatus> map = new HashMap<>(TradingRecordStatus.values().length);
        for (TradingRecordStatus status : TradingRecordStatus.values()) {
            String[] array = status.getLionFundCode().split("/");
            for (String code : array) {
                map.put(code, status);
            }
        }
        lionFundMap = Collections.unmodifiableMap(map);
    }
    
    TradingRecordStatus(String key, String lionFundCode) {
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
     * 从LionFund代码构造TradingRecordStatus对象
     *
     * @param lionFundCode
     * @return 找不到code则返回NULL
     */
    public static TradingRecordStatus getEnumFromLionFundCode(String lionFundCode) {
        return lionFundMap.containsKey(lionFundCode) ? lionFundMap.get(lionFundCode) : null;
    }
    
}
