/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author GuohuaZhang
 */
@Data
public class HuaAnFundAccountConfig {

    /**
     * 是否已经获取账号,如果没有，界面需要导航到注册开户界面
     */
    private boolean accountReady;
    /**
     * 是否已经获取交易秘钥,如果没有，界面需要导航到获取交易秘钥界面
     */
    private boolean transKeyReady;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}
