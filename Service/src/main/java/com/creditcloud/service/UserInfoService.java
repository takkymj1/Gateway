/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

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
    UserInfo getUserInfoByUserId(String clientCode, String userId);
}
