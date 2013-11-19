/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.social;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;

/**
 * 社交账号信息
 *
 * @author sobranie
 */
public class SocialId extends BaseObject {

    @FormParam("socialId")
    @NotNull
    private String id;

    @FormParam("socialType")
    @NotNull
    private SocialType type;

    public SocialId() {
    }

    public SocialId(String id,
                    SocialType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SocialType getType() {
        return type;
    }

    public void setType(SocialType type) {
        this.type = type;
    }
}
