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
     * @param comment
     * @return
     */
    Comment add(Comment comment);

    /**
     * list by Owner
     *
     * @param owner
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<Comment> listByOwner(RealmEntity owner, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by Owner
     *
     * @param owner
     * @param status
     * @return
     */
    int countByOwner(RealmEntity owner, CommentStatus... status);

    /**
     * list by receiver
     *
     * @param receiver
     * @param pageInfo
     * @param status
     * @return
     */
    PagedResult<Comment> listByReceiver(RealmEntity receiver, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by receiver
     *
     * @param receiver
     * @param status
     * @return
     */
    int countByReceiver(RealmEntity receiver, CommentStatus... status);

    /**
     * mark status for comments
     *
     * @param status
     * @param commentIds
     * @return
     */
    boolean markStatus(CommentStatus status, String... commentIds);
}
