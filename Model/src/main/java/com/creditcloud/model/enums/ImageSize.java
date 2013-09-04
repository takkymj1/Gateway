/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 *
 * @author rooseek
 */
public enum ImageSize implements BaseEnum {

    //需要在upyun中创建缩略图和水印版本然后再定义
    ORIGINAL("原图"),
    SMALL("小图"),
    ICON("图标");

    private final String key;

    private ImageSize(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
