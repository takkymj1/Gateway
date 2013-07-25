/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum YearOfService implements BaseEnum {

    YEAR_BELOW_1("1年以下"),
    YEAR_1_3("1-3年(含)"),
    YEAR_3_5("3-5年(含)"),
    YEAR_5_10("5-10年(含)"),
    YEAR_10_20("10-20年(含)"),
    YEAR_ABOVE_20("20年以上"),;

    private final String key;

    private YearOfService(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
