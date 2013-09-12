/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.message.MessageStatus;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Message extends BaseObject {

    @NotNull
    private final MessageBody body;

    private final String sender;

    @NotNull
    private final String receiver;

    @NotNull
    private MessageStatus status;

    public Message(MessageBody body,
                   String sender,
                   String receiver,
                   MessageStatus status) {
        this.body = body;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
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
}
