/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.ImageConstant;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用于前端显示需要的Image信息
 *
 * @author rooseek
 */
@XmlRootElement
public class Image extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    /**
     * 图片名
     */
    private  String imageName;

    /*
     * 图片唯一uri
     */
    private  String uri;
    
    public Image(){
    }

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

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * check whether uri is valid for an image
     *
     * @return
     */
    public boolean isValidUri() {
        return uri != null && !ImageConstant.IMAGE_NOT_FOUND_URI.equals(uri);
    }
}
