/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 提前还款状态
 * @author peili
 */
public enum PreRepaymentStatus implements BaseEnum {
    
    //标的提前还款使用的状态
    PREREPAYING("预备提前还款"),
    NORMALREPAYING("正常还款"),
    PREREPAYED("已还清（提前还款）");
    
    private final String key;

    private PreRepaymentStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
