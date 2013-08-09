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
public enum MessageType implements BaseEnum {

    /**
     * seen by receiver
     */
    NOTIFICATION("系统通知"),
    /**
     * seen by all, but only store one copy
     */
    GLOBAL_BROADCAST("系统广播"),
    /**
     * seen by a group of people, but only store one copy
     */
    GROUP_BROADCAST("组广播"),
    /**
     * seen by sender and receiver
     */
    MESSAGE("私信");

    private final String key;

    private MessageType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
