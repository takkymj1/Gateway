/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@NoArgsConstructor
@XmlRootElement(name = "AllWinConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllWinConfig extends BaseConfig {
    
    @XmlElement
    @Getter
    private String scheme = "https";
    
    @XmlElement
    @Getter
    private String host;
    
    @XmlElement
    @Getter
    private int port;
    
    @XmlElement
    @Getter
    private String path;
    
    /**
     * 客户名称
     */
    @XmlElement
    @Getter
    private String member;
    
    /**
     * 客户签名
     */
    @XmlElement
    @Getter
    private String sign;
    
    /**
     * 是否直接返回excel文件而不是数据
     */
    @XmlElement
    @Getter
    private boolean excel = false;
}
