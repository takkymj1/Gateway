package com.creditcloud.insurance.model;

import com.creditcloud.insurance.constant.InsuranceConstant;
import com.creditcloud.insurance.model.enci.enums.InsPeriodUnit;
import com.creditcloud.insurance.model.enci.enums.PayMode;
import com.creditcloud.insurance.model.enci.enums.PayPeriodUnit;
import com.creditcloud.insurance.model.enci.enums.ProductType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;
import javax.ws.rs.FormParam;

/**
 * 保险
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class InsuranceProduct extends BaseObject implements InsuranceConstant {
    
    private static final long serialVersionUID = 20150303L;

    /**
     * 唯一标识
     * 
     * @return
     */
    @NotNull
    @FormParam("productId")
    private String id;
    
    /**
     * 展示顺序
     * 
     * @return
     */
    @Min(1)
    @FormParam("ordinal")
    private int ordinal;
    
    /**
     * 险种展示名称
     * 
     * @return
     */
    @FormParam("name")
    @Size(max = MAX_PRODUCT_NAME)
    private String name;
    
    /**
     * 险种SKU(产品统一编号)代码
     * 
     * @return
     */
    @Size(max = MAX_SKU_CODE)
    @FormParam("skuCode")
    private String skuCode;
    
    /**
     * 险种代码
     * 
     * @return
     */
    @FormParam("code")
    private String code;
    
    /**
     * 保险类型
     */
    @FormParam("type")
    private ProductType type;
    
    /**
     * 保额
     * 
     * 以元为单位
     * @return
     */
    @FormParam("amount")
    private BigDecimal amount;
    
    /**
     * 保费
     * 
     * 以元为单位
     * @return
     */
    @FormParam("premium")
    private BigDecimal premium;
    
    /**
     * 折扣比率
     */
    @NotNull
    @FormParam("discountRate")
    private BigDecimal discountRate;
    
    /**
     * 折扣保费/实际保费
     * 
     * =保费×折扣率 以分为单位
     */
    @FormParam("discountPremium")
    private BigDecimal discountPremium;
    
    /**
     * 建议持有时间（平台提供）
     */
    @FormParam("proposedHoldDuration")
    private int proposedHoldDuration;
    
    /**
     * 预期收益率（平台提供）
     */
    @FormParam("expectedRate")
    private BigDecimal expectedRate;
    
    /**
     * 平台内状态
     */
    @FormParam("status")
    private String status;
    
    /**
     * 保险期限
     */
    @FormParam("insPeriod")
    private Integer insPeriod;
    
    /**
     * 保险期限单位 CD1
     */
    @FormParam("insPeriodUnit")
    private InsPeriodUnit insPeriodUnit;
    
    /**
     * 交费期限(交费期限单位为趸交时不填)
     */
    @FormParam("payPeriod")
    private Integer payPeriod;
    
    /**
     * 交费期限单位 CD6
     */
    @NotNull
    @FormParam("payPeriodUnit")
    private PayPeriodUnit payPeriodUnit;
    
    /**
     * 交费方式 CD19
     */
    @FormParam("payMode")
    private PayMode payMode;
    
    /**
     * 纪录创建时间
     */
    private Date timeCreated;
    
    /**
     * 记录最近更新时间
     */
    private Date timeLastUpdated;
}