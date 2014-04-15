/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.LoginResult;
import com.creditcloud.model.user.corporation.CorporationUser;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class CorporationLoginResult extends BaseObject{

    private static final long serialVersionUID = 20140415L;

    @NotNull
    private LoginResult result;

    private CorporationUser user;

    /**
     * 连续登录失败的次数.
     *
     * 包括此次失败
     */
    private int failedAttempts;

}
