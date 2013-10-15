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
    READ("已读"),
    ARCHIVED("已存档"),
    /**
     * 发件人已删除message,但收件人仍然可以看到
     */
    DELETED_BY_SENDER("发送人已刪除"),
    /**
     * 收件人已删除message，但发件人仍然可以看到
     */
    DELETED_BY_RECEIVER("接收人已删除"),
    /**
     * TODO目前支持的刪除操作，一旦删除那么sender和receiver将都不可见
     */
    DELETED("已刪除");

    private final String key;

    private MessageStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
