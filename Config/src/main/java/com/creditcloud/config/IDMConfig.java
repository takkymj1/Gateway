/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tinglany
 */
@XmlRootElement(name = "IDMConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class IDMConfig extends BaseConfig {

    private static final long serialVersionUID = 20140711L;

    public static final String CONFIG_NAME = "IDMConfig";
    
//    private static String clsName = "com.bizenit.idm.sim.ws.interfaces.impl.WsUserService";
//
//    private static String address = "http://cloudsso2.com:8080/sim/services/userService";

//    @XmlElement(required = false)
//    @Getter
//    private String platform;
//
//    @XmlElement
//    @Getter
//    private String url;
//
//    @XmlElement
//    @Getter
//    private String uid;
//
//    @XmlElement
//    @Getter
//    private String key;
//
//    @XmlElement(required = false)
//    @Getter
//    private CID cid;
//
//    //for c123
//    @XmlElement(required = false)
//    @Getter
//    private String cgid;
//    
//    // for zucp.net
//    @XmlElement(required = false)
//    @Getter
//    private String signature;
//    
//    // for zucp.net 扩展账号
//    @XmlElement(required = false)
//    @Getter
//    private String ext;
//
//    //for chinacom DES加密key
//    @XmlElement(required = false)
//    @Getter
//    private String deskey;
}

