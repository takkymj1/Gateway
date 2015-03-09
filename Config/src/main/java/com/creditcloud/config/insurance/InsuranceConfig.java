/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config.insurance;

import com.creditcloud.config.BaseConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@NoArgsConstructor
@XmlRootElement(name = "InsuranceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class InsuranceConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20150309L;

    public static final String CONFIG_NAME = "InsuranceConfig";

    /**
     * 新华保险相关配置
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private EnciInsuranceConfig enciInsurance;
    
}
