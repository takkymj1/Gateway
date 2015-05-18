/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 问题类型
 * 
 * @author sobranie
 */
public enum QuestionType implements BaseEnum {
    
    /**
     * 单选题
     */
    SINGLE("单选题"),
    /**
     * 多选题
     */
    MULTIPLE("多选题"),
    /**
     * 填空题
     */
    FILLING("填空题");
    
    private final String key;
    
    private QuestionType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
