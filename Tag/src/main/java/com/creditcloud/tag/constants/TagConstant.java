/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.constants;

import com.creditcloud.model.constant.EntityConstant;
import com.creditcloud.tag.model.Tag;

/**
 *
 * @author rooseek
 */
public interface TagConstant {

      /**
     * 用uuid最大长度作为tag name最大长度
     */
    int MAX_TAG_NAME = EntityConstant.UUID_LENGTH;

    int MAX_TAG_DESCRIPTION = 500;
    
    /**
     * 分隔tag中Realm和String的符号
     */
    String SEPERATOR = ":";
    
    Tag[] EMPTY_ARRAY = new Tag[]{};
}
