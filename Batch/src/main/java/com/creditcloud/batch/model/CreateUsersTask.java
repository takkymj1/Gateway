/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author sobranie
 */
@ToString(callSuper = true)
public class CreateUsersTask extends Task {
    
    /**
     * 真实姓名
     */
    @Getter
    @NotNull
    @RealName
    private String name;
    
    @Getter
    @NotNull
    @IdNumber
    private String idNumber;
    
    @Getter
    @NotNull
    @MobileNumber
    private String mobile;
    
    
}
