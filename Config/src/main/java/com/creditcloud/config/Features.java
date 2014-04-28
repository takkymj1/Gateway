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

    /**
     * 是否关闭默认公安部认证，改从后台平台自己来审核身份验证信息
     */
    @XmlElement
    @Getter
    private boolean bgIDVerify = false;

    /**
     * 是否支持企业用户
     */
    @XmlElement
    @Getter
    private boolean enableEnterpriseUser = false;

    /**
     * 支持自动投标
     */
    @XmlElement
    @Getter
    private boolean enableAutoBid = false;

    /**
     * 提前还款功能，默认提前还款和当期还款处理方式一致<p>
     * 对于某些特殊的提前还款方式才需要打开
     */
    @XmlElement
    @Getter
    private boolean enableAdvanceRepay = false;

}
