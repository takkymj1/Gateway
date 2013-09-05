/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.image;

import com.creditcloud.model.BaseObject;

/**
 * 用于前端显示需要的Image信息
 *
 * @author rooseek
 */
public class Image extends BaseObject {

    /**
     * 图片名
     */
    private final String imageName;

    /*
     * 图片唯一uri
     */
    private final String uri;

    public Image(String imageName, String uri) {
        this.imageName = imageName;
        this.uri = uri;
    }

    public String getImageName() {
        return imageName;
    }

    public String getUri() {
        return uri;
    }
}
