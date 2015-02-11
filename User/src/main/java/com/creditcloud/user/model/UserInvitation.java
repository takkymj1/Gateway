/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.user.UserInvitationStatus;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInvitation extends BaseObject {
    
    private static final long serialVersionUID = 20150210L;

    private String id;
    
    private RealmEntity invitedInfo;
    
    /**
     * 邀请人的用户ID
     */
    private String inviter;
    
    /**
     * 状态
     */
    private UserInvitationStatus status;
    
    private Date timeCreated;
    
    private Date timeLastUpdated;
}
