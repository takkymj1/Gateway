/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CreditRank implements BaseEnum {

    HR("0-39"),
    E("40-49"),
    D("50-59"),
    C("60-69"),
    B("70-79"),
    A("80-89"),
    AA("90-109"),
    AAA("110-120");

    private final String key;

    private CreditRank(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * lowest credit rank
     *
     * @return
     */
    public static CreditRank lowest() {
        return HR;
    }

    /**
     * highest credit rank
     *
     * @return
     */
    public static CreditRank highest() {
        return AA;
    }
}
