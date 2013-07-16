/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.User;
import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface UserService {

    /**
     * list all users for client
     *
     * @param clientCode
     * @return empty list if no user found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<User> listAllUsers(String clientCode);

    /**
     * list all users with criteria for client
     *
     * @param clientCode
     * @param criteriaInfo
     * @return empty result is no user found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<User> listUsers(String clientCode, CriteriaInfo criteriaInfo);

    /**
     * add new user for client
     *
     * @param clientCode
     * @param user
     * @return true if added successfully, false if not succeed;
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean addUser(String clientCode, User user);

    /**
     * remove user for client
     *
     * @param clientCode
     * @param user
     * @return true if deleted successfully, false if not succeed
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean deleteUser(String clientCode, User user);

    /**
     * update user information for client
     *
     * @param clientCode
     * @param user
     * @return true if updated successfully, false if not succeed
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean updateUser(String clientCode, User user);

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
     * @param loginName
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
     * find user by idNumber
     *
     * @param clientCode
     * @param idNumber
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    User findByIdNumber(String clientCode, String idNumber);

    //delete methods
    /**
     * delete user by login name
     *
     * @param clientCode
     * @param loginName
     * @return true if delete successfully, false if not succeed
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean deleteByLoginName(String clientCode, String loginName);

    /**
     * delete user by user Id
     *
     * @param clientCode
     * @param Id
     * @return true if delete successfully, false if not succeed
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    boolean deleteByUserId(String clientCode, String userId);

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
     * Check if the idNumber is available
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
}
