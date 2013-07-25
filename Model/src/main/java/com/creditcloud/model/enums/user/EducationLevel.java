/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 学历水平
 *
 * @author sobranie
 */
public enum EducationLevel implements BaseEnum {

    HIGHSCHOOL("高中学历及以下"),
    COLLEGE("本科学历"),
    GRADUATE("研究生及以上");

    private final String key;

    private EducationLevel(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}