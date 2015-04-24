/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.loan.Duration;

/**
 * 按照久期(期限)收益区间，每个理财产品可以有多个收益区间
 *
 * @author rooseek
 */
public class DurationRateRange {

    /**
     * 对应理财产品id
     */
    private String productId;

    /**
     * 最低持有期限
     */
    private Duration minDuration;

    /**
     * 最高持有期限
     */
    private Duration maxDuration;

    /**
     * 收益率
     */
    private int rate;

}
