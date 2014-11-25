/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class UserNotification extends BaseNotification {

    //用户编号
    @NotNull
    private String platformUserNo;

    public UserNotification(String platformUserNo, 
                            String platformNo, 
                            BizType bizType, 
                            String code, 
                            String message) {
        super(platformNo, bizType, code, message);
        this.platformUserNo = platformUserNo;
    }
}
