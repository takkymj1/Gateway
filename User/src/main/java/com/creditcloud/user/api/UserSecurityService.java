/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.user.UserLoginResult;
import com.creditcloud.user.UserAuthenticate;
import com.creditcloud.user.social.SocialId;
import java.util.Map;

/**
 * wrap security related methods for user<p>
 * 为安全考虑, 只允许一次更新单独一个field，不允许一次性更新整个UserAuthenticate
 *
 * @author rooseek
 */
interface UserSecurityService {
    
    /**
     * 快速登录，不保存登录记录等
     * 
     * @param clientCode
     * @param credential
     * @param password
     * @return 
     */
    UserLoginResult quickLogin(String clientCode,
                               String credential,
                               String password);

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
     * 用户通过手机号登陆.
     *
     * 不要求用户的手机号是绑定成功的，只是检查手机号、密码匹配
     *
     * @param clientCode
     * @param mobile
     * @param password
     * @param loginInfo
     * @param source
     * @return
     */
    UserLoginResult loginMobile(String clientCode,
                                String mobile,
                                String password,
                                Map<String, String> loginInfo,
                                Source source);

    /**
     * 通过SocialId验证用户登陆
     *
     * @param clientCode
     * @param socialId
     * @param loginInfo
     * @return
     */
    UserLoginResult loginSocial(String clientCode, SocialId socialId, Map<String, String> loginInfo);

    /**
     * 修改密码
     *
     * @param clientCode
     * @param loginName
     * @param oldPassword
     * @param newPassword
     * @return true if loginName exist and old password word match, and set new
     *         password successful
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
     * 忘记密码时，根据指定密码重设密码
     *
     * @param clientCode
     * @param mobile
     * @param password
     * @return
     */
    boolean resetPassword(String clientCode, String mobile, String password);
    
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
     * 标记邮箱验证结果
     *
     * @param clientCode
     * @param userId
     * @param authenticated 邮箱验证结果
     * @return
     */
    boolean markEmailAuthenticated(String clientCode, String userId, boolean authenticated);

    /**
     * 手机验证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markMobileAuthenticated(String clientCode, String userId);

    /**
     * 微博认证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markWeiboAuthenticated(String clientCode, String userId);

    /**
     * 微信认证通过
     *
     * @param clientCode
     * @param userId
     * @return
     */
    boolean markWechatAuthenticated(String clientCode, String userId);
}
