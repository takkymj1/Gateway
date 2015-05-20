/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 问卷状态
 * 
 * @author sobranie
 */
public enum SurveyStatus implements BaseEnum {
    
    /**
     * 初始状态，用户不能填写
     */
    CREATED("初始"),
    /**
     * 用户可以开放填写
     */
    OPEN("开放"),
    /**
     * 问卷填写完毕.
     * 
     * 最终状态，不可以改回
     */
    FINISHED("结束");
    
    private final String key;
    
    private SurveyStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
