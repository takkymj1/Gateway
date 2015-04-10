package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;


/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/10
 * Time: 12:13
 * Desc: 充值渠道
 * To change this template use File | Settings | File Templates.
 */
public enum RechargeChannel implements BaseEnum {

    SHORTCUT("快捷"),
    UNIONPAY("银联");

    private final String key;




    private RechargeChannel(String key) {
        this.key = key;
    }
    /**
     * key along with enum
     *
     * @return
     */
    @Override
    public String getKey() {
        return key;
    }
}
