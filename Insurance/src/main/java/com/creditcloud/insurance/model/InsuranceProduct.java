package com.creditcloud.insurance.model;

import com.creditcloud.insurance.constant.InsuranceConstant;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IncrementalInteger;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 保险
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InsuranceProduct extends BaseObject {
    
    private static final long serialVersionUID = 20150303L;

    /**
     * 唯一标识
     * 
     * @return
     */
    @NotNull
    private String id;
    
    /**
     * 展示顺序
     * 
     * @return
     */
    @Min(1)
    private int ordinal;
    
    /**
     * 险种展示名称
     * 
     * @return
     */
    @Size(max = InsuranceConstant.MAX_PRODUCT_NAME)
    private String name;
    
    /**
     * 险种SKU(产品统一编号)代码
     * 
     * @return
     */
    @Size(max = InsuranceConstant.MAX_SKU_CODE)
    private String skuCode;
    
    /**
     * 险种代码
     * 
     * @return
     */
    private String code;
    
    /**
     * 保额
     * 
     * 以分为单位
     * 
     * @return
     */
    private int amount;
    
    /**
     * 保费
     * 
     * @return
     */
    private int premium;
    
    /**
     * 折扣比率
     */
    @NotNull
    @IncrementalInteger(min = InsuranceConstant.MIN_RATE,
                        increment = 1,
                        max = InsuranceConstant.MAX_RATE,
                        groups = Default.class)
    private int discountRate;
    
    /**
     * 折扣保费/实际保费
     * 
     * =保费×折扣率 以分为单位
     */
    private int discountPremium;
    
    /**
     * 建议持有时间（平台提供）
     */
    private int proposedHoldDuration;
    
    /**
     * 预期收益率（平台提供）
     */
    private int expectedRate;
}