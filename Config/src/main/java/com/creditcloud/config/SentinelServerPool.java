/*
 * To change this template, choose Tools | Templates
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
 *
 * @author suetming
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SentinelServerPool extends BaseObject {
    
    private static final long serialVersionUID = 20141018L;
    
    /**
     * sentinel server host
     */
    @Getter
    @XmlElement(name = "server", required = false)
    private SentinelServer[] server;
    
    @XmlElement
    @Getter
    private String masterName;
    
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
