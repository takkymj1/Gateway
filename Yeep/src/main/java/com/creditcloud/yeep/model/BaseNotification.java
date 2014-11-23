/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回调通知
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public abstract class BaseNotification extends BaseObject {

    @NotNull
    private String platformNo;

    @NotNull
    private BizType bizType;

    @NotNull
    private String code;

    private String message;

    @NotNull
    private String requestNo;

    public BaseNotification(String platformNo,
                            BizType bizType,
                            String code,
                            String message,
                            String requestNo) {
        this.platformNo = platformNo;
        this.bizType = bizType;
        this.code = code;
        this.message = message;
        this.requestNo = requestNo;
    }
}
