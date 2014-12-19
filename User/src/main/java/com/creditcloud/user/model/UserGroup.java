/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.user.UserConstant;
import java.util.Date;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 平台自定义用户组
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class UserGroup extends BaseObject {

    private static final long serialVersionUID = 20141218L;

    private String id;

    @Size(max = UserConstant.MAX_USER_GROUP_NAME)
    private String name;

    @Size(max = UserConstant.MAX_USER_GROUP_DESCRIPTION)
    private String description;

    private String parentId;

    private Date timeCreated;

    private Date timeLastUpdated;

    public UserGroup(String id,
                     String name,
                     String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
