/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.util;

import com.creditcloud.model.constant.ImageConstant;
import com.creditcloud.model.constraints.validator.ChineseIdNumber;

/**
 *
 * @author rooseek
 */
public class ImageUtils {

    /**
     * 根据身份证中提供的性别信息返回默认base64编码的头像
     *
     * @param IdNumber
     * @return
     */
    public static String getDefaultAvatar(String IdNumber) {
        if (ChineseIdNumber.isMale(IdNumber)) {
            return ImageConstant.DEFAULT_MALE_AVATAR;
        }
        return ImageConstant.DEFAULT_FEMALE_AVATAR;
    }
}
