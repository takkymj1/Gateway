/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *企业代偿专户
 * @author jinlzhang
 */
@Data
@NoArgsConstructor
public class DisburseAccount extends BaseObject {

    private static final long serialVersionUID = 20141110L;

    private String id;
    
    @NotNull
    private String employeeId;
    
    @NotNull
    private String corpId;
    
    @NotNull
    private Boolean enable;
    
    private Date timeCreated;
    
    private Date timeLastUpdated;
    
     public DisburseAccount(String id, 
                          String employeeId,
                          String corpId,
                          Date timeCreated,
                          Date timeLastUpdated,
                          Boolean enable){
         this.id = id;
         this.employeeId = employeeId;
         this.corpId = corpId;
         this.timeCreated = timeCreated;
         this.timeLastUpdated = timeLastUpdated;
         this.enable = enable;
    }
}
