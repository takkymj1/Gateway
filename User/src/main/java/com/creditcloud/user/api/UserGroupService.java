/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.user.model.UserGroup;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserGroupService {

    UserGroup addNew(String clientCode, UserGroup group);

    UserGroup update(String clientCode, UserGroup group);

    UserGroup getById(String clientCode, String groupId);

    List<UserGroup> listAll(String clientCode);

    /**
     * 设置用户所属用户组
     *
     * @param clientCode
     * @param userId
     * @param groupId
     * @return false if user not found
     */
    boolean changeGroup(String clientCode, String userId, String groupId);
    
    /**
     * 根据groupCode查找用户组
     * @param clientCode
     * @param groupCode
     * @return 
     */
    List<UserGroup> listByGroupCode(String clientCode, String groupCode);
    
    /**
     * 根据groupName查找用户组
     * 
     * @param clientCode
     * @param groupName
     * @return 
     */
    List<UserGroup> listByGroupName(String clientCode,String groupName);
}
