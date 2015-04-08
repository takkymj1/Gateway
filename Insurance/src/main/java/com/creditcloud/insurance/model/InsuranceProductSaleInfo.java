/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 保险产品购买详情
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceProductSaleInfo extends BaseObject {
    
    /**
     * 产品ID
     */
    private String productId;
    
    /**
     * 产品已购买份数
     */
    private int totalApplyNum;
    
    /**
     * 产品已购买人数
     */
    private int totalApplyUsers;
}
