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
    BACK("系统后台"),
    MOBILE("移动端"),
    IOS("苹果手机"),
    ANDROID("安卓手机"),
    BATCH("批量导入");

    private final String key;

    private Source(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
