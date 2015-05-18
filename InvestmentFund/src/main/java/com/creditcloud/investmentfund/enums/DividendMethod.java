/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum DividendMethod  implements BaseEnum {

    BONUS("红利再投"),
    CASH("现金分红");

    private final String key;

    private DividendMethod(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
