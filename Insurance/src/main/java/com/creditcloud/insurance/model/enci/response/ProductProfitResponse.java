/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
public class ProductProfitResponse extends BaseDTO{
    
    /**
     * 计价日期
     * 格式：yyyy-MM-dd
     */
    @NotNull
    private String valuationDate;
    
    /**
     * 单价
     * 单位：元/份
     */
    @NotNull
    private BigDecimal unitPrice;
    
    /**
     * 当日年化收益率
     * 以元为单位，六位小数
     */
    @NotNull
    private BigDecimal dayRate;
}
