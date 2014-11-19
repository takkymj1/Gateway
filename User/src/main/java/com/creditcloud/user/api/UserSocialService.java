/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.user.UserLoginResult;
import com.creditcloud.user.social.ConnectSocialResult;
import com.creditcloud.user.social.SocialId;
import com.creditcloud.user.social.SocialUser;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rooseek
 */
interface UserSocialService {

    /**
     * 验证用户并与SocialId绑定
     *
     * @param clientCode
     * @param loginName
     * @param password
     * @param socialId
     * @param socialInfo
     * @return
     */
    UserLoginResult connectSocial(String clientCode,
                                  String loginName,
                                  String password,
                                  SocialId socialId,
                                  Map<String, String> socialInfo);

    /**
     * connect user with socailId
     *
     * @param clientCode
     * @param userId
     * @param socialId
     * @return
     */
    ConnectSocialResult connectSocial(String clientCode,
                                      String userId,
                                      SocialId socialId);

    /**
     * check if socialId is available
     *
     * @param clientCode
     * @param socialId
     * @return true if available, false if already taken
     */
    boolean checkSocialId(String clientCode, SocialId socialId);

    /**
     * find social user by social id
     *
     * @param clientCode
     * @param socialId
     * @return
     */
    SocialUser findSocialUserBySocialId(String clientCode, SocialId socialId);

    /**
     * find social user by userId
     *
     * @param clientCode
     * @param userId
     * @return
     */
    List<SocialUser> listSocialUserByUserId(String clientCode, String userId);
}
