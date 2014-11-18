/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.image.api;

import com.creditcloud.image.Image;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.ImageSize;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface ImageService {

    /**
     * 上传图片
     *
     * @param clientCode:客户标示
     * @param owner:图片所有者或关联者
     * @param imageName:图片名
     * @param imagePath:图片路径
     * @return
     */
    Image upload(String clientCode,
                 RealmEntity owner,
                 String imageName,
                 String imagePath);

    /**
     * 添加一个图片信息
     *
     * @param clientCode
     * @param owner:图片所有者或关联者
     * @param imageName
     * @return
     */
    boolean addNew(String clientCode,
                   RealmEntity owner,
                   String imageName);

    /**
     * 返回不同大小的图片
     *
     * @param clientCode:客戶代码
     * @param owner:图片所有者或关联者
     * @param imageName:图片名
     * @param size:图片大小
     * @param watermark:是否加水印
     * @return
     */
    Image download(String clientCode,
                   RealmEntity owner,
                   String imageName,
                   ImageSize size,
                   boolean watermark);

    /**
     * 返回满足条件的一组图片
     *
     * @param clientCode:客戶代码
     * @param owner:图片所有者或关联者
     * @param info:查找范围
     * @param size:图片大小
     * @param watermark:是否加水印
     * @return
     */
    PagedResult<Image> list(String clientCode,
                            RealmEntity owner,
                            PageInfo info,
                            ImageSize size,
                            boolean watermark);

    PagedResult<Image> list(String clientCode,
                            RealmEntity owner,
                            PageInfo info,
                            ImageSize size);

    PagedResult<Image> list(String clientCode,
                            RealmEntity owner,
                            PageInfo info);

    /**
     * 删除某图片
     *
     * @param clientCode:客戶代码
     * @param owner:图片所有者或关联者
     * @param imageName:图片名
     * @return
     */
    boolean delete(String clientCode, RealmEntity owner, String imageName);

    /**
     * 刪除entityId对应的所有图片
     *
     * @param clientCode:客戶代码
     * @param owner:图片所有者或关联者
     * @return
     */
    boolean delete(String clientCode, RealmEntity owner);
}
