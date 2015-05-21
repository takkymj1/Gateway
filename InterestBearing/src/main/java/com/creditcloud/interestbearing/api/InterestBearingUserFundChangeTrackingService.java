/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.model.InterestBearingUserFundChange;
import javax.ejb.Remote;

/**
 * 在用户资金服务中使用，用来监控用户余额生息资金的变动并执行相应的操作
 *
 * @author guohuazhang
 */
@Remote
public interface InterestBearingUserFundChangeTrackingService {

    /**
     * 处理一个用户余额生息资金变动:登记到数据库，通知TA
     *
     * @param change
     */
    void process(InterestBearingUserFundChange change);
}
