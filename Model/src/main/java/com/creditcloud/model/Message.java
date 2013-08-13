/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.message.MessageStatus;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Message extends BaseObject {

    @Id
    private String id;

    @NotNull
    private MessageBody body;

    private String sender;

    @NotNull
    private String receiver;

    @NotNull
    private MessageStatus status;

    public Message() {
    }

    public Message(String id, MessageBody body, String sender, String receiver, MessageStatus status) {
        this.id = id;
        this.body = body;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public void setBody(MessageBody body) {
        this.body = body;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public MessageBody getBody() {
        return body;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
