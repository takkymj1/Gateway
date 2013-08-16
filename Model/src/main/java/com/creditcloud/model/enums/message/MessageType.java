/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.message;

import com.creditcloud.model.enums.BaseEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rooseek
 */
public enum MessageType implements BaseEnum {

    /**
     * seen by receiver
     */
    NOTIFICATION("系统通知"),
    /**
     * seen by sender and receiver
     */
    MESSAGE("私信"),
    ALL("所有,不存储只用于搜索");

    private final String key;

    private MessageType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * convert message type to a list of MessageType
     *
     * @param type
     * @return
     */
    public static List<MessageType> convertType(final MessageType type) {
        List<MessageType> typeList;
        switch (type) {
            case NOTIFICATION:
            case MESSAGE:
                typeList = Arrays.asList(type);
                break;
            case ALL:
                typeList = Arrays.asList(NOTIFICATION, MESSAGE);
                break;
            default:
                typeList = new ArrayList();
        }

        return typeList;
    }
}
