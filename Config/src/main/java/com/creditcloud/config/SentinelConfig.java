/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

/**
 *
 * @author suetming
 */
@NoArgsConstructor
@XmlRootElement(name = "SentinelConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SentinelConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20141016L;

    public static final String CONFIG_NAME = "SentinelConfig";
    
    /**
     * common sentinel config
     */
    @XmlElement(required = false)
    public SentinelServerPool common;
    
    /**
     * loan relate sentinel config
     */
    @XmlElement(required = false)
    public SentinelServerPool loan;
    
    public SentinelServerPool getCommon() {
        return common;
    }
    
    public SentinelServerPool getLoan() {
        return loan;
    }
}
