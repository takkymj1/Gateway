/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 诺安基金工具类
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class LionUtils {

    public static Map convertObjToMap(Object object) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map<String, String> objectAsMap = new HashMap<>();
        BeanInfo info = Introspector.getBeanInfo(object.getClass());
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            Method reader = pd.getReadMethod();
            if (!pd.getName().contentEquals("class") && reader != null) {
                Object obj = reader.invoke(object);
                if (obj != null) {
                    objectAsMap.put(pd.getName(), String.valueOf(reader.invoke(object)));
                }
            }
        }
        return objectAsMap;
    }
    
    public static String convertMapToOrderedData(Map map){
        StringBuilder sequence = new StringBuilder();
        Set set = map.keySet();
        Object[] ObjectArr = set.toArray();
        String[] keyArr = new String[ObjectArr.length];
        for (int i = 0; i < ObjectArr.length; i++) {
            keyArr[i] = (String) ObjectArr[i];
        }
        Arrays.sort(keyArr, String.CASE_INSENSITIVE_ORDER);
        for (String key : keyArr) {
            sequence.append(key.trim()).append(map.get(key).toString().trim());
        }
        return sequence.toString();
    }
}
