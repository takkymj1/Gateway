/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;
import java.util.HashMap;

/**
 * 学历水平
 *
 * @author sobranie
 */
public enum EducationLevel implements BaseEnum {

    HIGHSCHOOL("高中学历及以下"),
    COLLEGE("本科学历"),
    GRADUATE("研究生及以上");

    private final String key;

    private EducationLevel(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, EducationLevel> key2Enum = new HashMap<String, EducationLevel>();

    static {
        for (EducationLevel method : EducationLevel.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static EducationLevel getEnum(String key) {
        return key2Enum.get(key);
    }
}
