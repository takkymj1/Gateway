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

    //TODO add more
    LARGE(""),
    MEDIUM(""),
    ORIGINAL("原图"),
    SMALL(""),
    ICON("");

    private final String key;

    private ImageSize(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
