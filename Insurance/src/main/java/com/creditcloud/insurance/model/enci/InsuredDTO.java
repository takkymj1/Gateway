/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci;

import javax.validation.constraints.NotNull;

/**
 * 被保险人信息
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class InsuredDTO extends ParticipantDTO {

    /**
     * 与投保人关系 CD15
     */
    @NotNull
    private String insuredRelation;
    
    /**
     * 受益人信息列表
     */
    @NotNull
    private BenefitListDTO benefitListDTO;
    
    /**
     * 告知信息列表
     */
    private DeclarationListDTO declarationListDTO;

    public String getInsuredRelation() {
        return insuredRelation;
    }

    public void setInsuredRelation(String insuredRelation) {
        this.insuredRelation = insuredRelation;
    }

    public BenefitListDTO getBenefitListDTO() {
        return benefitListDTO;
    }

    public void setBenefitListDTO(BenefitListDTO benefitListDTO) {
        this.benefitListDTO = benefitListDTO;
    }

    public DeclarationListDTO getDeclarationListDTO() {
        return declarationListDTO;
    }

    public void setDeclarationListDTO(DeclarationListDTO declarationListDTO) {
        this.declarationListDTO = declarationListDTO;
    }
  
}
