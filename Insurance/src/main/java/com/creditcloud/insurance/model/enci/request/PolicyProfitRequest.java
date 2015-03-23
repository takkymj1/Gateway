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
 * 保单收益查询
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyProfitRequest extends BaseDTO{
    
    /**
     * 保单号
     */
    @NotNull
    private String policyNo;
}
