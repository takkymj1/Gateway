/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MonthlySalary implements BaseEnum {

    SALARY_BELOW_2000("2000以下"),
    SALARY_2001_50000("2001﹣5000"),
    SALARY_5001_10000("5001﹣10000"),
    SALARY_10001_20000("10001﹣20000"),
    SALARY_20001_50000("20001﹣50000"),
    SALARY_ABOVE_50001("50001以上");

    private final String key;

    private MonthlySalary(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
