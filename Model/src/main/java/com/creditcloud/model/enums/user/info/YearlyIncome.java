/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum YearlyIncome implements BaseEnum {
    /**
     * 50万以下
     */
    SALARY_BELOW_50W("50万以下"),
    /**
     * 50万-100万
     */
    SALARY_50W_100W("50万-100万"),
    /**
     * 100万-300万
     */
    SALARY_100W_300W("100万-300万"),
    /**
     * 300万-500万
     */
    SALARY_300W_500W("300万-500万"),
    /**
     * 500万-1000万
     */
    SALARY_500W_1000W("500万-1000万"),
    /**
     * 1000万以上
     */
    SALARY_ABOVE_1000W("1000万以上");
    
    private final String key;

    private YearlyIncome(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
