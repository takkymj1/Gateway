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
 * DeviceManager需要的一些配置
 *
 * @author rooseek
 */
@XmlRootElement(name = "DeviceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public final class DeviceConfig extends BaseConfig {

    private static final long serialVersionUID = 20131030L;

    public static final String CONFIG_NAME = "DeviceConfig";

    /**
     * 平板上传文件的临时中转文件存放目录
     */
    @XmlElement(required = true)
    private String tempFileDir;

    /**
     * 平板上传图片的临时中转文件存放目录
     */
    @XmlElement(required = true)
    private String tempImageDir;
    
    public DeviceConfig() {
    }

    public DeviceConfig(String tempFileDir, 
                        String tempImageDir) {
        this.tempFileDir = tempFileDir;
        this.tempImageDir = tempImageDir;
    }
    
    public String getTempFileDir() {
        return tempFileDir;
    }

    public String getTempImageDir() {
        return tempImageDir;
    }
}
