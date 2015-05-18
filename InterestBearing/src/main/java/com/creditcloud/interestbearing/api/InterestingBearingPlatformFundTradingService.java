/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import java.math.BigDecimal;

/**
 *
 * @author guohuazhang
 */
public interface InterestingBearingPlatformFundTradingService {
    // 申购
    void purchase(BigDecimal amount);
    // 赎回

    void redeem(BigDecimal amount);
}
