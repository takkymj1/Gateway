/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.user.model.UserInvitation;
import java.util.List;

/**
 *
 * @author chai
 */
public interface UserInvitationService {
    /**
     * 查看提供的信息是否为邀请信息
     * @param clientCode
     * @param invitationInfo
     * @return 
     */
    boolean isInvited(String clientCode, RealmEntity invitationInfo);
    
    /**
     * 根据邀请人userId，查找受邀列表
     * @param clientCode
     * @param pageInfo 
     * @param inviter
     * @return 
     */
    PagedResult<UserInvitation> listInvitationByInviter(String clientCode, PageInfo pageInfo, String inviter);
    
    /**
     * 根据ID查找邀请信息
     * @param id
     * @return 
     */
    UserInvitation findInvitationById(String id);
    
    /**
     * 创建新的邀请信息
     * @param clientCode
     * @param userInvitation
     * @return 
     */
    UserInvitation addUserInvitation(String clientCode, UserInvitation userInvitation);
    
    /**
     * 修改邀请信息
     * @param clientCode
     * @param userInvitation
     * @return 
     */
    UserInvitation updateUserInvitation(String clientCode, UserInvitation userInvitation);
    
    /**
     * 根据受邀信息列出邀请信息
     * @param clientCode
     * @param invitedInfo
     * @return 
     */
    List<com.creditcloud.user.model.UserInvitation> ListInvitationByInvitedInfo(String clientCode, RealmEntity invitedInfo);
}
