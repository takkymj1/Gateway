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
    
    RE_HOUSE("住房"),
    RE_LAND("土地"),
    RE_FACTORY("厂房"),
    VEHICLE("车辆"),
    SECURITIES("证券"),
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
