/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.message;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MessageStatus implements BaseEnum {

    NEW("新消息"),
    READ("已读");
//    SENDER_DELETED("发送人删除"),
//    RECEIVER_DELETED("收信人删除"),
//    ALL_DELETED("已删除");

    private final String key;

    private MessageStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
