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
public class SentinelServer extends BaseObject {
    
    private static final long serialVersionUID = 20141017L;
    
    /**
     * sentinel server host
     */
    @XmlElement
    @Getter
    private String host = "127.0.0.1";
    
    /**
     * sentinel server port
     */
    @XmlElement
    @Getter
    private int port = 26379;
}
