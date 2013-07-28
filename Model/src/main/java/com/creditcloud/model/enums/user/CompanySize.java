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
public enum CompanySize implements BaseEnum {

    SIZE_BELOW_10("10人以下"),
    SIZE_11_100("11﹣100人"),
    SIZE_101_500("101﹣500人"),
    SIZE_501_2000("501-2000人"),
    SIZE_2001_10000("2001-10000人"),
    SIZE_10001_100000("10000人以上");

    private final String key;

    private CompanySize(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
