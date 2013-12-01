/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.UserFund;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserFundService {

    /**
     * get user fund by user id
     *
     * @param clientCode
     * @param userId
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    public UserFund getByUser(String clientCode, String userId);

    /**
     * 更新用户资金账户
     *
     * @param clientCode
     * @param fund
     */
    public void update(String clientCode, UserFund fund);

    /**
     * 创建用户资金账户和自动投标
     *
     * @param clientCode
     * @param userId
     */
    public void create(String clientCode, String userId);
}
