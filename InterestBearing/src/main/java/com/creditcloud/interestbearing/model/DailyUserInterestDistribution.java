/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class DailyUserInterestDistribution {
    /**
     * 生息获取日期和分配日期，格式YYYYMMDD
     */
    @Column(nullable = false)
    private String interestDate;

    ////////////////以下信息从TA查询获得/////////////////////-->
    /**
     * 总计投入生息本金, 有可能为负(减计提现), 两位小数
     */
    private BigDecimal bookValue;

    /**
     * 累计收益, 四位小数
     */
    private BigDecimal accumulatedEarning;

    /**
     * 对应accountingTime的资产市值, 四位小数
     */
    private BigDecimal fairValue;

    /**
     * 记账时间
     */
    private Date accountingTime;

    ////////////////以上信息从TA查询获得/////////////////////<--
    ////////////////以下信息在利息分配过程中产生/////////////////////-->
    /**
     * 从T-1日到T日的增量收益
     */
    private BigDecimal interestIncrement;

    /**
     * 应用收益分配规则之后，决定分配给用户的增量收益部分;
     */
    private BigDecimal interestToUser;

    /**
     * 应用收益分配规则之后，决定分配给平台的增量收益部分;<br>
     * 约束 : interestIncrement === interestToPlatform + interestToUser
     */
    private BigDecimal interestToPlatform;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}
