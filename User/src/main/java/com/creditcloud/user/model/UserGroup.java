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
import org.apache.commons.lang3.RandomStringUtils;

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
    
    /**
     * 可以直接存邮件后缀，或者邮件正则，用来过滤本组用户邮件
     */
    private String emailPattern;

    /**
     * 用户组验证码（目前用来在用户注册时进行匹配验证）
     */
    private String groupCode;
    
    /**
     * 平台自定义field
     */
    private String priv;

    public UserGroup(String id,
                     String name,
                     String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    /**
     * 随机生成6位随机码作为组验证码
     */
    public void setRandomGroupCode(){
        String randomChars = "abcdefghjklmnpqrstuvwxyz";
        String randomGroupCode = RandomStringUtils.random(6, randomChars);
        this.groupCode = randomGroupCode;
    }
}
