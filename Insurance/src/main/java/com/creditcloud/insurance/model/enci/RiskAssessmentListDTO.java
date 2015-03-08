/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 * 风险评测信息列表
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class RiskAssessmentListDTO extends BaseObject {

    /**
     * 风险评测版本
     */
    @NotNull
    private String riskAssessmentVersion;
    
    /**
     * 风险评测列表
     */
    @NotNull
    private RiskAssessmentDTO[] riskAssessmentDTOList;

    public String getRiskAssessmentVersion() {
        return riskAssessmentVersion;
    }

    public void setRiskAssessmentVersion(String riskAssessmentVersion) {
        this.riskAssessmentVersion = riskAssessmentVersion;
    }

    public RiskAssessmentDTO[] getRiskAssessmentDTOList() {
        return riskAssessmentDTOList;
    }

    public void setRiskAssessmentDTOList(RiskAssessmentDTO[] riskAssessmentDTOList) {
        this.riskAssessmentDTOList = riskAssessmentDTOList;
    }
    
}
