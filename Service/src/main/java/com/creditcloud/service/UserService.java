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
     * @param clientCode
     * @return
     */
    List<User> listAllUsers(@ClientCode String clientCode);

    /**
     * list all users with criteria for client
     *
     * @param clientCode
     * @param criteriaInfo
     * @return
     */
    PagedResult<User> listUsers(@ClientCode String clientCode, CriteriaInfo criteriaInfo);

    /**
     * add new user for client
     *
     * @param clientCode
     * @param user
     */
    void addUser(@ClientCode String clientCode, User user);

    /**
     * remove user for client
     *
     * @param clientCode
     * @param user
     */
    void deleteUser(@ClientCode String clientCode, User user);

    /**
     * update user information for client
     *
     * @param clientCode
     * @param user
     */
    void updateUser(@ClientCode String clientCode, User user);
    
    /**
     * find user by login name
     * 
     * @param clientCode
     * @param loginName 
     */
    User findByLoginName(@ClientCode String clientCode, @LoginName String loginName);
    
    /**
     * find user by user Id
     * 
     * @param clientCode
     * @param loginName
     * @return 
     */
    User findByUserId(@ClientCode String clientCode, String userId);
    
    /**
     * delete user by login name
     * 
     * @param clientCode
     * @param loginName 
     */
    void deleteByLoginName(@ClientCode String clientCode, @LoginName String loginName);
    
    /**
     * delete user by user Id
     * 
     * @param clientCode
     * @param Id 
     */
    void deleteByUserId(@ClientCode String clientCode, String userId);
    
    
}
