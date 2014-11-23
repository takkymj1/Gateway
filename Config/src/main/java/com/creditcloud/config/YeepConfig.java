/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement(name = "YeepConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class YeepConfig extends BaseConfig {

    private static final long serialVersionUID = 201401123L;

    public static final String CONFIG_NAME = "YeepConfig";

}
