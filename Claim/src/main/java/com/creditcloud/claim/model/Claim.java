/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.claim.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.corporation.CorporationUser;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author ceusan
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Claim extends BaseObject {

    private static final long serialVersionUID = 20140804L;

    /**
     * 原始债权ID
     */
    @FormParam("claimId")
    private String claimId;
    
    /**
     * 原始债权名称
     */
    @FormParam("name")
    private String name;

    /**
     * 原债权人
     */
    private  CorporationUser corporationUser;
    /**
     * 原始债权人ID
     */
    @FormParam("userId")
    private String userId;

    /**
     * 原债权合同名称
     */
    @FormParam("contractName")
    private String contractName;
    
    /**
     * 原债权合同编号
     */
    @FormParam("contractCode")
    private String contractCode;
    
    /**
     * 签订日期
     */
    @FormParam("signedDate")
    private Date signedDate;
    
    /**
     * 签订地址
     */
    @FormParam("signedAddress")
    private String signedAddress;
    
    /**
     * 债权总金额
     */
    @FormParam("totalAmount")
    private BigDecimal totalAmount;
    
    /**
     * 债权余额
     */
    @FormParam("balance")
    private BigDecimal balance;
    
    /**
     * 债权其实日期
     */
    @FormParam("startDate")
    private Date startDate;
    
    /**
     * 债权结束日期
     */
    @FormParam("endDate")
    private Date endDate;
    
    /**
     * 原始借款人基本信息
     */
    @FormParam("borrowerInfo")
    private String borrowerInfo;
    
    /**
     * 风控信息
     */
    @FormParam("riskControlInfo")
    private String riskControlInfo;
    
    /**
     * 还款计划
     */
    @FormParam("repaymentPlans")
    private List<RepaymentPlan> repaymentPlans;

    public Claim(String claimId, 
            String name,
            String userId, 
            String contractName, 
            String contractCode, 
            Date signedDate, 
            String signedAddress, 
            BigDecimal totalAmount, 
            BigDecimal balance, 
            Date startDate, 
            Date endDate, 
            String borrowerInfo, 
            String riskControlInfo, 
            List<RepaymentPlan> repaymentPlans) {
        this.claimId = claimId;
        this.name = name;
        this.userId = userId;
        this.contractName = contractName;
        this.contractCode = contractCode;
        this.signedDate = signedDate;
        this.signedAddress = signedAddress;
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.startDate = startDate;
        this.endDate = endDate;
        this.borrowerInfo = borrowerInfo;
        this.riskControlInfo = riskControlInfo;
        this.repaymentPlans = repaymentPlans;
    }
    

}
