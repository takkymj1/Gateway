/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.user.credit.Certificate;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;

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

    @XmlElement(name = "CertificateType", required = false)
    private String type;

    public HashMap<CertificateType, BigDecimal> getCertificateTypeWeight() {
        /**
         * 如果有新权重配置,则使用新权重配置
         */
        if (weightConfig != null) {
            return newWeightMap();
        }
        return legacyWeightMap();
    }

    /**
     * 根据认证分项得分计算总认证得分
     *
     * @param certificates
     * @return
     */
    public BigDecimal calculateScore(Certificate[] certificates) {
        return calculateScore(Arrays.asList(certificates));
    }

    /**
     * 根据认证分项得分计算总认证得分
     *
     * @param certificates
     * @return
     */
    public BigDecimal calculateScore(List<Certificate> certificates) {
        BigDecimal result = BigDecimal.ZERO;
        HashMap<CertificateType, BigDecimal> weightMap = getCertificateTypeWeight();
        for (Certificate certificate : certificates) {
            BigDecimal temp = new BigDecimal(certificate.getAssessment().getScore()).multiply(weightMap.get(certificate.getType()));
            result = result.add(temp);
        }
        return result;
    }

    /**
     * 原有信用认证权重
     *
     * @return
     */
    private HashMap<CertificateType, BigDecimal> legacyWeightMap() {
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

    /**
     * 新信用认证权重
     *
     * @return
     */
    private HashMap<CertificateType, BigDecimal> newWeightMap() {
        HashMap<CertificateType, BigDecimal> weightMap = new HashMap<>();
        for (CertificateType type : CertificateType.values()) {
            weightMap.put(type, BigDecimal.ZERO);
        }

        if (weightConfig != null && weightConfig.getWeights() != null) {
            for (CertificateWeight weight : weightConfig.getWeights()) {
                weightMap.put(weight.getType(), weight.getWeight());
            }
        }

        return weightMap;
    }

    /**
     * 信用评级基准分数</p>
     * 基准分数*认证权重=认证得分
     */
    @Getter
    @XmlElement(name = "benchmarkScore", required = false)
    private int benchmarkScore = 100;

    /**
     * 信用评级总分</p>
     * 可将实际信用评级分数转换成总分制下分数
     */
    @Getter
    @XmlElement(name = "totalScore", required = false)
    private int totalScore = 100;

    /**
     * 信用认证权重
     */
    @Getter
    @XmlElement(name = "weightConfig", required = false)
    private CertificateWeightConfig weightConfig;

    /**
     * 信用认证评分
     */
    @Getter
    @XmlElement(name = "scoreConfig", required = false)
    private CertificateScoreConfig scoreConfig;

}
