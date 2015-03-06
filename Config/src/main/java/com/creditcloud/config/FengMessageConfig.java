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
 * @author zhanggm
 */
@NoArgsConstructor
@XmlRootElement(name = "FengMessageConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FengMessageConfig extends BaseConfig {

    public static final String CONFIG_NAME = "FengMessageConfig";
    @Getter
    @XmlElement(required = false)
    private String fengMessageURL;
    
    @Getter
    @XmlElement(required = false)
    private String fengMessageReceiveURL;
    
    public String getFengMessageReceiveURL(String userId, int pagetCount, int sizeCount){
        String fengMessageReceiveURL = this.getFengMessageReceiveURL();
        return fengMessageReceiveURL.replace("userId", userId)
                                    .replace("pageCount", pagetCount+"")
                                    .replace("sizeCount", sizeCount+"");
    }
}
