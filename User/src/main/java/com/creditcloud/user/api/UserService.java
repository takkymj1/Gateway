/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.User;
import com.creditcloud.user.model.UserProperty;
import com.creditcloud.user.social.SocialId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface UserService extends UserSecurityService, UserRewardService, UserSocialService, UserInvitationService {

    /**
     * list all users for client
     *
     * @param clientCode
     * @return empty list if no user found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    @Deprecated
    List<User> listAllUsers(String clientCode);

    /**
     * list all disabled users for client
     *
     * @param clientCode
     * @return empty list if no user found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    @Deprecated
    List<User> listDisabledUsers(String clientCode);

    /**
     * count all users for client
     *
     * @param clientCode
     * @return
     */
    int countByClient(String clientCode);

    /**
     * 列出员工开户的用户列表
     *
     * @param clientCode
     * @param employeeId
     * @param info
     * @param source
     * @return
     */
    PagedResult<User> listByEmployee(String clientCode, String employeeId, PageInfo info, Source... source);

    /**
     * list all users with criteria for client
     *
     * @param clientCode
     * @param criteriaInfo
     * @return empty result is no user found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    @Deprecated
    PagedResult<User> listUsers(String clientCode, CriteriaInfo criteriaInfo);

    /**
     *
     * @param clientCode
     * @param from
     * @param to
     * @param pageInfo
     * @return
     */
    PagedResult<User> listByLoginDate(String clientCode, Date from, Date to, PageInfo pageInfo);

    /**
     * 增加一个用户，属于后台或平板开户，系统生成随机密码发送到用户手机,或者使用配置文件中默认密码
     *
     * @param clientCode
     * @param user
     * @return user created
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User addUser(String clientCode, User user);

    /**
     * 增加一个用户，前台开户流程，传入的用户密码是由用户直接设置
     *
     * @param clientCode
     * @param user
     * @param password
     * @param loginInfo
     * @param source
     * @return
     */
    User addUser(String clientCode,
                 User user,
                 String password,
                 Map<String, String> loginInfo,
                 Source source);

    /**
     * 通过社交联合登录增加一个用户，用socialId来识别.
     *
     * 需要在调用前先判断User信息是否已经存在，如存在应该调用connectSocial方法
     *
     * @param clientCode
     * @param user
     * @param socialId
     * @param socialInfo
     * @return null表示新建用户失败，可能因为传入的User和现有User信息冲突
     */
    User addUser(String clientCode,
                 User user,
                 SocialId socialId,
                 Map<String, String> socialInfo);

    /**
     * update user information for client.
     *
     * 身份证尾号会自动转大写;
     *
     * @param clientCode
     * @param user
     * @return user after update
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User updateUser(String clientCode, User user);

    /**
     * 为指定用户设置身份证号码与真实姓名.
     *
     * 为userId指定的用户直接设置真实姓名和身份证号码
     *
     * 不会做任何验证，直接update内容
     *
     * @param clientCode
     * @param userId
     * @param name       真实姓名
     * @param idNumber   身份证号，不再验证格式，会被转为大写
     * @return 更新后的用户，null表示没有找到
     */
    User setIdAndName(String clientCode, String userId, String name, String idNumber);

    /**
     * 为指定用户设置身份证号码、真实姓名和电子邮箱.
     *
     * 不会做任何验证，直接update内容
     *
     * @param clientCode
     * @param userId
     * @param name
     * @param idNumber
     * @param email
     * @return
     */
    User setIdAndNameAndEmail(String clientCode, String userId, String name, String idNumber, String email);

    //find methods
    /**
     * find user by login name
     *
     * @param clientCode
     * @param loginName
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User findByLoginName(String clientCode, String loginName);

    /**
     * find user by user Id
     *
     * @param clientCode
     * @param userId
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User findByUserId(String clientCode, String userId);

    /**
     * find user by mobile number
     *
     * @param clientCode
     * @param mobile
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User findByMobile(String clientCode, String mobile);

    /**
     * find user by idNumber.
     *
     * 用户身份证尾号x自动转化为X
     *
     * @param clientCode
     * @param idNumber
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User findByIdNumber(String clientCode, String idNumber);

    /**
     * find user by email</p>
     * 查看email是否被占用,使用checkEmail方法
     *
     * @param clientCode
     * @param email
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     * @throw NonUniqueResultException if more than one user found
     */
    @Deprecated
    User findByEmail(String clientCode, String email);

    /**
     * delete user by user Id
     *
     * @deprecated 不能真正删除改用户
     * @param clientCode
     * @param userId
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    @Deprecated
    void deleteByUserId(String clientCode, String userId);

    /**
     * 禁用用户.
     *
     * 用户将不能登录并得到提示
     *
     * @param clientCode
     * @param userId
     */
    void disableUser(String clientCode, String userId);

    /**
     * 启用用户.
     *
     * 与禁用用户相反
     *
     * @param clientCode
     * @param userId
     */
    void enableUser(String clientCode, String userId);

    //check methods used on registration
    /**
     * Check if the mobile is available.
     *
     * @param clientCode
     * @param mobile
     * @return true if this mobile is available, false if already occupied.
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean checkMobile(String clientCode, String mobile);

    /**
     * Check if the idNumber is available.
     *
     * 尾号x自动转为大写X
     *
     * @param clientCode
     * @param idNumber
     * @return true if this idNumber is available, false if already occupied
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean checkIdNumber(String clientCode, String idNumber);

    /**
     * Check if the loginName is available.
     *
     * @param clientCode
     * @param loginName
     * @return true if this loginName is available, false if already taken.
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean checkLoginName(String clientCode, String loginName);

    /**
     * check if email is available
     *
     * @param clientCode
     * @param email
     * @return true if this email is available,false if already taken
     */
    boolean checkEmail(String clientCode, String email);

    /**
     * 验证所有用户信息
     *
     * @param clientCode
     * @return 返回所有验证不通过的用户信息
     */
    @Deprecated
    List<UserProperty> validateAllUser(String clientCode);

    /**
     * 根据用户组列出用户
     *
     * @param clientCode
     * @param pageInfo
     * @param groupId
     * @return
     */
    PagedResult<User> listByGroup(String clientCode, PageInfo pageInfo, String groupId);

    /**
     * 根据用户组code列出用户
     *
     * @param clientCode
     * @param pageInfo
     * @param groupCode
     * @return
     */
    PagedResult<User> listByGroupCode(String clientCode, PageInfo pageInfo, String groupCode);
    /**
     * 设置用户渠道
     * @param clientCode
     * @param userId
     * @param channel
     * @return 
     */
    public com.creditcloud.model.user.User setChannel(String clientCode, String userId, String channel) ;
}
