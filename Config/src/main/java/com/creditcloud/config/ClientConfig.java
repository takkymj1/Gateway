/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import java.util.Locale;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement(name = "ClientConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class ClientConfig extends BaseConfig {

    private static final long serialVersionUID = 20131015L;

    public static final String CONFIG_NAME = "ClientConfig";

    @XmlElement(required = true)
    private String code;

    @XmlElement(required = true)
    private String language;

    @XmlElement(required = true)
    private String country;

    @XmlElement(required = true)
    private boolean developMode;

    @XmlElement(required = true)
    private String wsURL;

    /**
     * 各平台通用功能
     */
    @XmlElement(required = false)
    private Features features;

    /**
     * 平台不通用功能
     */
    @XmlElement(required = false)
    private ClientFeatures clientFeatures;

    /**
     * 三方支付
     */
    @XmlElement(required = false)
    private PaymentFeatures paymentFeatures;

    /**
     * 测试相关,生产环境中不应该有此feature
     */
    @Deprecated
    @XmlElement(required = false)
    private TestFeatures testFeatures;

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public Locale getClientLocale() {
        return new Locale(getLanguage(), getCountry());
    }

    public boolean isDevelopMode() {
        return developMode;
    }

    public String getWsURL() {
        return wsURL;
    }

    /**
     * 不会返回null
     *
     * @return
     */
    public Features getFeatures() {
        if (features == null) {
            features = new Features();
        }
        return features;
    }

    public ClientFeatures getClientFeatures() {
        if (clientFeatures == null) {
            clientFeatures = new ClientFeatures();
        }
        return clientFeatures;
    }

    public PaymentFeatures getPaymentFeatures() {
        if (paymentFeatures == null) {
            paymentFeatures = new PaymentFeatures();
        }
        return paymentFeatures;
    }

    public TestFeatures getTestFeatures() {
        if (testFeatures == null) {
            testFeatures = new TestFeatures();
        }
        return testFeatures;
    }
}
