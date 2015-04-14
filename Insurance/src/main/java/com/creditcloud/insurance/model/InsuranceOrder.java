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
     * 银行账户
     * 
     * 退保时退款到该账户
     */
    private String bankAccount;
    
    /**
     * 账户姓名
     */
    private String accountName;
    
    /**
     * 银行卡编码
     */
    private String bankName;
    
    /**
     * 记录创建时间
     */
    private Date timeCreated;
    
    /**
     * 记录最近更新时间
     */
    private Date timeLastUpdated;
}
