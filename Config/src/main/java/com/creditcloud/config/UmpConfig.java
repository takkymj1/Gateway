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
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 联动优势(UMP)资金账户托管服务的配置
 *
 * @author kdliu
 */
@NoArgsConstructor
@XmlRootElement(name = "UmpConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class UmpConfig extends BaseConfig {

    private static final long serialVersionUID = 20140811L;

    public static final String CONFIG_NAME = "UmpConfig";

    /**
     * UMP分配合作商户唯一标识
     */
    @XmlElement(required = true)
    @Getter
    private String merId;

    /**
     * 商户的私钥文件路径
     */
    @XmlElement(required = true)
    @Getter
    private String privateKeyPath;

    /**
     * UMP公钥文件路径
     */
    @XmlElement(required = true)
    @Getter
    private String publicKeyPath;

    /**
     * UMP服务器的URL
     */
    @XmlElement(required = true)
    @Getter
    private URL url;

    /**
     * UMP服务的远程路径
     */
    @XmlElement(required = true)
    @Getter
    private String path;
    
    /**
     * UMP的通知回调地址(Market端)
     */
    @XmlElement(required = true)
    @Getter
    private String retUrl;
    
    /**
     * UMP的通知回调地址(Manager端)
     */
    @XmlElement(required = true)
    @Getter
    private String adminRetUrl;
    
    /**
     * 商户在UMP的账户
     */
    @XmlElement(name = "baseAccount", required = true) 
    @Getter
    private UmpSubAccount baseAccount;
    
    /**
     * 担保方UMP的账户, 可以无担保方
     */
    @XmlElement(name = "guaranteeAccount", required = false) 
    @Getter
    private UmpSubAccount guaranteeAccount;

}