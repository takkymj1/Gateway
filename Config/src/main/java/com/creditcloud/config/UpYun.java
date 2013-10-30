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
 * config for upyun space access
 *
 * @author rooseek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public final class UpYun extends BaseConfig {

    private static final long serialVersionUID = 20131023;

    //空间名
    @XmlElement(required = true)
    private String bucketName;

    //空间操作员
    @XmlElement(required = true)
    private String userName;

    //空间操作员密码
    @XmlElement(required = true)
    private String userPassword;

    /**
     * 空间url地址统一前缀
     */
    @XmlElement(required = true)
    private String urlPrefix;

    //空间url地址统一后缀
    @XmlElement(required = true)
    private String urlSuffix;

    public String getBucketName() {
        return bucketName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUrlSuffix() {
        return urlSuffix;
    }

    public String getUrlPrefix() {
        return urlPrefix;
    }
}
