/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.taglib;

import java.util.Collection;

/**
 * 实现JSTL表达式中通用的一些function
 *
 * @author sobranie
 */
public class Functions {
    
    /**
     * 判断一个集合中是否包含某元素
     * 
     * @param all
     * @param item
     * @return 
     */
    public static boolean contains(Collection all, Object item) {
        return all.contains(item);
    }

    /**
     * 判断一个集合中是否包含另一个集合中的任意一个元素.
     * 
     * 主要用在权限判断方面
     * 
     * @param all
     * @param items
     * @return 
     */
    public static boolean containsAny(Collection all, Collection items) {
        for (Object item : items) {
            if (all.contains(item)) {
                return true;
            }
        }
        return false;
    }
}
