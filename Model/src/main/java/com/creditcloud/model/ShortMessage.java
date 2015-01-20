/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jinlzhang
 */
@XmlRootElement
public class ShortMessage extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    @NotNull
    private String mobile;

    @NotNull
    private String content;

    @NotNull
    private Date sentTime;

    @NotNull
    private String type;

    public ShortMessage() {
    }

    public ShortMessage(String id, String mobile, String content, Date sentTime, String type) {
        this.id = id;
        this.mobile = mobile;
        this.content = content;
        this.sentTime = sentTime;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
