/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.user.UserLoginResult;
import com.creditcloud.user.UserAuthenticate;
import java.util.Map;
import javax.ejb.Remote;

/**
 * wrap security related methods for user<p>
 * 为安全考虑, 只允许一次更新单独一个field，不允许一次性更新整个UserAuthenticate
 *
 * @author rooseek
 */
@Remote
public interface UserSecurityService {

    /**
     * validate user password for loginName
     *
     * @param clientCode
     * @param loginName
     * @param password
     * @param loginInfo
     * @param source
     * @return UserLoginResult
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    UserLoginResult login(String clientCode,
                          String loginName,
                          String password,
                          Map<String, String> loginInfo,
                          Source source);

    /**
     * 修改密码
     *
     * @param clientCode
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return true if loginName exist and old password word match, and set new
     * password successful
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean changePassword(String clientCode, String loginName, String oldPassword, String newPassword);

    /**
     * 忘记密码时重设密码
     *
     * @param clientCode
     * @param mobile
     * @return
     */
    boolean resetPassword(String clientCode, String mobile);

    /**
     * 获取基本的验证信息
     *
     * @param clientCode
     * @param userId
     * @return
     */
    UserAuthenticate getUserAuthenticate(String clientCode, String userId);

    /**
     * 实名验证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markIDAuthenticated(String clientCode, String userId);

    /**
     * 邮箱验证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markEmailAuthenticated(String clientCode, String userId);

    /**
     * 手机验证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markMobileAuthenticated(String clientCode, String userId);
}
