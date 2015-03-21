/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

import com.creditcloud.insurance.constant.InsuranceConstant;
import com.creditcloud.insurance.model.enci.enums.InsPeriodUnit;
import com.creditcloud.insurance.model.enci.enums.InsuranceOrderStatus;
import com.creditcloud.insurance.model.enci.enums.PayMode;
import com.creditcloud.insurance.model.enci.enums.PayPeriodUnit;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
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
public class InsuranceOrder extends BaseObject implements InsuranceConstant{
    
    @FormParam(value = "orderId")
    @Size(max = 30)
    private String id;
    
    @FormParam(value = "userId")
    @NotNull
    @Size(max = 30)
    private String userId;
    
    /**
     * 总保费
     */
    @FormParam(value = "totalPremium")
    @NotNull
    private BigDecimal totalPremium;

    /**
     * 保险起期
     */
    @FormParam(value = "insBeginDate")
    @NotNull
    private Date insBeginDate;
    
    /**
     * 保险止期
     */
    @NotNull
    private Date insEndDate;
    
    /**
     * 保险期限
     */
    @FormParam(value = "insPeriod")
    private Integer insPeriod;
    
    /**
     * 保险期限单位
     */
    @FormParam(value = "insPeriod")
    @NotNull
    private InsPeriodUnit insPeriodUnit;
    
    /**
     * 总投保份数
     */
    @FormParam(value = "totalApplyNum")
    @NotNull
    private int totalApplyNum;
    
    /**
     * 保单服务机构 CD17
     */
    @FormParam(value = "serviceOrgCode")
    @NotNull
    private String serviceOrgCode;
    
    /**
     * 合作商产品ID
     */
    @FormParam(value = "productId")
    @NotNull
    @Size(max = 30)
    private String productId;
    
    /**
     * 交费期限(交费期限单位为趸交时不填)
     */
    private Integer payPeriod;
    
    /**
     * 交费期限单位 CD6
     */
    @NotNull
    private PayPeriodUnit payPeriodUnit;
    
    /**
     * 交费方式 CD19
     */
    @NotNull
    private PayMode payMode;
    
    /**
     * 平台内状态
     */
    private InsuranceOrderStatus status;
    
    /**
     * 投保单号
     */
    @FormParam(value = "proposalNo")
    private String proposalNo;
    
    /**
     * 追加订单对应的源订单
     * 字段为null时，则是源订单；有值时，则是追加订单
     */
    private String originOrderId;
    
    /**
     * 纪录创建时间
     */
    private Date timeCreated;
    
    /**
     * 记录最近更新时间
     */
    private Date timeLastUpdated;
}
