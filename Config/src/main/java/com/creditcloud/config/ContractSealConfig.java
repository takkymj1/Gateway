/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author suetming
 */
@NoArgsConstructor
@XmlRootElement(name = "ContractSealConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractSealConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20131029L;
    
    public static final String CONFIG_NAME = "ContractSealConfig";
    
    /**
     * seal config
     */
    @Getter
    @XmlElement(name = "contractSeal")
    private ContractSeal[] contractSeal;
    
    
}
