/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 投标方式
 *
 * @author rooseek
 */
public enum BidMethod implements BaseEnum {

    AUTO("自动投标"),
    MANUAL("手动投标"),
    /**
     * TODO 暂时用上面AUTO和MANUAL以及其他field组合来展示下面两项</p>
     * 实际代码中并未使用下面两项</p>
     */
    ASSIGN_AUTO("自动债权接管"),
    ASSIGN_MANUAL("主动债权接管"),
    WEALTHPRODUCT("理财产品");

    private final String key;

    private BidMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
