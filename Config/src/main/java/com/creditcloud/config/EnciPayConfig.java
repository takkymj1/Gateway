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
 * 新华电商支付配置
 * @author chai
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "EnciPayConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnciPayConfig extends BaseConfig {
 
    private static final long serialVersionUID = 20150317L;
    
    public static final String CONFIG_NAME = "EnciPayConfig";
    
    /**
     * 新华电商支付服务器的Web端URL
     */
    @XmlElement
    private URL WebUrl;
    
    /**
     * 新华电商支付服务器的Wap端URL
     */
    @XmlElement
    private URL WapUrl;
    
    /**
     * 渠道编码
     */
    @XmlElement(required = true)
    private String channelCode;
    
    /**
     * 加密key
     */
    @XmlElement(required = true)
    private String secretKey;
}