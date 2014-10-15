/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.va.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.UUID;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import lombok.Data;

/**
 * 虚拟账户
 *
 * @author sobranie
 */
@Data
public class VirtualAccount extends BaseObject {
    
    @NotNull
    @UUID
    private String id;

    /**
     * 虚拟账户所有者
     */
    @NotNull
    private RealmEntity owner;
    
    /**
     * 是否该所有者名下的主虚拟账户
     */
    private boolean primary;

    /**
     * 当前余额
     */
    @NotNull
    private BigDecimal balance;
    
    /**
     * 余额最后变动时间
     */
    @NotNull
    @Past
    private Date lastModified;

}
