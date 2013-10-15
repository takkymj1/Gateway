/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement(name = "SMSConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SMSConfig extends BaseConfig {

    private static final long serialVersionUID = 20131015L;

    public static final String CONFIG_NAME = "SMSConfig";

    @XmlElement(required = true)
    private String charsetName;

    @XmlElement(required = true)
    private String uid;

    @XmlElement(required = true)
    private String key;

    @XmlElement(required = true)
    private String url;

    public String getCharsetName() {
        return charsetName;
    }

    public String getUid() {
        return uid;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }
}
