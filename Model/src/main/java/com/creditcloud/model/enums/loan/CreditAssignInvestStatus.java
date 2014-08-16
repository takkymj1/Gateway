/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CreditAssignInvestStatus implements BaseEnum {

    INITIALIZED("初始"),
    SUCCESSFUL("成功");

    private final String key;

    private CreditAssignInvestStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
