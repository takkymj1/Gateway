/*
 + * To change this license header, choose License Headers in Project Properties.
 + * To change this template file, choose Tools | Templates
 + * and open the template in the editor.
 + */
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
@XmlRootElement(name = "ChinaPayConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChinaPayConfig extends BaseConfig {

    private static final long serialVersionUID = 20150308L;

    public static final String CONFIG_NAME = "ChinaPayConfig";

 //TODO
}
