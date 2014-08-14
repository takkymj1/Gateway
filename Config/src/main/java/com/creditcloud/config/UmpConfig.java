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
 * 联动优势(UMP)资金账户托管服务的配置
 *
 * @author kdliu
 */
@Data
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
    private String merId;

    /**
     * 商户的私钥文件路径
     */
    @XmlElement(required = true)
    private String privateKeyPath;

    /**
     * UMP公钥文件路径
     */
    @XmlElement(required = true)
    private String publicKeyPath;

    /**
     * UMP服务器的URL
     */
    @XmlElement(required = true)
    private URL url;

    /**
     * UMP服务的远程路径
     */
    @XmlElement(required = true)
    private String path;
    
    @XmlElement(name = "baseAccount", required = true) 
    private UmpSubAccount baseAccount;

}