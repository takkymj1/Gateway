/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.wealthproduct.enums.NumericUnit;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数值
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Numeric extends BaseObject {

    /**
     * 数值
     */
    private BigDecimal value;
    
    /**
     * 单位
     */
    private NumericUnit unit;
    
}
