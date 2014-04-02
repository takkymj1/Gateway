/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.LoanContractType;
import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Features extends BaseObject {

    private static final long serialVersionUID = 20140305L;

    @XmlElement
    @Getter
    private boolean dimPrivacy = true;  //默认值

    @XmlElement
    @Getter
    private boolean fss = false;  //默认不打开生利宝

    //默认一对一合同
    @XmlElement
    @Getter
    private LoanContractType loanContractType = LoanContractType.OneToOne;

    //后台用户开户默认密码，如果为null表示使用手机短信发送随机密码
    @XmlElement
    @Getter
    private String defaultPassword;

    /**
     * 是否开启影子标相关功能,默认不允许,主要用于控制页面显示
     */
    @XmlElement
    @Getter
    private boolean enableShadowLoan = false;
}
