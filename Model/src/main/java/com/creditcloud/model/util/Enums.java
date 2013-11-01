/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.enums.BaseEnum;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author rooseek
 */
public class Enums {

    private static final ConcurrentHashMap<Class, HashMap<String, Enum>> enumCache = new ConcurrentHashMap<>();

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

        //must be subclass of Enum
        if (!Enum.class.isAssignableFrom(enumType)) {
            throw new IllegalArgumentException("class " + enumType.getName() + " must be a subclass of Enum.");
        }

        //must be implementation of BaseEnum
        if (!BaseEnum.class.isAssignableFrom(enumType)) {
            throw new IllegalArgumentException("class " + enumType.getName() + " must be an implementation of BaseEnum.");
        }

        T result = null;
        Map<String,Enum> cache = enumCache.get(enumType);
        if (cache == null) {
            EnumSet set = EnumSet.allOf(enumType);
            HashMap<String, Enum> newEnum = new HashMap<>();
            for (Object object : set) {
                T t = (T) object;
                newEnum.put(t.getKey(), t);
                if (t.getKey().equals(key)) {
                    result = t;
                }
            }
            enumCache.putIfAbsent(enumType, newEnum);
        } else {
            result = (T) cache.get(key);
        }
        return result;
    }
}