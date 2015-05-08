/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class WealthProductFloat extends BaseObject {

    private String productId;

    private WealthProduct product;
    
    @NotNull
    private BigDecimal nav;
    
    @NotNull
    private Date navDate;
    
    private BigDecimal totalNav;
    
}
