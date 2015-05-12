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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author GuohuaZhang
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "UnionPayACPConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnionPayACPConfig extends BaseConfig {

    private static final long serialVersionUID = 20150510L;

    public static final String CONFIG_NAME = "UnionPayACPConfig"; 
}
