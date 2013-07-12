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
     * @return
     */
    List<User> listAllUsers(String clientCode);

    /**
     * list all users with criteria for client
     *
     * @param clientCode
     * @param criteriaInfo
     * @return
     */
    PagedResult<User> listUsers(String clientCode, CriteriaInfo criteriaInfo);

    /**
     * add new user for client
     *
     * @param clientCode
     * @param user
     */
    void addUser(String clientCode, User user);

    /**
     * remove user for client
     *
     * @param clientCode
     * @param user
     */
    void deleteUser(String clientCode, User user);

    /**
     * update user information for client
     *
     * @param clientCode
     * @param user
     */
    void updateUser(String clientCode, User user);

    /**
     * find user by login name
     *
     * @param clientCode
     * @param loginName
     */
    User findByLoginName(String clientCode, String loginName);

    /**
     * find user by user Id
     *
     * @param clientCode
     * @param loginName
     * @return
     */
    User findByUserId(String clientCode, String userId);

    /**
     * delete user by login name
     *
     * @param clientCode
     * @param loginName
     */
    void deleteByLoginName(String clientCode, String loginName);

    /**
     * delete user by user Id
     *
     * @param clientCode
     * @param Id
     */
    void deleteByUserId(String clientCode, String userId);
}
