/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author GuohuaZhang
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HuaAnFundAccountConfig extends ConfigObjBase {

    /**
     * 平台在华安的交易账号
     */
    private String platformTradingAccount;
    /**
     * 交易密钥
     */
    private String platformTradingPrivateKey;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }

    public void setPlatformTradingAccount(String v) {
        this.platformTradingAccount = StringUtils.defaultString(v);
    }

    public void setPlatformTradingPrivateKey(String v) {
        this.platformTradingPrivateKey = StringUtils.defaultString(v);
    }

    public boolean isPlatformTradingAccountReady() {
        boolean isPlatformTradingAccountReady = !StringUtils.isEmpty(platformTradingAccount);
        return isPlatformTradingAccountReady;
    }

    public boolean isPlatformTradingPrivateKeyReady() {
        boolean isPlatformTradingPrivateKeyReady = !StringUtils.isEmpty(platformTradingPrivateKey);
        return isPlatformTradingPrivateKeyReady;
    }
}
