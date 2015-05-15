/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_DESCRIPTION_LENGTH;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 产品相关信息
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class WealthProductInfo extends BaseObject {

    /**
     * 担保实体信息
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
      @FormParam("guaranteeInfo")
    private String guaranteeInfo;
    
    /**
     * 融资方、发行人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    @FormParam("financingInfo")
    private String financingInfo;
    
    /**
     * 资产管理方、基金管理人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
     @FormParam("assetManageInfo")
    private String assetManageInfo;
    
    /**
     * 承销商、受托人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
     @FormParam("underwriterInfo")
    private String underwriterInfo;
    
    /**
     * 咨询方/顾问
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
     @FormParam("consultantInfo")
    private String consultantInfo;
    
    /**
     * 风险信息及措施
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
     @FormParam("riskInfo")
    private String riskInfo;
    
    /**
     * 还款来源、收益来源
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
     @FormParam("repaymentInfo")
    private String repaymentInfo;
    
    /**
     * 投资策略、投资目标、投资范围
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    @FormParam("strategyInfo")
    private String strategyInfo;
    
    /**
     * 产品合同
     */
    @FormParam("contractInfo")
    private String contractInfo;
    
    /**
     * 描述
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
    
    /**
     * 备注
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String remark;
    
    /**
     * 额外附加
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    protected String priv;
}
