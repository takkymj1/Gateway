/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;
import com.creditcloud.insurance.model.enci.HolderDTO;
import com.creditcloud.insurance.model.enci.InsuredListDTO;
import com.creditcloud.insurance.model.enci.OrderDTO;
import com.creditcloud.insurance.model.enci.OtherInfoDTO;
import com.creditcloud.insurance.model.enci.ProductDTO;
import com.creditcloud.insurance.model.enci.RiskAssessmentListDTO;
import lombok.Data;

/**
 * 核保 100001
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class ProposalApplyRequest extends BaseDTO {

    /**
     * 订单信息
     */
    private OrderDTO orderDTO;
    
    /**
     * 险种信息
     */
    private ProductDTO productDTO;
    
    /**
     * 投保人信息
     */
    private HolderDTO holderDTO;
    
    /**
     * 被保险人信息列表
     */
    private InsuredListDTO insuredListDTO;
    
    /**
     * 风险评测信息（只有I添财产品需要传入风险评测信息）
     */
    private RiskAssessmentListDTO riskAssessmentListDTO;
    
    /**
     * 其他
     */
    private OtherInfoDTO otherInfoDTO;
}
