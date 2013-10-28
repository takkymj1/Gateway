/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.misc.RealmEntity;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author rooseek
 */
public class ImageUtils {

    /**
     * generate md5 hash for the image
     *
     * @param clientCode
     * @param owner
     * @param imageName
     * @return
     */
    public static String hash(String clientCode, RealmEntity owner, String imageName) {
        String str = clientCode.concat(owner.getEntityId()).concat(imageName);
        return DigestUtils.md5Hex(str);
    }
}
