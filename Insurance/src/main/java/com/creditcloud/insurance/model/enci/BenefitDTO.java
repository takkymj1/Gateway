/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 * 受益人信息
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BenefitDTO extends BaseObject {

    /**
     * 与被保险人关系 CD16
     */
    private String benefitRelation;
    
    /**
     * 受益比列
     */
    private double benefitScale;
    
    /**
     * 受益顺序
     */
    private int benefitSort;

    public String getBenefitRelation() {
        return this.benefitRelation;
    }

    public void setBenefitRelation(String benefitRelation) {
        this.benefitRelation = benefitRelation;
    }

    public Double getBenefitScale() {
        return this.benefitScale;
    }

    public void setBenefitScale(Double benefitScale) {
        this.benefitScale = benefitScale;
    }

    public Integer getBenefitSort() {
        return this.benefitSort;
    }

    public void setBenefitSort(Integer benefitSort) {
        this.benefitSort = benefitSort;
    }
}
