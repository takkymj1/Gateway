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
 *  第三方支付需要的配置文件项
 * 
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "YeepConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class YeepConfig extends BaseConfig {

    private static final long serialVersionUID = 201401123L;

    public static final String CONFIG_NAME = "YeepConfig";
    
    
    /**
     * 商户编号
     */
    @XmlElement(required = true)
    private String platformNo;
    
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
    
    /**
     * Manager三方支付回调url
     */
    @XmlElement(required = true)
    private String adminRetUrl;   
    
    /**
     * 最大借款手续费率
     */
    @XmlElement(required = false)
    private String maxBorrowerRate;
    
    
    //下面配置的是商户子账户
    /**
     * 基本账户用于充值取现,类型:专属借记账户
     */
    @XmlElement(name = "baseAccount", required = true)
    private SubAccount baseAccount;
   
}
