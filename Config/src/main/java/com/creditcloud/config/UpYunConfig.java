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
 * config to access image/file space on upyun
 *
 * @author rooseek
 */
@XmlRootElement(name = "UpYunConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class UpYunConfig extends BaseConfig {

    private static final long serialVersionUID = 20131023L;

    public static final String CONFIG_NAME = "UpYunConfig";

    @XmlElement(name = "fileConfig", required = true)
    private UpYun fileConfig;

    @XmlElement(name = "imageConfig", required = true)
    private UpYun imageConfig;

    public UpYun getFileConfig() {
        return fileConfig;
    }

    public UpYun getImageConfig() {
        return imageConfig;
    }
}
