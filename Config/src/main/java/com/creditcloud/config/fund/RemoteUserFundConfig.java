/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.fund;

import com.creditcloud.config.BaseConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "RemoteUserFundConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class RemoteUserFundConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20150415L;

    public static final String CONFIG_NAME = "RemoteUserFundConfig";
    
    @XmlElement
    private String charset;
    
    @XmlElement
    private int timeout;
    
    @XmlElement
    private String availableAmountUrl;
    
    @XmlElement
    private String tenderUrl;
}
