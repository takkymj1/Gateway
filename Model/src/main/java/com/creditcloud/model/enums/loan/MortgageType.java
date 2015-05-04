/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MortgageType implements BaseEnum {

    /**
     * 不动产 RealEstate
     */
    RE_HOUSE("房产"),
    RE_LAND("土地(包括山林渔牧)"),
    RE_FACTORY("厂房库房"),
    /**
     * 动产
     */
    COMMONDITY("商品库存"),
    VEHICLE("车辆"),
    EQUIPMENT("设备器材"),
    /*
     *所有权、债权等 
     */
    SECURITIES("证券"),
    BOND("债券"),
    STOCK("股票"),
    DEPOSIT_RECEIPT("银行存单"),
    FUND("基金"),
    EQUITY("股权"),
    /**
     * 其他
     */
    OTHER("其他");

    private final String key;

    private MortgageType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
