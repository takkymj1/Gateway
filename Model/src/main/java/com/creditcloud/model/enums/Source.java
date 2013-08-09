/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 信息来源
 *
 * @author sobranie
 */
public enum Source implements BaseEnum {

    WEB("公共网络"),
    BACK("后台"),
    MOBILE("移动端");

    private final String key;

    private Source(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
