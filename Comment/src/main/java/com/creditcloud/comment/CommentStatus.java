/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.comment;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CommentStatus implements BaseEnum {

    /**
     * 评论都是公开的，一经发表所有人可见<p>
     * 所以NEW和READ都是针对评论对象实体owner的状态,如贷款的申请人<p>
     * 作为未来可能的扩展,评论内容支持@someone功能，那么NEW和READ就是针对someone<p>
     */
    NEW("新建"),
    READ("已读"),
    /**
     * 评论只有系统有删除权限
     */
    DELETED("已删除");

    private final String key;

    private CommentStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
