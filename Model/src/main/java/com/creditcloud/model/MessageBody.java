/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.message.MessageType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class MessageBody extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    private String title;

    @NotNull
    private String content;

    @NotNull
    private Date sentTime;

    @NotNull
    private Realm realm;

    @NotNull
    private MessageType type;

    public MessageBody() {
    }

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
