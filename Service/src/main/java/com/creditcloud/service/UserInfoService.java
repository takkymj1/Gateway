/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.userinfo.CareerInfo;
import com.creditcloud.model.userinfo.ContactInfo;
import com.creditcloud.model.userinfo.CreditInfo;
import com.creditcloud.model.userinfo.FinanceInfo;
import com.creditcloud.model.userinfo.PersonalInfo;
import com.creditcloud.model.userinfo.UserInfo;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserInfoService {

    /**
     * get UserInfo by user Id
     *
     * @param clientCode
     * @param userId
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    UserInfo getByUserId(String clientCode, String userId);

    /**
     * add new UserInfo
     *
     * @param clientCode
     * @param info
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void addNew(String clientCode, UserInfo info);

    /**
     * update UserInfo
     *
     * @param clientCode
     * @param info
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, UserInfo info);

    /**
     * delete user info by user Id
     *
     * @param clientCode
     * @param userId
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void deleteByUserId(String clientCode, String userId);

    /**
     * update PersonalInfo of UserInfo individually
     *
     * @param clientCode
     * @param userId
     * @param personal
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, String userId, PersonalInfo personal);

    /**
     * update FinanceInfo of UserInfo individually
     *
     * @param clientCode
     * @param userId
     * @param info
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, String userId, FinanceInfo finance);

    /**
     * update CareerInfo of UserInfo individually
     *
     * @param clientCode
     * @param userId
     * @param personal
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, String userId, CareerInfo career);

    /**
     * *
     * update ContactInfo of userInfo individually
     *
     * @param clientCode
     * @param userId
     * @param contact
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, String userId, ContactInfo contact);

    /**
     *
     * update CreditInfo of userInfo individually
     *
     * @param clientCode
     * @param userId
     * @param credit
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    void update(String clientCode, String userId, CreditInfo credit);
}
