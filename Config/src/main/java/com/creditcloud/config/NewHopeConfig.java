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

/**
 *
 * @author tinglany
 */

@XmlRootElement(name = "NewHopeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewHopeConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20150310L;
    
    public static final String CONFIG_NAME = "NewHopeConfig";
    
    @XmlElement
    @Getter
    private String clsName;
    
    @XmlElement
    @Getter
    private String address;
    
    @XmlElement
    @Getter
    private  String username;
    
    @XmlElement
    @Getter
    private String password;
    
    @XmlElement
    @Getter
    private String departNo;
    
    @XmlElement
    @Getter
    private String restUrl;
    
    @XmlElement
    @Getter
    private String ldapUrl;
    
    @XmlElement
    @Getter
    private String ldapBaseDn;
}
