/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.message.MessageStatus;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class Message extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private MessageBody body;

    private String sender;

    @NotNull
    private String receiver;

    @NotNull
    private MessageStatus status;

    public Message() {
    }

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

    public void setBody(MessageBody body) {
        this.body = body;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
