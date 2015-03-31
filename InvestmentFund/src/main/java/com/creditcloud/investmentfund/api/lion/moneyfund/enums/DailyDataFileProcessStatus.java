/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api.lion.moneyfund.enums;

import lombok.Getter;

/**
 * 诺安基金货币基金每日数据处理状态 <br>
 *
 * @author GuohuaZhang
 */
public enum DailyDataFileProcessStatus {

    NOT_PROCESSED(-1),
    IN_PROCESS(0),
    SUCCESS(1),
    ERROR(2);

    @Getter
    private final int code;

    DailyDataFileProcessStatus(int code) {
        this.code = code;
    }

    public static DailyDataFileProcessStatus parse(int status) {
        DailyDataFileProcessStatus[] values = DailyDataFileProcessStatus.values();
        for (DailyDataFileProcessStatus value : values) {
            if (value.getCode() == status) {
                return value;
            }
        }

        if (status < 0) {
            return NOT_PROCESSED;
        } else {
            return ERROR;
        }
    }
}
