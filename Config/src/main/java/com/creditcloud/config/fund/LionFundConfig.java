/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.fund;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
     * 诺安基金历史净值页面URL
     *
     * @return
     */
    @Getter
    @XmlElement(required = false)
    private URL urlQueryFundNavRecord;
            
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
     * 平台佣金分成比例
     * 保有总金额<人民币2亿元
     */
    @Min(0)
    @Max(1)
    @Getter
    @XmlElement(required = false)
    private BigDecimal platformDividedIntoLevel1Fee ;
    
    /**
     * 平台佣金分成比例
     * 人民币2亿元≦保有总金额<人民币5亿元
     */
    @Min(0)
    @Max(1)
    @Getter
    @XmlElement(required = false)
    private BigDecimal platformDividedIntoLevel2Fee ;
    
    /**
     * 平台佣金分成比例
     * 保有总金额≧人民币5亿元
     */
    @Min(0)
    @Max(1)
    @Getter
    @XmlElement(required = false)
    private BigDecimal platformDividedIntoLevel3Fee ;
    
    /***
     * 平台分成比例区间金额
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal platformDividedIntoLevel1Amount;
    
     /***
     * 平台分成比例区间金额
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal platformDividedIntoLevel2Amount;

}
