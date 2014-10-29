/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * contract seal
 * @author suetming
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractSeal extends BaseObject {
 
    /**
     * page
     */
    @XmlElement
    @Getter
    private int page = 1;
    
    /**
     * x
     */
    @XmlElement
    @Getter
    private int x = 0;
    
    /**
     * y
     */
    @XmlElement
    @Getter
    private int y = 0;
    
    /**
     * personal seal or public seal
     */
    @XmlElement
    @Getter
    private boolean isPersonalSeal = true;
    
    /**
     * 印章特征码
     */
    @XmlElement
    @Getter
    public String code;
    
    /**
     * 合同方
     */
    @XmlElement
    @Getter
    private String party  = "FIRST";
}
