/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author tinglany
 */
@NoArgsConstructor
@XmlRootElement(name = "LianPayConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LianPayConfig extends BaseConfig {

    private static final long serialVersionUID = 20150414L;

    public static final String CONFIG_NAME = "LianPayConfig"; 

    @XmlElement(required = true)
    @Getter
    private String md5Key;

    //接收异步通知地址
    @XmlElement(required = true)
    @Getter
    private String notifyUrl;
    
    //支付结束后返回地址
    @XmlElement(required = true)
    @Getter
    private String retUrl;
    
    //商户编号
    @XmlElement(required = true)
    @Getter
    private String oidPartner;
    
    //签名方式 RSA或MD5
    @XmlElement(required = true)
    @Getter   
    private String signType;
    
    //接口版本号，固定1.0
    @XmlElement(required = true)
    @Getter
    private String version;
    
    // 业务类型，连连支付根据商户业务为商户开设的业务类型； （101001：虚拟商品销售、109001：实物商品销售、108001：外部账户充值）    
    @XmlElement(required = true)
    @Getter
    private String busiPartner;

    
}
