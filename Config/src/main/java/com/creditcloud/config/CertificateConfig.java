/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.enums.user.credit.CertificateType;
import java.math.BigDecimal;
import java.util.HashMap;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author suetming
 */
@XmlRootElement(name = "CertificateTypeWeightConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class CertificateConfig extends BaseConfig {

    private static final long serialVersionUID = 20131105L;

    /**
     * TODO 为保持兼容先不更改配置文件名
     */
    public static final String CONFIG_NAME = "CertificateTypeWeightConfig";

    @XmlElement(name = "CertificateType", required = true)
    private String type;

    public HashMap<CertificateType, BigDecimal> getCertificateTypeWeight() {
        HashMap<CertificateType, BigDecimal> weightMap = new HashMap<>();
        String[] weights = type.split(",");

        CertificateType[] values = CertificateType.values();
        for (int i = 0, n = values.length, m = weights.length; i < n; i++) {
            if (i > m - 1) {
                BigDecimal weight = new BigDecimal(1);
                weightMap.put(values[i], weight);
            } else {
                BigDecimal weight = new BigDecimal(weights[i]);
                weightMap.put(values[i], weight);
            }
        }
        return weightMap;
    }
}
