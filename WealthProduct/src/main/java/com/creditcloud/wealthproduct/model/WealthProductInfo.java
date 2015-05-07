/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import static com.creditcloud.wealthproduct.WealthProductConstant.MAX_DESCRIPTION_LENGTH;
import javax.validation.constraints.Size;
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
    private String guaranteeInfo;
    
    /**
     * 融资方、发行人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String financingInfo;
    
    /**
     * 资产管理方、基金管理人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String assetManageInfo;
    
    /**
     * 承销商、受托人
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String underwriterInfo;
    
    /**
     * 咨询方/顾问
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String consultantInfo;
    
    /**
     * 风险信息及措施
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String riskInfo;
    
    /**
     * 还款来源、收益来源
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String repaymentInfo;
    
    /**
     * 投资策略、投资目标、投资范围
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String strategyInfo;
    
    /**
     * 描述
     * 
     * @return
     */
    @Size(max = MAX_DESCRIPTION_LENGTH)
    private String description;
}
