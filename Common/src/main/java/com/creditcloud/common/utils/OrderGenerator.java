/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * TODO this generator should be replaced with a service
 *
 * @author rooseek
 */
public class OrderGenerator {

    //for pnr order length
    private static final int DEFAULT_ORDER_LENGHT = 20;

    /**
     * generate random numeric order, with default length 
     *
     * @return
     */
    public static String order() {
        return order(DEFAULT_ORDER_LENGHT);
    }

    
    private static String order(int length) {
        return RandomStringUtils.randomNumeric(length);
    }
}
