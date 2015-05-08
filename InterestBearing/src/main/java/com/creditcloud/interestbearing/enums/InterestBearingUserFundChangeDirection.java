/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author guohuazhang
 */
public enum InterestBearingUserFundChangeDirection implements BaseEnum {

    NO_CHANGE("没有变化量-无需申购赎回"),
    INCREASED("增量-需要申购"),
    DECREASED("减量-需要赎回");

    private final String key;

    private InterestBearingUserFundChangeDirection(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
