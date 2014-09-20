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
public class RedisPoolConfig extends BaseObject {
    
    private static final long serialVersionUID = 20140920L;
    
    /**
     * 资源池最大分配的对象数
     */
    @XmlElement
    @Getter
    private int maxActive=1024;

    /**
     * 最大能够保持idel状态的对象数
     */
    @XmlElement
    @Getter
    private int maxIdle=200;
    
    /**
     * 当池内没有返回对象时，最大等待时间
     */
    @XmlElement
    @Getter
    private long maxWaitMillis=1000;
}
