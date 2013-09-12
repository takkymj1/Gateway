/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.message.MessageType;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class MessageBody extends BaseObject {

    private final String title;

    @NotNull
    private final String content;

    @NotNull
    private final Date sentTime;

    @NotNull
    private final Realm realm;

    @NotNull
    private final MessageType type;

    public MessageBody(String title,
                       String content,
                       Date sentTime,
                       Realm realm,
                       MessageType type) {
        this.title = title;
        this.content = content;
        this.sentTime = sentTime;
        this.realm = realm;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public Realm getRealm() {
        return realm;
    }

    public MessageType getType() {
        return type;
    }
}
