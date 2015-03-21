/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductProfitRequest extends BaseDTO{
 
    /**
     * 险种代码 CD5
     */
    @NotNull
    private String productCode;
    
    /**
     * 查询日期
     * 
     * yyyy-MM-dd
     */
    @NotNull
    private String queryDate;
}
