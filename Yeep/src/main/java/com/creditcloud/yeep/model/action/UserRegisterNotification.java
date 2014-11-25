/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class UserRegisterNotification extends UserNotification {
    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public UserRegisterNotification(String platformUserNo,
                                    String platformNo,
                                    BizType bizType,
                                    String code,
                                    String message,
                                    String requestNo) {
        super(platformUserNo, platformNo, bizType, code, message);
        this.requestNo = requestNo;
    }
}
