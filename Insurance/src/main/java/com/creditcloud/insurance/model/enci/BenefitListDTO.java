/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 * 受益人信息列表
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BenefitListDTO extends BaseObject {

    /**
     * 是否是法定受益人 DC4
     */
    @NotNull
    private String isLegal;
    
    /**
     * 受益人信息
     */
    private BenefitDTO[] benefitDTOList;

    public String getIsLegal() {
        return isLegal;
    }

    public void setIsLegal(String isLegal) {
        this.isLegal = isLegal;
    }

    public BenefitDTO[] getBenefitDTOList() {
        return benefitDTOList;
    }

    public void setBenefitDTOList(BenefitDTO[] benefitDTOList) {
        this.benefitDTOList = benefitDTOList;
    }
  
}
