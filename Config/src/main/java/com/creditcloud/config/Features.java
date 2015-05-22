/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.LoanContractType;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
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
    private boolean enableApi = false;  //是否开放 /api/* 路径

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
     * 新手标
     */
    @XmlElement
    @Getter
    private boolean enableNewBeeLoan = false;

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
     * 自动投标占贷款总金额最大百分比
     */
    @XmlElement
    @Getter
    @Min(0)
    @Max(1)
    private BigDecimal maxAutoBidPercent = BigDecimal.ONE;

    /**
     * TODO提前还款功能，默认提前还款和当期还款处理方式一致
     */
    @XmlElement
    @Getter
    private boolean enableAdvanceRepay = false;

    /**
     * 用于控制manger和market中与平板设备相关操作和界面展示
     */
    @XmlElement
    @Getter
    private boolean enableDevice = false;

    /**
     * 对于流标，结算的时候允许为剩余金额自动创建新标
     */
    @XmlElement
    @Getter
    private boolean extendFailedLoan = false;

    /**
     * 推荐奖励功能
     */
    @XmlElement
    @Getter
    private boolean enableReferralReward = false;

    /**
     * 注册奖励功能
     */
    @XmlElement
    @Getter
    private boolean enableRegistryReward = false;

    /**
     * 是否打开奖券功能
     */
    @XmlElement
    @Getter
    private boolean enableCoupon = false;

    /**
     * 是否拆分提现审批为审核和批准/拒绝两个步骤
     */
    @XmlElement
    @Getter
    private boolean splitCashAudit = false;

    /**
     * 可以控制用户对标的投资金额和次数等限制
     */
    @XmlElement
    @Getter
    private boolean enableInvestLimit = false;

    /**
     * 邀请
     */
    @XmlElement
    @Getter
    private boolean enableReferralLink = false;

    /**
     * 平台垫付所有剩余还款,或称债权托管
     */
    @XmlElement
    @Getter
    private boolean enableDisburseAll = false;

    /**
     * 动态密码登录
     */
    @XmlElement
    @Getter
    private String dynamicCaptchaServerUrl;

    /**
     * 可以对贷款申请加tag
     */
    @XmlElement
    @Getter
    private boolean enableLoanRequestTag = false;

    /**
     * 第三方平台代扣
     */
    @XmlElement
    @Getter
    private boolean enableThirdPartyCollect = false;

    /**
     * 使用联动优势资金托管平台, 否则为汇付天下资金托管平台
     */
    @XmlElement
    @Getter
    private boolean useUnionMobilePayment = false;

    /**
     * 使用联动优势资金托管平台担保商户功能，该商户为线下开户的企业账户
     */
    @XmlElement
    @Getter
    private boolean enableUmpGuaranteeUser = false;

    /**
     * 债权转让功能
     */
    @XmlElement
    @Getter
    private boolean enableCreditAssign = false;

    /**
     * UMP支付对每日提现次数的限制, null=无限制, 0=不允许提现
     */
    @XmlElement
    @Getter
    private Integer withdrawTimesLimitEveryday = null;

    /**
     * crowd funding
     */
    @XmlElement
    @Getter
    private boolean enableCrowdFunding = false;

    @XmlElement
    @Getter
    private boolean enableWealthProduct = false;

    /**
     * 工单功能
     */
    @XmlElement
    @Getter
    private boolean enableTicketService = false;

    /**
     * jpa auto managed flush to db
     */
    @Getter
    @XmlElement
    private boolean enableManualFlush = true;

    /**
     * open/close auto overdue check
     */
    @Getter
    @XmlElement
    private boolean enableAutoOverdueCheck = true;

    /**
     * 当计算判断逾期时是否跳过周末以及节假日.
     *
     * 节假日通过<b>CREDITCLOUD_HOME<b>/holiday文件控制
     */
    @Getter
    @XmlElement
    private boolean enableOverdueSkip = false;

    /**
     * 批量处理功能
     */
    @Getter
    @XmlElement
    private boolean enableBatch = false;

    /**
     * 第三方登陆后功能显示控制
     */
    @Getter
    @XmlElement
    private boolean enableThirdParty = false;

    /**
     * 系统发标后，对去汇付进行标的录入的控制
     */
    @Getter
    @XmlElement
    private boolean enablePaymentTender = false;

    /**
     * 限定标的投标人范围
     */
    @Getter
    @XmlElement
    private boolean enablePrivateLoanProduct = false;

    /**
     * 扩展还款方式，支持RepaymentMethod与RepaymentPeriod组合的还款方式
     */
    @Getter
    @XmlElement
    private boolean enableExtensibleRepayment = false;

    /**
     * 显示该组用户的所有评论
     */
    @Getter
    @XmlElement
    private boolean enableShowGroupComments = false;

    /**
     * 开启用户邀请功能 已注册用户通过此功能可录入受邀人手机号（或其他信息）
     */
    @Getter
    @XmlElement
    private boolean enableUserInvitation = false;

    /**
     * 开启自动结算满标的标的
     */
    @Getter
    @XmlElement
    private boolean enbaleAutoSettleFinishedLoan = false;

    /**
     * 开启自动结算流标的标的
     */
    @Getter
    @XmlElement
    private boolean enbaleAutoSettleFailedLoan = false;

    /**
     * 标的可以设置单独的起息日，无视放款日期
     */
    @Getter
    @XmlElement
    private boolean enableLoanValueDate = false;

    /**
     * 直接生成标的还款信息
     *
     * false：由投资人还款信息加总得到标的还款信息 true：由LoanCalculator计算得出标的还款信息
     *
     * 为true时，会出现投资人还款与借款人还款金额不一致的情况。所以需同时设定RoundingMode.DOWN，来保证投资人还款利息总额会小于借款人的利息
     */
    @Getter
    @XmlElement
    private boolean generateLoanRepayment = false;

    /**
     * 当前平台是否打开余额生息功能。一旦打开余额生息功能，相应的用户端界面和管理端界面会有相应的页面出现。后台相应的服务也会响应这个参数。
     */
    @Getter
    @XmlElement
    private boolean enableInterestBearing = false;
}
