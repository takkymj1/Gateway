/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

/**
 * 投保人信息
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class HolderDTO extends ParticipantDTO {

    /**
     * 告知信息列表
     */
    private RiskAssessmentListDTO riskAssessmentListDTO;
    
    /**
     * 风险评测信息列表
     */
    private DeclarationListDTO declarationListDTO;

    public RiskAssessmentListDTO getRiskAssessmentListDTO() {
        return this.riskAssessmentListDTO;
    }

    public void setRiskAssessmentListDTO(RiskAssessmentListDTO riskAssessmentListDTO) {
        this.riskAssessmentListDTO = riskAssessmentListDTO;
    }

    public DeclarationListDTO getDeclarationListDTO() {
        return this.declarationListDTO;
    }

    public void setDeclarationListDTO(DeclarationListDTO declarationListDTO) {
        this.declarationListDTO = declarationListDTO;
    }

}
