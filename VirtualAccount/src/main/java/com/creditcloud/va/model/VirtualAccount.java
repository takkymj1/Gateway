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
    
    private String ownerName;
    
    /**
     * 是否该所有者名下的主虚拟账户
     */
    @NotNull
    private Boolean isPrimary;

    /**
     * 当前余额
     */
    @NotNull
    private BigDecimal balance;
    
    @NotNull
    private String accountName;
    
    /**
     * 是否有效
     */
    @NotNull
    private Boolean isValid;
    
    /**
     * 余额最后变动时间
     */
    @NotNull
    @Past
    private Date lastModified;
    
    public VirtualAccount(){}
    
    public VirtualAccount(String id,RealmEntity owner,BigDecimal balance,Boolean isValid,String accountName,Boolean isPrimary,Date lastModified,String ownerName){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.isValid = isValid;
        this.accountName = accountName;
        this.isPrimary = isPrimary;
        this.lastModified = lastModified;
        this.ownerName = ownerName;
    }


}
