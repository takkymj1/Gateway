/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.enums.BaseEnum;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rooseek
 */
public class Enums {

    private static final Map<Class, HashMap<String, Enum>> enumCache = new HashMap<Class, HashMap<String, Enum>>();

    static{
        //TODO initialize with enums under com.creditcloud.model.enums
    }
    /**
     * get enum by key
     *
     * @param <T>
     * @param enumType
     * @param key
     * @return
     */
    public static <T extends Enum<T> & BaseEnum> T getEnumByKey(Class<T> enumType, String key) {
        if (enumType == null || key == null) {
            return null;
        }
        Map cache = enumCache.get(enumType);
        if (cache == null) {
            EnumSet set = EnumSet.allOf(enumType);
            HashMap newEnum = new HashMap<String, Enum>();
            for (Object object : set) {
                T t = (T) object;
                newEnum.put(t.getKey(), t.name());
                if (t.getKey().equals(key)) {
                    return t;
                }
            }
            enumCache.put(enumType, newEnum);
        } else {
            return (T) cache.get(key);
        }
        return null;
    }
}