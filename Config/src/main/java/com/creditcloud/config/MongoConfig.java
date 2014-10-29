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
@XmlRootElement(name = "MongoConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class MongoConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20140902L;

    public static final String CONFIG_NAME = "MongoConfig";
    
    /**
     * mongodb host
     */
    @XmlElement
    @Getter
    private String host = "127.0.0.1";
    
    /**
     * mongodb port
     */
    @XmlElement
    @Getter
    private int port = 6379;
    
    /**
     * 
     */
    @XmlElement
    @Getter
    private int connectionsPerHost = 2048;
    
    @XmlElement
    @Getter
    private int threadsAllowedToBlockForConnectionMultiplier = 5;
    
    @XmlElement
    @Getter
    private int maxWaitTime;
    
    @XmlElement
    @Getter
    private int connectTimeout = 10000;
    
    @XmlElement
    @Getter
    private int socketTimeout = 0;
    
    @XmlElement
    @Getter
    private boolean socketKeepAlive = false;
    
    @XmlElement
    @Getter
    private boolean autoConnectRetry = false;
    
    @XmlElement
    @Getter
    private int maxAutoConnectRetryTime = 0;
    
}
