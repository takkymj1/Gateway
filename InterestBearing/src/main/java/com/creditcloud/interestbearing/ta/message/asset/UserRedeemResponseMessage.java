/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.ta.message.asset;

import com.creditcloud.interestbearing.ta.message.ResponseMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author guohuazhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserRedeemResponseMessage extends ResponseMessage {

    private String result;

    public boolean isSuccess() {
        return "true".equalsIgnoreCase(StringUtils.trim(result));
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.setAppendStatics(false);
        builder.setAppendTransients(false);

        builder.append("isSuccess", isSuccess());
        return builder.build();
    }
}
