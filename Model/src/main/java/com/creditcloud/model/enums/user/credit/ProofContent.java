/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.credit;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProofContent implements BaseEnum {

    IMAGE("图像"),
    DOCUMENT("文档"),
    HYPERLINK("网页链接"),
    EXPLAINATION("说明"),
    OTHERS("其他");

    private final String key;

    private ProofContent(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
