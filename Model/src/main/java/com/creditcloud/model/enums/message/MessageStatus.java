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
public enum MessageStatus implements BaseEnum {

    NEW("新消息"),
    READ("已读"),
    ARCHIVED("已存档"),
    DELETED("已刪除"),
    NEW_OR_READ("新消息或已读消息,不存储只用于搜索"),
    ALL("所有未删除的,不存储仅用于搜索");

    private final String key;

    private MessageStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * convert status to a list of MessageStatus
     *
     * @param status
     * @return
     */
    public static List<MessageStatus> convertStatus(MessageStatus status) {
        List<MessageStatus> statusList;
        switch (status) {
            case NEW:
            case READ:
            case ARCHIVED:
                statusList = Arrays.asList(status);
                break;
            case NEW_OR_READ:
                statusList = Arrays.asList(MessageStatus.NEW, MessageStatus.READ);
                break;
            case ALL:
                statusList = Arrays.asList(MessageStatus.NEW, MessageStatus.READ, MessageStatus.ARCHIVED);
                break;
            default:
                statusList = new ArrayList();
        }

        return statusList;
    }
}
