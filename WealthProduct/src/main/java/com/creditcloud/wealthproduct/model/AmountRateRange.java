/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

/**
 * 收益区间，每个理财产品可以有多个收益区间，默认按照投资金额
 *
 * @author rooseek
 */
public class AmountRateRange {

    /**
     * 对应理财产品id
     */
    private String productId;

    /**
     * 最低投资额
     */
    private int minAmount;

    /**
     * 最高投资额
     */
    private int maxAmount;

    /**
     * 收益率
     */
    private int rate;

}
