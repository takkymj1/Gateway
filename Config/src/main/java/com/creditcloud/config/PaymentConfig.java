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

/**
 * 第三方支付需要的配置文件项
 * 
 * @author sobranie
 */
@XmlRootElement(name = "PaymentConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20131105L;
    
    public static final String CONFIG_NAME = "PaymentConfig";

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getCONFIG_NAME() {
        return CONFIG_NAME;
    }
    
    /**
     *  客户号
     */
    @XmlElement(required = true)
    private String customId;
    
    /**
     * 客户私钥文件路径
     */
    @XmlElement(required = true)
    private String privateKeyPath;
    
    /**
     * 公钥文件路径
     */
    @XmlElement(required = true)
    private String publicKeyPath;
    
    /**
     * 三方支付服务器的URL
     */
    @XmlElement(required = true)
    private URL url;
    
    /**
     * 三方支付服务的远程路径
     */
    @XmlElement(required = true)
    private String path;
    
    /**
     * 三方支付回调的Url，一般是网站运行的地址
     */
    @XmlElement(required = true)
    private String retUrl;
    
    public PaymentConfig() {
    }

    public String getCustomId() {
        return customId;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public URL getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public String getRetUrl() {
        return retUrl;
    }
}
