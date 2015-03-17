/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.fund;

import com.creditcloud.model.BaseObject;
import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LionFundConfig extends BaseObject {

    private static final long serialVersionUID = 20150305L;

    /**
     * 客户ID，签名用
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String merId;

    /**
     * 客户私钥文件路径
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String privateKeyPath;

    /**
     * 公钥文件路径
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String publicKeyPath;

    /**
     * 诺安基金服务器的URL
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private URL url;

    /**
     * 诺安基金服务器的远程路径
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String path;

    /**
     * 签名方式
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private String signType;

    /**
     *
     * 货币型基金机构ID
     *
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String instId;

    /**
     * 货币型基金证书ID
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String certId;

    /**
     * 诺安货币基金直连异步鉴权接口地址
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String urlAsyncAuthenticateAccount;
    /**
     *
     * 诺安货币基金通用请求接口地址，可用于快捷同步鉴权，基金申购赎回等功能的
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String urlLionMoneyFundCommonRequestApply;
    /**
     * 
     * 诺安货币基金通用查询接口地址
     * @return
     */
    @Getter
    @XmlElement(required = true)
    private String urlLionMoneyFundCommonRequestQuery;
}
