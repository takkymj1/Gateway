/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.utils;

/**
 *
 * @author tinglany
 */
/**
 *
 * @author tinglany
 */
public class YeepUtils {

    /**
     * yeep账户默认使用clientcode+mobile
     *
     * @param clientCode
     * @param mobile
     * @return
     */
    public static String getUserNo(String clientCode, String mobile) {
        String result = clientCode + mobile;
        return result;
    }
}
