/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
public class UserRegistrationInfo {

    // 注册时需要提供的参数
    // 要开通余额生息的用户的ID
    @NotNull
    private String userId;
    // 开通时间，由调用者设置
    @NotNull
    private Date registrationTime;
    // 注册时的余额生息资金数量
    @NotNull
    private BigDecimal interestBearingFundAmount;
    // 用户发起注册的IP 
    String clientIP;

    // 注册后查询时会返回的信息
    // 余额生息签约记录ID
    private String recordId;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}
