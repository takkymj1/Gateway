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

/**
 * 核保 100001
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
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
     * 其他
     */
    private OtherInfoDTO otherInfoDTO;

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public HolderDTO getHolderDTO() {
        return holderDTO;
    }

    public void setHolderDTO(HolderDTO holderDTO) {
        this.holderDTO = holderDTO;
    }

    public InsuredListDTO getInsuredListDTO() {
        return insuredListDTO;
    }

    public void setInsuredListDTO(InsuredListDTO insuredListDTO) {
        this.insuredListDTO = insuredListDTO;
    }

    public OtherInfoDTO getOtherInfoDTO() {
        return otherInfoDTO;
    }

    public void setOtherInfoDTO(OtherInfoDTO otherInfoDTO) {
        this.otherInfoDTO = otherInfoDTO;
    }
    
    
    
}
