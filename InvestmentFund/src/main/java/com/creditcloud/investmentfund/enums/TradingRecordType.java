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
import lombok.Getter;

/**
 * 基金交易记录类型
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordType implements BaseEnum {

    SUBSCRIBING("认购", "20"),
    PURCHASING("申购", "22"),
    REDEMING("赎回", "24"),
    REDEMING_QUICK("快速赎回", "98"),
    FUND_TRANSFER("基金转换", "36"),
    
    CUSTODY_TRANSFER("转托管", "26"),
    CUSTODY_TRANSFERIN("转托管转入", "27"),
    CUSTODY_TRANSFEROUT("转托管转出", "28"),
    
    BONUSSHARESETTING("设置分红方式", "29"),
    PURCHASINGFIXEDAMOUNT("定期定额申购", "39"),
    
    AGREEMENT_AUTOMATIC_INVESTMENT_OPENED("定投协议开通", "59"),
    AGREEMENT_AUTOMATIC_INVESTMENT_CANCELED("定投协议撤销", "60"),
    AGREEMENT_AUTOMATIC_REDEMING_AND_TRANSFER_OPENED("定赎、定转协议开通", "69"),
    AGREEMENT_AUTOMATIC_REDEMING_AND_TRANSFER_CANCELED("定赎、定转协议撤销", "70");
    
    private static final Map<String, TradingRecordType> lionFundMap;

    private final String key;
    
    static {
        Map<String, TradingRecordType> map = new HashMap<>(TradingRecordType.values().length);
        for (TradingRecordType type : TradingRecordType.values()) {
            map.put(type.getLionFundCode(), type);
        }
        lionFundMap = Collections.unmodifiableMap(map);
    }
    
    @Getter
    private final String lionFundCode;
    
    TradingRecordType(String key, String lionFundCode) {
        this.key = key;
        this.lionFundCode = lionFundCode;
    }
    
    @Override
    public String getKey() {
        return key;
    }

    /**
     * 从LionFund代码构造TradingRecordType对象
     *
     * @param lionFundCode
     * @return 找不到code则返回NULL
     */
    public static TradingRecordType getEnumFromLionFundCode(String lionFundCode) {
        return lionFundMap.containsKey(lionFundCode) ? lionFundMap.get(lionFundCode) : null;
    }
    
}
