/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.tag.model.Tag;
import com.creditcloud.tag.model.TagEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface TagService {

    /**
     * 列出所有可用的tag
     *
     * @param clientCode
     * @return
     */
    List<Tag> listAllTags(String clientCode);

    /**
     * 添加新的tag
     *
     * @param clientCode
     * @param tagName
     * @param tagDescription
     * @return
     */
    Tag addTag(String clientCode, String tagName, String tagDescription);

    /**
     * 给entity标记tag,覆盖之前的tag
     *
     * @param clientCode
     * @param entity
     * @param tagNames
     */
    void tag(String clientCode, RealmEntity entity, String... tagNames);

    /**
     * 列出entity所有的tag
     *
     * @param clientCode
     * @param entity
     * @return
     */
    TagEntity getTagEntity(String clientCode, RealmEntity entity);

    /**
     * 统计tag标记的entity数量
     *
     * @param clientCode
     * @param tagName
     * @return
     */
    int countByTag(String clientCode, String tagName);

    /**
     * 列出tag标记的所有实体
     *
     * @param clientCode
     * @param tagName
     * @param pageInfo
     * @return
     */
    PagedResult<RealmEntity> listByTag(String clientCode, String tagName, PageInfo pageInfo);

    /**
     * 查看entity是否已经拥有某tag
     *
     * @param clientCode
     * @param tagName
     * @param entity
     * @return true if already tagged on entity, false for not
     */
    boolean checkTagExist(String clientCode, String tagName, RealmEntity entity);
}
