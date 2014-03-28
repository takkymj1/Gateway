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
 * 担保贷款配置
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "GuaranteeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class GuaranteeConfig extends BaseConfig {

    private static final long serialVersionUID = 20140328L;

    public static final String CONFIG_NAME = "GuaranteeConfig";

    /**
     * 收费配置
     */
    @XmlElement(required = false)
    private FeeConfig feeConfig;

}
