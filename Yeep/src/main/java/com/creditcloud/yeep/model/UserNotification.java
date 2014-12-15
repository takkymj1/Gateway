/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */

public class UserNotification extends BaseNotification {

    //用户编号
    @NotNull
    @XmlTransient
    private String platformUserNo;

    public UserNotification(String platformUserNo, 
                            String platformNo, 
                            BizType bizType, 
                            String code, 
                            String message) {
        super(platformNo, bizType, code, message);
        this.platformUserNo = platformUserNo;
    }

    public UserNotification() {
    }

    public String getPlatformUserNo() {
        return platformUserNo;
    }

    public void setPlatformUserNo(String platformUserNo) {
        this.platformUserNo = platformUserNo;
    }
    
}
