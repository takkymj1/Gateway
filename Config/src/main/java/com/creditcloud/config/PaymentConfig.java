/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 第三方支付需要的配置文件项<p>
 * //TODO 可以将此配置文件改名为PNRPaymentConfig，以区别其他支付配置文件
 *
 * @author sobranie
 */
@XmlRootElement(name = "PaymentConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentConfig extends BaseConfig {

    private static final long serialVersionUID = 20131105L;

    public static final String CONFIG_NAME = "PaymentConfig";

    /**
     * 6位客户ID，ChkValue生成用
     */
    @XmlElement(required = true)
    private String merId;

    /**
     * 16位客户ID，API调用用
     */
    @XmlElement(required = true)
    private String merCustId;

    /**
     * 客户私钥文件路径
     */
    @XmlElement(required = true)
    private String privateKeyPath;

    /**
     * 公钥文件路径
     */
    @XmlElement(required = true)
    private String publicKeyPath;

    /**
     * 三方支付服务器的URL
     */
    @XmlElement(required = true)
    private URL url;

    /**
     * 三方支付服务的远程路径
     */
    @XmlElement(required = true)
    private String path;

    /**
     * 三方支付回调的Url，一般是网站运行的地址
     */
    @XmlElement(required = true)
    private String retUrl;

    /**
     * 最大投资手续费率
     */
    @XmlElement(required = true)
    private String maxTenderRate;

    /**
     * 最大借款手续费率
     */
    @XmlElement(required = true)
    private String maxBorrowerRate;

    public PaymentConfig() {
    }

    public String getMerId() {
        return merId;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public URL getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public String getMerCustId() {
        return merCustId;
    }

    public String getMaxTenderRate() {
        return maxTenderRate;
    }

    public String getMaxBorrowerRate() {
        return maxBorrowerRate;
    }
}
