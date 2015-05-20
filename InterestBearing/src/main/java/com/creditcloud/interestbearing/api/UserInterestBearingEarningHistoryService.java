/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import javax.ejb.Remote;

/**
 * 查询用户余额生息收益历史记录 (仅从数据库读取，生息收益记录的产生在其他逻辑内)
 *
 * @author guohuazhang
 */
@Remote
public interface UserInterestBearingEarningHistoryService {

    public String ping();
}
