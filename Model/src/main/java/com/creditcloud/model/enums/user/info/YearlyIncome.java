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
    
    SALARY_BELOW_50W("500000以下"),
    SALARY_50W_100W("500001-1000000"),
    SALARY_100W_300W("1000001-3000000"),
    SALARY_300W_500W("3000001-5000000"),
    SALARY_500W_1000W("5000001-10000000"),
    SALARY_ABOVE_1000W("10000001以上");
    
    private final String key;

    private YearlyIncome(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
