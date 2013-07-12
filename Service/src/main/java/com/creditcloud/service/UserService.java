/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.User;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.LoginName;
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
     * @return
     */
    List<User> listAllUsers();

    /**
     * list all users with criteria for client
     *
     * @param criteriaInfo
     * @return
     */
    PagedResult<User> listUsers(CriteriaInfo criteriaInfo);

    /**
     * add new user for client
     *
     * @param user
     */
    void addUser(User user);

    /**
     * remove user for client
     *
     * @param user
     */
    void deleteUser(User user);

    /**
     * update user information for client
     *
     * @param user
     */
    void updateUser(User user);
    
    /**
     * find user by login name
     * 
     * @param loginName 
     */
    User findByLoginName(@LoginName String loginName);
    
    /**
     * find user by user Id
     * 
     * @param loginName
     * @return 
     */
    User findByUserId(String userId);
    
    /**
     * delete user by login name
     * 
     * @param loginName 
     */
    void deleteByLoginName(@LoginName String loginName);
    
    /**
     * delete user by user Id
     * 
     * @param Id 
     */
    void deleteByUserId(String userId);
    
    
}
