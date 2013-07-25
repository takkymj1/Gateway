/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import java.util.EnumSet;

/**
 *
 * @author rooseek
 */
public class Enums {

    /**
     * get enum by key
     *
     * @param <T>
     * @param enumType
     * @param key
     * @return
     */
    public static <T extends Enum<T>> T getEnumByKey(Class<T> enumType, String key) {
        EnumSet set = EnumSet.allOf(enumType);
        for (Object object : set) {
            T t = (T) object;
            if (t.toString().equals(key)) {
                return t;
            }
        }
        return null;
    }
}