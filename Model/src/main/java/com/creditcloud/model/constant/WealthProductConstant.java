/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author rooseek
 */
public interface WealthProductConstant {

    /**
     * 理财产品最小募集额
     */
    int MIN_WEALTH_PRODUCT_AMOUNT = 1000000;

    /**
     * 理财产品最大募集额
     */
    int MAX_WEALTH_PRODUCT_AMOUNT = 100000000;

    /**
     * 理财产品最小投资额
     */
    int MIN_INVEST_AMOUNT = 10000;
    
    /**
     * 理财产品最大投资额
     */
    int MAX_INVEST_AMOUNT = MAX_WEALTH_PRODUCT_AMOUNT;

    /**
     * 理财产品投资递增额
     */
    int INVEST_AMOUNT_INCREMENT = 10000;
}
