/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.ElementCount;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.user.User;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * user referral related
 *
 * @author rooseek
 */
interface UserRewardService {

    /**
     * 设置或更新推荐人
     *
     * @param clientCode
     * @param userId
     * @param referral
     * @return
     */
    boolean setReferral(String clientCode, String userId, RealmEntity referral);

    /**
     * 根据推荐人列出用户
     *
     * @param clientCode
     * @param referral
     * @param from       被推荐用户注册起始时间
     * @param to         被推荐用户注册截止时间
     * @param pageInfo
     * @return
     */
    PagedResult<User> listByReferral(String clientCode, Date from, Date to, RealmEntity referral, PageInfo pageInfo);

    /**
     * 按照referral来统计
     *
     * @param clientCode
     * @param from       被推荐用户注册起始时间
     * @param to         被推荐用户注册截止时间
     * @param referral
     * @return
     */
    @Deprecated
    int countByReferral(String clientCode, Date from, Date to, RealmEntity referral);

    /**
     * 列出所有推荐人
     *
     * @param clientCode
     * @param pageInfo
     * @param from       推荐人注册起始时间
     * @param to         推荐人注册截止时间
     * @return
     */
    PagedResult<RealmEntity> listReferral(String clientCode, Date from, Date to, PageInfo pageInfo);
    
    /**
     * 获取推荐人列表
     * 
     * @param clientCode
     * @param pageInfo
     * @return 
     */
    PagedResult<RealmEntity> listReferees(String clientCode, PageInfo pageInfo);
    
    /**
     * 根据手机号码查找推荐人
     * 
     * @param clientCode
     * @param from
     * @param to
     * @param pageInfo
     * @param mobile
     * @return 
     */
    PagedResult<RealmEntity> listReferralByMobile(String clientCode, Date from, Date to, PageInfo pageInfo, String mobile);
    
    /**
     * 根据用户名查找推荐人
     * 
     * @param clientCode
     * @param from
     * @param to
     * @param pageInfo
     * @param loginName
     * @return 
     */
    PagedResult<RealmEntity> listReferralByLoginName(String clientCode, Date from, Date to, PageInfo pageInfo, String loginName);

    /**
     * 统计所有推荐人
     *
     * @param clientCode
     * @param from       推荐人注册起始时间
     * @param to         推荐人注册截止时间
     * @return
     */
    int countReferral(String clientCode, Date from, Date to);

    /**
     * 统计一段时间内每个推荐人的推荐注册用户数,按照用戶注册时间filter
     *
     * @param clientCode
     * @param from       被推荐用户注册起始时间
     * @param to         被推荐用户注册截止时间
     * @param all        true for all, false for only unrewarded referral
     * @return
     */
    List<ElementCount<RealmEntity>> countAllByReferral(String clientCode, Date from, Date to, boolean all);

    /**
     *
     * @param clientCode
     * @param from       被推荐用户注册起始时间
     * @param to         被推荐用户注册截止时间
     * @param all        true for all, false for only unrewarded referral
     * @return
     */
    Map<RealmEntity, List<User>> listAllByReferral(String clientCode, Date from, Date to, boolean all);

    /**
     * 推荐用户奖励
     *
     * @param clientCode
     * @param userId
     */
    void markReferralRewarded(String clientCode, String... userId);

    /**
     * 列出一段时间内注册的用户
     *
     * @param clientCode
     * @param from       用戶注册起始时间
     * @param to         用户注册截止时间
     * @param info
     * @param all        true for all, false for only unrewarded user
     * @return
     */
    PagedResult<User> listByRegisterDate(String clientCode, Date from, Date to, PageInfo info, boolean all);

    /**
     * 注册用户奖励
     *
     * @param clientCode
     * @param userId
     */
    void markRegistryRewarded(String clientCode, String... userId);
}
