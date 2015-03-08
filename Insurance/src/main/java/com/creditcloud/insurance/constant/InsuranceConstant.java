/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.constant;

/**
 * 保险字段规范
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public interface InsuranceConstant {

    /**
     * SKU代码最大长度
     */
    int MAX_SKU_CODE = 50;
    
    /**
     * 产品名称最大长度
     */
    int MAX_PRODUCT_NAME = 200;
 
    /**
     * 最低利率
     */
    int MIN_RATE = 0;

    /**
     * 最高利率
     */
    int MAX_RATE = 10000;
}
