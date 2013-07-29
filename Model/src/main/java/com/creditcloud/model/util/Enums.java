/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.enums.BaseEnum;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author rooseek
 */
public class Enums {

    private static final Map<Class, HashMap<String, Enum>> enumCache = new HashMap<Class, HashMap<String, Enum>>();

    private static final String[] enumPackages = {"com.creditcloud.model.enums"};

    static {
        for (String enumPackage : enumPackages) {
            Reflections reflection = new Reflections(enumPackage);
            Set<Class<? extends Enum>> set = reflection.getSubTypesOf(Enum.class);
            for (Class<? extends Enum> clazz : set) {
                EnumSet enums = EnumSet.allOf(clazz);
                HashMap newEnum = new HashMap<String, Enum>();
                for (Object object : enums) {
                    newEnum.put(((BaseEnum) object).getKey(), object);
                }
                enumCache.put(clazz, newEnum);
            }
        }
    }

    /**
     * get enum by key
     *
     * @param <T>
     * @param enumType
     * @param key
     * @return
     */
    public static <T extends Enum<T> & BaseEnum> T getEnumByKey(Class enumType, String key) {
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
        Map cache = enumCache.get(enumType);
        if (cache == null) {
            EnumSet set = EnumSet.allOf(enumType);
            HashMap newEnum = new HashMap<String, Enum>();
            for (Object object : set) {
                T t = (T) object;
                newEnum.put(t.getKey(), t.name());
                if (t.getKey().equals(key)) {
                    result = t;
                }
            }
            enumCache.put(enumType, newEnum);
        } else {
            result = (T) cache.get(key);
        }
        return result;
    }
}