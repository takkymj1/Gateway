/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.image;

import com.creditcloud.model.enums.ImageSize;

/**
 * 只用来存取图片
 *
 * @author rooseek
 */
public interface ImageStore {

    /**
     * store an image
     *
     * @param imageName
     * @param imagePath
     * @return
     */
    boolean store(String imageName, String imagePath);

    /**
     * get image uri
     *
     * @param imageName
     * @param size
     * @param watermark
     * @return
     */
    String getURI(String imageName, ImageSize size, boolean watermark);

    /**
     * delete an image
     *
     * @param imageName
     * @return
     */
    boolean delete(String imageName);
}