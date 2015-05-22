/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import com.creditcloud.interestbearing.enums.InterestBearingFundTransTriggerType;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.investmentfund.enums.TradingRecordType;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author guohuazhang
 */
@Data
public class InterestBearingFundTradingRecord {

    /**
     * 基金品牌
     */
    private FundBrand fundBrand;

    private InterestBearingFundTransTriggerType requestTye;

    /**
     * 基金类型
     */
    private final FundType fundType = FundType.MONETARY;

    /**
     * 机构在基金公司的ID，比如对于华安基金来讲就是机构在华安基金的基金账号
     */
    private String merchantId;

    /**
     * 基金代码，如果当前客户在当前基金公司只约定购买一只基金，这个信息不是必需的
     */
    private String fundCode = "000000";

    /**
     * 业务类型名称 ： 申购或者赎回
     */
    private TradingRecordType tradingType;

    /**
     * 云中信通信流水号，申请流水号，在平台系统中唯一
     */
    private String applicationSeqNo;

    /**
     * 申请金额(元)
     */
    private BigDecimal applicationAmount;

    /**
     * 申请日期
     */
    private Date applicationDate;

    private String tradingStatus;

    /**
     * 确认日期或者撤销日期
     */
    private Date confirmDate;

    /**
     * 确认金额(元)
     */
    private BigDecimal confirmAmount;
}
