/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;
import java.util.HashMap;

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
    SIZE_10001_100000("10001-100000人"),
    SIZE_ABOVE_100000("10万人以上");

    private final String key;

    private CompanySize(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, CompanySize> key2Enum = new HashMap<String, CompanySize>();

    static {
        for (CompanySize method : CompanySize.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static CompanySize getEnum(String key) {
        return key2Enum.get(key);
    }
}
