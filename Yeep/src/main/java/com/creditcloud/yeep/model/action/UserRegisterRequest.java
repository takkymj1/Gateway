/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.IDCardType;
import com.creditcloud.yeep.model.UserRequest;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class UserRegisterRequest extends UserRequest {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 昵称
     */
    private String nickName;
    /**
     * 会员真实姓名
     */
    @NotNull
    private String realName;

    /**
     * 身份证类型
     */
    @NotNull
    private IDCardType idCardType;

    /**
     * 身份证号
     */
    @NotNull
    private String idCardNo;

    /**
     * 手机号
     */
    @NotNull
    private String mobile;

    /**
     * 邮箱
     */
    @NotNull
    private String email;

    public UserRegisterRequest(String platformNo,
                               String callbackUrl,
                               String notifyUrl,
                               String sign,
                               String platformUserNo,
                               String requestNo,
                               String nickName,
                               String realName,
                               IDCardType idCardType,
                               String idCardNo,
                               String mobile,
                               String email) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.requestNo = requestNo;
        this.nickName = nickName;
        this.realName = realName;
        this.idCardType = idCardType;
        this.idCardNo = idCardNo;
        this.mobile = mobile;
        this.email = email;
    }
}
