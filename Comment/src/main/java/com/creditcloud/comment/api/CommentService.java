/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.comment.api;

import com.creditcloud.comment.CommentStatus;
import com.creditcloud.comment.model.Comment;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.PagedResult;
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
     * list by entity
     *
     * @param entityRealm
     * @param entityId
     * @param pageInfo
     * @return
     */
    PagedResult<Comment> listByEntity(Realm entityRealm, String entityId, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by entity
     *
     * @param entityRealm
     * @param entityId
     * @param status
     * @return
     */
    int countByEntity(Realm entityRealm, String entityId, CommentStatus... status);

    /**
     * list by receiver
     *
     * @param receiverRealm
     * @param receiver
     * @param pageInfo
     * @return
     */
    PagedResult<Comment> listByReceiver(Realm receiverRealm, String receiver, PageInfo pageInfo, CommentStatus... status);

    /**
     * count by receiver
     *
     * @param receiverRealm
     * @param receiver
     * @param status
     * @return
     */
    int countByReceiver(Realm receiverRealm, String receiver, CommentStatus... status);

    /**
     * mark status for comments
     *
     * @param status
     * @param commentIds
     * @return
     */
    boolean markStatus(CommentStatus status, String... commentIds);
}
