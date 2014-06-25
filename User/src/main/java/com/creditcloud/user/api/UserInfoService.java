/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.user.info.CareerInfo;
import com.creditcloud.model.ContactInfo;
import com.creditcloud.model.user.info.FinanceInfo;
import com.creditcloud.model.PersonalInfo;
import com.creditcloud.model.SocialInfo;
import com.creditcloud.model.user.info.UserInfo;
import java.math.BigDecimal;
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
    UserInfo getUserInfoByUserId(String clientCode, String userId);

    /**
     * get UserInfo by IdNumber
     *
     * @param clientCode
     * @param IdNumber
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    UserInfo getUserInfoByIdNumber(String clientCode, String IdNumber);

    /**
     * update UserInfo once for all, mostly called from mobile
     *
     * @param clientCode
     * @param info
     * @return
     */
    @Deprecated
    boolean updateUserInfo(String clientCode, UserInfo info);

    /**
     * update personal info of user
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return
     */
    boolean updatePersonalInfo(String clientCode, String userId, PersonalInfo info);

    /**
     * 员工实地勘察用户的住址等个人信息，需要同时记录经纬度
     *
     * @param clientCode
     * @param userId
     * @param info
     * @param employeeId
     * @param longitude
     * @param latitude
     * @return
     */
    boolean updatePersonalInfo(String clientCode,
                               String userId,
                               PersonalInfo info,
                               String employeeId,
                               BigDecimal longitude,
                               BigDecimal latitude);

    /**
     * update career info
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return
     */
    boolean updateCareerInfo(String clientCode, String userId, CareerInfo info);

    /**
     * 员工实地勘察用户的公司地址等信息，需要记录GPS定位的经纬度
     *
     * @param clientCode
     * @param userId
     * @param info
     * @param employeeId
     * @param longitude
     * @param latitude
     * @return
     */
    boolean updateCareerInfo(String clientCode,
                             String userId,
                             CareerInfo info,
                             String employeeId,
                             BigDecimal longitude,
                             BigDecimal latitude);

    /**
     * update finance info
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return
     */
    boolean updateFinanceInfo(String clientCode, String userId, FinanceInfo info);

    /**
     * update contact info
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return
     */
    boolean updateContactInfo(String clientCode, String userId, ContactInfo info);

    /**
     * update social info
     *
     * @param clientCode
     * @param userId
     * @param info
     * @return
     */
    boolean updateSocialInfo(String clientCode, String userId, SocialInfo info);

    /**
     * checks whether user information is sufficient to submit a loan request
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean validateLoanRequest(String clientCode, String userId);
}
