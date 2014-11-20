/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.EmailAddress;
import com.creditcloud.model.constraints.LoginName;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import com.creditcloud.user.constant.UserConstants;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO 进一步结构化地址,省市区等预存然后选择
 *
 * @author rooseek
 */
@NoArgsConstructor
@Data
public class ShippingAddress extends BaseObject {

    private static final long serialVersionUID = 20141018L;

    @PathParam("shippingAddressId")
    private String id;

    @PathParam("userId")
    @NotNull
    private String userId;

    @FormParam("realName")
//    @RealName
    @LoginName // for feng 
    private String realName;

    /**
     * 13810002000 or 010-61006200
     */
    @FormParam("contact")
    private String contact;

    @FormParam("email")
    @EmailAddress
    private String email;

    /**
     * 北京西城区二环到三环西直门外大街金贸中心A座1627室</p>
     * 全称或json结构化
     *
     */
    @FormParam("detail")
    @Size(max = UserConstants.MAX_SHIPPING_ADDRESS_LENGTH)
    private String detail;

    private boolean defaultAddress;

    //公司地址，老家地址
    @FormParam("alias")
    private String alias;

    public ShippingAddress(String id,
                           String userId,
                           String realName,
                           String contact,
                           String email,
                           String detail,
                           boolean defaultAddress,
                           String alias) {
        this.id = id;
        this.userId = userId;
        this.realName = realName;
        this.contact = contact;
        this.email = email;
        this.detail = detail;
        this.defaultAddress = defaultAddress;
        this.alias = alias;
    }
}
