/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.corporation.funding;

import com.creditcloud.corporation.Corporation;
import com.creditcloud.model.enums.misc.City;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FundingCorporation extends Corporation {
    
    /**
     * 区域
     */
    @FormParam("city")
    private City city;
    
    /**
     * 行业
     */
    @FormParam("industry")
    private String industry;
    
    /**
     * 注册资本
     */
    @FormParam("registeredCapital")
    @Min(0)
    private BigDecimal registeredCapital;

    /**
     * 注册地址
     */
    @FormParam("registeredLocation")
    private String registeredLocation;
    
    /**
     * 成立时间
     */
    private Date timeEstablished;

    /**
     * 经营范围
     */
    @FormParam("businessScope")
    private String businessScope;
    
    /**
     * 经营业务收入情况
     */
    @FormParam("businessIncome")
    private String businessIncome;
    
    /**
     * 经营业务收入增长率
     */
    @FormParam("incomeIncreaseRate")
    private String incomeIncreaseRate;
    
    /**
     * 核心产品
     */
    @FormParam("coreProduct")
    private String coreProduct;
    
    /**
     * 员工人数
     */
    @FormParam("staffNo")
    @Min(1)
    private int staffNo;
    
    /**
     * 法人代表
     */
    @FormParam("legalPerson")
    private String legalPerson;
    
    /**
     * 企业定位
     */
    @FormParam("selfPosition")
    private String selfPosition;
    
    /**
     * 信息披露方式
     */
    @FormParam("infoShowMethod")
    private String infoShowMethod;
}