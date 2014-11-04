/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.batch.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 某个具体任务的状态
 * 
 * @author sobranie
 */
public enum TaskStatus implements BaseEnum {

    INITIATED("初始"),
    /**
     * 任务顺利完成
     */
    DONE("完成"),
    /**
     * 无法顺利进行下去
     */
    FAILED("失败");

    private final String key;

    private TaskStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
