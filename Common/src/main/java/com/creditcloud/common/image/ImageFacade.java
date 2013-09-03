/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.image;

import com.creditcloud.model.enums.ImageSize;

/**
 *
 * @author rooseek
 */
public interface ImageFacade {

    /**
     * 上传某用户的图片
     *
     * @param userId:用户
     * @param imageName:图片名，对于每个用户需唯一
     * @param picturePath:图片路径
     * @return true if upload successful
     */
    boolean upload(String userId, String imageName, String picturePath);

    /**
     * 获取用户的某图片
     *
     * @param userId
     * @param imageName
     * @return 图片url
     */
    String download(String userId, String imageName);

    /**
     * 返回不同大小的图片
     *
     * @param userId
     * @param imageName
     * @param size
     * @return
     */
    String download(String userId, String imageName, ImageSize size);
}