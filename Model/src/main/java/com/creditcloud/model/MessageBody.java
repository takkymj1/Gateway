/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.message.MessageType;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class MessageBody extends BaseObject {

    @Id
    private String id;

    private String title;

    @NotNull
    private String content;

    @NotNull
    private Date sentTime;

    @NotNull
    private Realm realm;

    @NotNull
    private MessageType type;

    private Collection<Message> messages;

    public MessageBody(String id,
                       String title, 
                       String content,
                       Date sentTime, 
                       Realm realm, 
                       MessageType type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sentTime = sentTime;
        this.realm = realm;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages(Collection<Message> messages) {
        this.messages = messages;
    }
}
