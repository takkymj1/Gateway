/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author rooseek
 */
public class ImageUtils {

    /**
     * generate md5 hash for image of an entity
     *
     * @param clientCode
     * @param entityId
     * @param imageName
     * @return
     */
    public static String hash(String clientCode, String entityId, String imageName) {
        String str = clientCode.concat(entityId).concat(imageName);
        return DigestUtils.md5Hex(str);
    }
}
