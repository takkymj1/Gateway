/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FssStats extends BaseObject {
    
    @Min(0)
    private BigDecimal totalAsset = BigDecimal.ZERO;
    
    @Min(0)
    private BigDecimal totalProfit = BigDecimal.ZERO;
    
    @Min(0)
    private BigDecimal totalDeposit = BigDecimal.ZERO;
    
    @Min(0)
    private BigDecimal totalWithdraw = BigDecimal.ZERO;
}
