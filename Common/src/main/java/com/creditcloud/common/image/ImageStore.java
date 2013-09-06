/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.image;

import com.creditcloud.model.enums.ImageSize;
import com.creditcloud.model.enums.Realm;

/**
 * 只用来存取图片
 *
 * @author rooseek
 */
public interface ImageStore {

    /**
     * store an image
     *
     * @param clientCode
     * @param realm
     * @param imageName
     * @param imagePath
     * @return
     */
    boolean store(String clientCode, Realm realm, String imageName, String imagePath);

    /**
     * get image uri
     *
     * @param clientCode
     * @param realm
     * @param imageName
     * @param size
     * @param watermark
     * @return
     */
    String getURI(String clientCode, Realm realm, String imageName, ImageSize size, boolean watermark);

    /**
     * delete an image
     *
     * @param clientCode
     * @param realm
     * @param imageName
     * @return
     */
    boolean delete(String clientCode, Realm realm, String imageName);
}