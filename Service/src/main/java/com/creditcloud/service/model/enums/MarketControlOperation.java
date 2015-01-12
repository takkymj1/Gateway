/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MarketControlOperation implements BaseEnum {

    Update_ScheduledAndOpen_Loan("更新发标"),
    Update_FinishedAndSettled_Loan("更新满标和结算标"),
    Update_Failed_Loan("更新流标"),
    Update_ScheduledAndOpen_Funding("更新众筹发标"),
    Update_FinishedAndSettled_Funding("更新众筹满标和结算标"),
    Update_Failed_Funding("更新众筹流标"),
    Nothing("无操作");

    private final String key;

    private MarketControlOperation(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
