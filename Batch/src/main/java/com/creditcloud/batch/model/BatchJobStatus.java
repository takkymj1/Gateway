/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum BatchJobStatus implements BaseEnum {

    INITIATED("初始"),
    PROCESSING("进行中"),
    /**
     * 所有单项任务都顺利完成
     */
    FINISHED("完成"),
    /**
     * 有某些单项未能完成
     */
    FINISHED_WITH_FAILURES("部分完成"),
    /**
     * 无法顺利进行下去
     */
    FAILED("失败"),
    /**
     * 执行中被人为取消
     */
    CANCELED("已取消");

    private final String key;

    private BatchJobStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
