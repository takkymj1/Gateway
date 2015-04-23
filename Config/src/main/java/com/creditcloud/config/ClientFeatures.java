/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 不通用的平台特殊功能
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientFeatures extends BaseObject {

    private static final long serialVersionUID = 20140729L;

    /**
     * 保理业务
     */
    @XmlElement
    @Getter
    private boolean enableFactoring = false;

    /**
     * PDF电子签章与签名 (for fmax & feng)
     */
    @XmlElement
    @Getter
    private boolean enablePDFSignature = false;

    /**
     * 话务系统 自动登录管理后台 (for ifeng)
     */
    @XmlElement
    @Getter
    private boolean enableServiceHotline = false;

    /**
     * Sentinel Config
     */
    @XmlElement
    @Getter
    private boolean enableServiceSentinel = false;

    /**
     * Redis Config
     */
    @XmlElement
    @Getter
    private boolean enableServiceRedis = false;

    /**
     * 远程认证地址
     */
    @XmlElement
    @Getter
    private String remoteAttestationUrl;

    /**
     * 微信抽奖功能（TJHJ）
     */
    @XmlElement
    @Getter
    private boolean enableWechatInfo = false;

    /**
     * 居间服务协议
     */
    @XmlElement
    @Getter
    private boolean enableBrokerage = false;

    /**
     * 是否支持快速还款
     */
    @XmlElement
    @Getter
    private boolean enableLoanFastRepay = false;

    /**
     * 垫付是否使用标的账户、托管账户资金
     */
    @XmlElement
    @Getter
    private boolean enableDisburseLoanControl = false;

    /**
     * 是否支持LoanRequestDatail
     */
    @XmlElement
    @Getter
    private boolean enableLoanRequestDetail = false;

    /**
     * 限制提现
     */
    @XmlElement
    @Getter
    private boolean restrictWithdraw = false;

    /**
     * 是否显示所有费率.
     *
     * false 则只显示 平台服务费一项
     */
    @XmlElement
    @Getter
    private boolean enableFee = true;

    /**
     * 可以控制第三方账户权限
     */
    @XmlElement
    @Getter
    private boolean thirdPartyPerm = true;

    /**
     * 是否支持手机验证码管理
     */
    @XmlElement
    @Getter
    private boolean enableMobileCaptchaManage = false;

    /**
     * 可以控制借款人（有借款）是否计算平台取现服务费
     */
    @XmlElement
    @Getter
    private boolean enableWithdrawFeeToClientWhenLoan = false;

    /**
     * 可用控制又拍云存储 true 又拍云 false 凤凰
     */
    @XmlElement
    @Getter
    private boolean enableUPaiYun = false;

    /**
     * 可用控制平台消息管理中短信发送功能 true 使用 false 不使用
     */
    @XmlElement
    @Getter
    private boolean enableMessageSend = false;

    /**
     * 是否启用合同格式化控制合同生成
     *
     * true 启用 按照 ContractPatternConfig.xml 配置对合同字段域进行调整 false 不启用
     * 按照原有的生成方式生成相关字段域
     *
     * @return
     */
    @XmlElement
    @Getter
    private boolean enableContractPattern = false;

    /**
     * 临时方案：待ContractPattern完善后移除此配置, 隐藏除投资人本身的其他投资人的非当前合同用户的姓名***，身份证号码只显示后4位
     *
     * 客户：红象金融（HXJR）
     *
     * @return
     */
    @XmlElement
    @Getter
    private boolean enableInvestorListFieldInvisible = false;

    /**
     * 是否隐藏合同后面所有列表
     *
     * 客户：无锡富盈（WXFY）
     */
    @XmlElement
    @Getter
    private boolean enableHideContractTables = false;

    /**
     * TODO: 还款时候收取投资人本金一定比率管理费 WXFY
     */
    @Getter
    @XmlElement
    private boolean feeFromInvestorWhenRepay = false;

    @XmlElement
    @Getter
    private boolean enableIDM = false;

    /**
     * 用户资金账户是否存在于平台内
     */
    @XmlElement
    @Getter
    private boolean localUserFund = true;

    /**
     * **********************隐藏P2P相关菜单*******************
     */
    /**
     * P2P平台特殊菜单 默认为打开
     */
    @XmlElement
    @Getter
    private boolean enableP2pSpecialMenu = true;

    /**
     * 基金保险类平台特殊菜单
     */
    @XmlElement
    @Getter
    private boolean enableInsuranceFundSpecialMenu = false;

    /**
     * 股票配资融资业务
     */
    @XmlElement
    @Getter
    private boolean enableStockFinance = false;

}
