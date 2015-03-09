/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config.insurance;

import com.creditcloud.model.BaseObject;
import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 新华保险相关配置
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EnciInsuranceConfig extends BaseObject {
    
    private static final long serialVersionUID = 20150307L;

    /**
     * 接入方应用ID
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    public String appId;
    
    /**
     * 接入方应用秘钥
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    public String appSecret;
    
    /**
     * 签名方式
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String signType;
    
    /**
     * 数据类型
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String format;
    
    /**
     * 字符集
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String charset;
    
     /**
     * 新华保险服务器的URL
     * 
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private URL url;
    
}
