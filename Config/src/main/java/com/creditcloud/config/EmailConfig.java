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
@XmlRootElement(name = "EmailConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class EmailConfig extends BaseConfig {

    private static final long serialVersionUID = 20131015L;

    public static final String CONFIG_NAME = "EmailConfig";

    @XmlElement(required = true)
    private String host;

    @XmlElement(required = true)
    private String port;

    @XmlElement(required = true)
    private String user;

    @XmlElement(required = true)
    private String password;

    @XmlElement(required = true)
    private String personal;

    @XmlElement(required = true)
    private String charset;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonal() {
        return personal;
    }

    public String getCharset() {
        return charset;
    }
}
