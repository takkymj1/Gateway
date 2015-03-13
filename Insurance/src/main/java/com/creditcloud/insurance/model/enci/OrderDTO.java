/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class OrderDTO extends BaseDTO {

    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 合作商用户ID
     */
    private String partnerUserId;
    
    /**
     * 总保费
     * 
     * 实际保费×投保份数 以元为单位，两位小数
     */
    private BigDecimal totalPremium;
    
    /**
     * 邮递费
     * 
     * 以元为单位，两位小数
     */
    private BigDecimal postFee;
    
    /**
     * 保险生效起始时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String insBeginDate;
    
    /**
     * 保险生效截止时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String insEndDate;
    
    /**
     * 保险期限
     */
    private Integer insPeriod;
    
    /**
     * 保险期限单位 CD1
     */
    private String insPeriodUnit;
    
    /**
     * 总投保份数
     */
    private Integer totalApplyNum;
    
    /**
     * 保单服务机构
     * 
     * CD17 + “00” 
     * 如 深圳中心支公司86740000
     */
    private String serviceOrgCode;
    
    /**
     * 保单密码 AES加密
     */
    private String policyPassword;
    
    /**
     * 首期付款方式 CD2
     */
    private String firstPayMode;
    
    /**
     * 首期付款银行编号 CD3
     */
    private String firstPayBankCode;
    
    /**
     * 首期付款银行账号
     */
    private String firstPayAcctNo;
    
    /**
     * 首期付款账户名
     */
    private String firstPayAcctName;
    
    /**
     * 续期付款方式
     */
    private String partPayMode;
    
    /**
     * 续期付款银行编号
     */
    private String partPayBankCode;
    
    /**
     * 续期付款银行账号
     */
    private String partPayAcctNo;
    
    /**
     * 续期付款账户名
     */
    private String partPayAcctName;
    
    /**
     * 是否自动续保
     */
    private String isAutoRenewal;
}
