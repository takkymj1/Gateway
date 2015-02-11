/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.comment.api;

import com.creditcloud.comment.CommentStatus;
import com.creditcloud.comment.Comment;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface CommentService {

    /**
     * add new comment
     *
     * @param clientCode
     * @param comment
     * @return
     */
    Comment add(String clientCode, Comment comment);

    /**
     * list by Owner
     *
     * @param clientCode
     * @param owner
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<Comment> listByOwner(String clientCode, RealmEntity owner, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by Owner
     *
     * @param clientCode
     * @param owner
     * @param status
     * @return
     */
    int countByOwner(String clientCode, RealmEntity owner, CommentStatus... status);

    /**
     * list by receiver
     *
     * @param clientCode
     * @param receiver
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<Comment> listByReceiver(String clientCode, RealmEntity receiver, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by receiver
     *
     * @param clientCode
     * @param receiver
     * @param status
     * @return
     */
    int countByReceiver(String clientCode, RealmEntity receiver, CommentStatus... status);

    /**
     * mark status for comments
     *
     * @param clientCode
     * @param status
     * @param commentIds
     * @return
     */
    boolean markStatus(String clientCode, CommentStatus status, String... commentIds);

    /**
     * 根据状态列出所有评论
     * @param clientCode
     * @param pageInfo
     * @param status
     * @return 
     */
    PagedResult<Comment> listAllByStatus(String clientCode, PageInfo pageInfo, CommentStatus... status);
    
    /**
     * 根据senders和状态查找评论
     * @param clientCode
     * @param senders
     * @param pageInfo
     * @param status
     * @return 
     */
    PagedResult<Comment> listBySenders(String clientCode, List<RealmEntity> senders, PageInfo pageInfo, CommentStatus... status);
    
    /**
     * 根据ID查找评论
     * @param clientCode
     * @param id
     * @return 
     */
    Comment findById(String clientCode, String id);
}
