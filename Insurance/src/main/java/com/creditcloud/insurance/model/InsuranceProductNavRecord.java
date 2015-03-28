/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

import com.creditcloud.insurance.model.enci.enums.ProductType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceProductNavRecord extends BaseObject {
    
    private String id;
    
    /**
     * 保险产品ID
     */
    @NotNull
    private String productId;
    
    /**
     * 保险产品编码
     */
    private String productCode;
    
    /**
     * 保险产品类型
     */
    private ProductType productType;
    
    /**
     * 净值
     */
    private BigDecimal nav;
    
    /**
     * 当日年化收益率
     */
    private BigDecimal dayAnnualBenifitRate;
    
    /**
     * 计价日
     */
    @NotNull
    private Date valutionDate;
    
    /**
     * 数据记录日期
     * 改日期不可更新
     */
    private Date timeRecorded;
}
