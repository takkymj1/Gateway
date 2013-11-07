/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement(name = "CreditManagerConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class CreditManagerConfig extends BaseConfig{
    
    private static final long serialVersionUID = 20131107L;

    public static final String CONFIG_NAME = "CreditManagerConfig";
    
    @XmlElement(required = true)
    private String tempFileDir;
    
    @XmlElement(required = true)
    private String tempImageDir;

    public CreditManagerConfig() {
    }

    public CreditManagerConfig(String tempFileDir, String tempImageDir) {
        this.tempFileDir = tempFileDir;
        this.tempImageDir = tempImageDir;
    }

    public String getTempFileDir() {
        return tempFileDir;
    }

    public String getTempImageDir() {
        return tempImageDir;
    }
}
