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
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "LionFundConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LionFundConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20150305L;

    public static final String CONFIG_NAME = "LionFundConfig";

    /**
     * 客户ID，签名用
     */
    @XmlElement(required = false)
    private String merId;
    
    /**
     * 客户私钥文件路径
     */
    @XmlElement(required = false)
    private String privateKeyPath;
    
    /**
     * 公钥文件路径
     */
    @XmlElement(required = false)
    private String publicKeyPath;
    
    /**
     * 诺安基金服务器的URL
     */
    @XmlElement(required = false)
    private URL url;
    
    /**
     * 诺安基金服务器的远程路径
     */
    @XmlElement(required = false)
    private String path;
    
    /**
     * 签名方式
     */
    @XmlElement(required = false)
    private String signType;
}