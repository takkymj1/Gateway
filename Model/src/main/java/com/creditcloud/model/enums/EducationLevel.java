/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 学历水平
 *
 * @author sobranie
 */
public enum EducationLevel {

    HIGHSCHOOL("高中学历及以下"),
    COLLEGE("本科学历"),
    GRADUATE("研究生及以上");

    private final String key;

    private EducationLevel(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
