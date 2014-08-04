/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Fuiou代收付的相关配置
 * 
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "FuiouConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FuiouConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20140730L;

    public static final String CONFIG_NAME = "FuiouConfig";

    /**
     * Fuiou分配的客户ID
     */
    @XmlElement(required = false)
    private String merId;

    /**
     * 客户的密钥匙
     */
    @XmlElement(required = false)
    private String merPwd;

    /**
     * Fuiou支付服务器的URL
     */
    @XmlElement(required = false)
    private URL url;
    
    /**
     * Fuiou代收付服务的远程路径
     */
    @XmlElement(required = false)
    private String path;

}
