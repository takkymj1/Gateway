/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.image.api;

import com.creditcloud.model.enums.ImageSize;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.Image;
import java.util.List;
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
     * @param realm:entity对应的域
     * @param entityId:实体Id
     * @param imageName:图片名
     * @param imagePath:图片路径
     * @return
     */
    Image upload(String clientCode,
                   Realm realm,
                   String entityId,
                   String imageName,
                   String imagePath);

    /**
     * 返回不同大小的图片
     *
     * @param clientCode:客戶代码
     * @param realm:entity对应的域
     * @param entityId:用户或其他实体id
     * @param imageName:图片名
     * @param size:图片大小
     * @param watermark:是否加水印
     * @return Image
     */
    Image download(String clientCode,
                   Realm realm,
                   String entityId,
                   String imageName,
                   ImageSize size,
                   boolean watermark);

    /**
     * 返回满足条件的一组图片
     *
     * @param clientCode:客戶代码
     * @param realm:entity对应的域
     * @param entityId:用户或其他实体id
     * @param size:图片大小
     * @param watermark:是否加水印
     * @return
     */
    List<Image> list(String clientCode,
                     Realm realm,
                     String entityId,
                     ImageSize size,
                     boolean watermark);

    /**
     * 删除某图片
     *
     * @param clientCode:客戶代码
     * @param realm:entity对应的域
     * @param entityId:用户或其他实体id
     * @param imageName:图片名
     * @return
     */
    boolean delete(String clientCode, Realm realm, String entityId, String imageName);

    /**
     * 刪除entityId对应的所有图片
     *
     * @param clientCode:客戶代码
     * @param realm:entity对应的域
     * @param entityId:用户或其他实体id
     * @return
     */
    boolean delete(String clientCode, Realm realm, String entityId);
}