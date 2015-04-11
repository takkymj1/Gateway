package com.creditcloud.fund.model.record;

import com.creditcloud.fund.model.enums.PlatformSource;
import com.creditcloud.fund.model.enums.RechargeChannel;
import com.creditcloud.fund.model.enums.RechargeType;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/10
 * Time: 14:44
 * Desc:
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
public class RechargeRecord extends BaseObject {

    private static final long serialVersionUID = -7772822884742831183L;


    private String id;

    private String userId;


    private String fundRecordId;

    /**
     * 充值金额
     */
    private BigDecimal amount;


    /**
     * 充值来源：手机or网站
     */
    private Source source;

    /**
     * 手续费费率
     */
    private BigDecimal ratio;

    /**
     * 企业or个人网银
     */
    private RechargeType rechargeFrom;


    /**
     * 充到企业or个人
     */
    private RechargeType rechargeTo;


    /**
     * 充值渠道:快捷or网银
     */
    private RechargeChannel rechargeChannel;


    /**
     * 平台
     */
    private PlatformSource platformSource;


    public RechargeRecord(String id, String userId, String fundRecordId, BigDecimal amount, Source source, BigDecimal ratio, RechargeType rechargeFrom, RechargeType rechargeTo, RechargeChannel rechargeChannel, PlatformSource platformSource) {
        this.id = id;
        this.userId = userId;
        this.fundRecordId = fundRecordId;
        this.amount = amount;
        this.source = source;
        this.ratio = ratio;
        this.rechargeFrom = rechargeFrom;
        this.rechargeTo = rechargeTo;
        this.rechargeChannel = rechargeChannel;
        this.platformSource = platformSource;
    }
}
