/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.LocalDateTime;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserQueryLatestAssetResponseMessage extends ResponseMessage {

    //总计投入生息本金, 有可能为负(减计提现), 两位小数
    private String book_value;
    //累计收益
    private String accumulated_earning;
    //对应accounting_time的资产市值, 四位小数
    private String fair_value;
    //记账时间
    private String accounting_time;

    public LocalDateTime getAccountingTime() {
        return LocalDateTime.parse(accounting_time);
    }

    public BigDecimal getBookValue() {
        return new BigDecimal(book_value);
    }

    public BigDecimal getAccumulatedEarning() {
        return new BigDecimal(accumulated_earning);
    }

    public BigDecimal getFairValue() {
        return new BigDecimal(fair_value);
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);

        builder.append("bookValue", getBookValue());
        builder.append("accumulatedEarning", getAccumulatedEarning());
        builder.append("fairValue", getFairValue());
        builder.append("accountingTime", getAccountingTime());
        return builder.build();
    }
}
