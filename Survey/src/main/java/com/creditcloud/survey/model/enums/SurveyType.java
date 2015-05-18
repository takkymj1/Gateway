/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.survey.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 问卷类型
 * 
 * @author sobranie
 */
public enum SurveyType implements BaseEnum {

    /**
     * 调查问卷.
     * 
     * 最简单的Survey形式，只看用户对于每道题目的选择
     */
    QUESTIONNAIRE("调查问卷"),
    /**
     * 对于风险偏好程度的<b>简单问卷</b>.
     * 
     * 每道题目单选，得分线性相加
     */
    SIMPLE_RISK("简单风险测评");

    private final String key;

    private SurveyType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
