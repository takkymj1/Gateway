/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.comment.model;

import com.creditcloud.comment.CommentStatus;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
     * 评论对应的实体域
     */
    @NotNull
    private Realm entityRealm;

    /**
     * 此评论回复的其他评论id，从而支持评论的树状显示<p>
     * TODO 目前为简化流程，CommentService接口中暂不暴露此id
     */
    @NotNull
    private String parentId;

    /**
     * 评论对应的实体,如贷款申请，认证项，图片等
     */
    @NotNull
    private String entityId;

    /**
     * 评论发送人
     */
    @NotNull
    private String sender;

    /**
     * 评论对应实体的owner
     */
    @Column(nullable = true)
    private String receiver;

    /**
     * 评论对应实体的owner的域,必须是employee/user
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Realm receiverRealm;

    /**
     * 评论内容
     */
    @NotNull
    private String content;

    /**
     * 评论状态
     */
    @NotNull
    private CommentStatus status;
    
    private Date timeRecorded;

    public Comment(String id,
                   String parentId,
                   Realm entityRealm,
                   String entityId,
                   String sender,
                   String receiver,
                   Realm receiverRealm,
                   String content,
                   CommentStatus status,
                   Date timeRecorded) {
        this.id = id;
        this.entityRealm = entityRealm;
        this.parentId = parentId;
        this.entityId = entityId;
        this.sender = sender;
        this.receiver = receiver;
        this.receiverRealm = receiverRealm;
        this.content = content;
        this.status = status;
        this.timeRecorded = timeRecorded;
    }

    public Comment() {
    }

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public CommentStatus getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(CommentStatus status) {
        this.status = status;
    }

    public Realm getEntityRealm() {
        return entityRealm;
    }

    public Realm getReceiverRealm() {
        return receiverRealm;
    }

    public void setEntityRealm(Realm entityRealm) {
        this.entityRealm = entityRealm;
    }

    public void setReceiverRealm(Realm receiverRealm) {
        this.receiverRealm = receiverRealm;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }
}
