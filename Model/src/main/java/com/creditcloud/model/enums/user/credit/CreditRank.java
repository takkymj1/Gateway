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

    HR("0-49"),
    E("50-59"),
    D("60-69"),
    C("70-79"),
    B("80-89"),
    A("90-99"),
    AA("100-120");

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
