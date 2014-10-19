/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author suetming
 */
@NoArgsConstructor
@Data
@XmlRootElement(name = "RedisConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class RedisConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20140902L;

    public static final String CONFIG_NAME = "RedisConfig";
    
    /**
     * redis server host
     */
    @XmlElement
    @Getter
    private String host = "127.0.0.1";
    
    /**
     * redis server port
     */
    @XmlElement
    @Getter
    private int port = 6379;
    
    /**
     * redis client resource pool
     */
    @XmlElement(required = false)
    private RedisPoolConfig pool;
    
    public RedisPoolConfig getPoolConfig() {
        if (pool == null) {
            pool = new RedisPoolConfig();
        }
        return pool;
    }
    
}
