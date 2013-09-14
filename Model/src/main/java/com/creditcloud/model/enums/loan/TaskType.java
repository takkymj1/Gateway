/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum TaskType implements BaseEnum {

    //TODO
    EXAMPLE("");
    private final String key;

    private TaskType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
