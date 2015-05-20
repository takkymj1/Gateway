/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MonthlySalary implements BaseEnum {

    SALARY_BELOW_2000("2000以下"),
    SALARY_2001_5000("2001﹣5000"),
    SALARY_5001_10000("5001﹣10000"),
    SALARY_10001_20000("10001﹣20000"),
    SALARY_20001_50000("20001﹣50000"),
    SALARY_ABOVE_50001("50001以上"),
    
    //xhds 新增 ====================
    SALARY_BELOW_50000("50000以下"),
    SALARY_50001_100000("50001-100000"),
    SALARY_100001_200000("100001-200000"),
    SALARY_200001_500000("200001-500000"),
    SALARY_ABOVE_500001("500001以上"),

    //jdlh 新增==================
    SALARY_BELOW_50W("500000以下"),
    SALARY_50W_100W("500001-1000000"),
    SALARY_100W_300W("1000001-3000000"),
    SALARY_300W_500W("3000001-5000000"),
    SALARY_500W_1000W("5000001-10000000"),
    SALARY_ABOVE_1000W("10000001以上");
    
    private final String key;

    private MonthlySalary(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
