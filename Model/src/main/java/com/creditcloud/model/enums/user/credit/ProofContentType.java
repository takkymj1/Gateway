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
public enum ProofContentType implements BaseEnum {

    IMAGE("图像"),
    DOCUMENT("文档"),
    VIDEO("视频"),
    AUDIO("音频");
    //  HYPERLINK("网页链接"),
    //  EXPLAINATION("说明")

    private final String key;

    private ProofContentType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
