/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.comment;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Comment used to interact with other service
 *
 * @author rooseek
 */
@XmlRootElement
public class Comment extends BaseObject {

    private static final long serialVersionUID = 20131021L;

    private String id;

    /**
     * 此评论回复的其他评论id，从而支持评论的树状显示<p>
     */
    private String parentId;

    /**
     * 评论对应的实体,如贷款申请，认证项，图片等
     */
    @NotNull
    private RealmEntity owner;

    /**
     * 评论内容
     */
    @NotNull
    private String content;

    /**
     * 评论对应实体的拥有者或关联者的域,必须是employee或user<p>
     * 且receiver和sender是同一个域
     */
    @NotNull
    private Realm realm;

    /**
     * 评论发送人
     */
    @NotNull
    private String sender;

    /**
     * 评论对应接收人
     */
    private String receiver;

    /**
     * 评论状态
     */
    @NotNull
    private CommentStatus status;

    private Date timeRecorded;

    public Comment() {
    }

    public Comment(String id,
                   String parentId,
                   RealmEntity owner,
                   String content,
                   Realm realm,
                   String sender,
                   String receiver,
                   CommentStatus status,
                   Date timeRecorded) {
        this.id = id;
        this.parentId = parentId;
        this.owner = owner;
        this.content = content;
        this.realm = realm;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.timeRecorded = timeRecorded;
    }

    public void setOwner(RealmEntity owner) {
        this.owner = owner;
    }

    public RealmEntity getOwner() {
        return owner;
    }

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getContent() {
        return content;
    }

    public Realm getRealm() {
        return realm;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public CommentStatus getStatus() {
        return status;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setStatus(CommentStatus status) {
        this.status = status;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }
}
