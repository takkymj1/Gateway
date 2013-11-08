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
}
