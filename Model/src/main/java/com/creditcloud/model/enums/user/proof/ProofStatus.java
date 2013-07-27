/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.proof;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProofStatus implements BaseEnum {

    UNCHECKED("未审核"),
    CHECKED("审核通过"),
    DENIED("审核未通过"),
    ARCHIVED("已存档"),
    DELETED("已刪除");

    private final String key;

    private ProofStatus(String key) {
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
