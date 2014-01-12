/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.tag.model.Tag;
import com.creditcloud.tag.model.TagEntity;
import java.util.List;
import javax.ejb.Remote;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * @author rooseek
 */
@Remote
public interface TagService {

    /**
     *
     * @param clientCode
     * @param realm
     * @param tagName
     * @return
     */
    Tag getTag(String clientCode, Realm realm, String tagName);

    /**
     * 列出所有可用的tag
     *
     * @param clientCode
     * @param pageInfo
     * @return
     */
    PagedResult<Tag> listAllTags(String clientCode, PageInfo pageInfo);

    /**
     * 根据realm列出所有tag
     *
     * @param clientCode
     * @param realm
     * @param pageInfo
     * @return
     */
    PagedResult<Tag> listAllTagByRealm(String clientCode, Realm realm, PageInfo pageInfo);

    /**
     * 添加更新tag到可用tag列表中
     *
     * @param clientCode
     * @param tag
     * @return
     */
    Tag saveTag(String clientCode, Tag tag);

    /**
     * 给entity标记tag
     *
     * @param clientCode
     * @param entity
     * @param overwrite  true for overwrite previous tags, false for append
     * @param tags
     */
    void tag(String clientCode, RealmEntity entity, boolean overwrite, Pair<Realm, String>... tags);

    /**
     * 给entity标记tag
     *
     * @param clientCode
     * @param entity
     * @param overwrite  true for overwrite previous tags, false for append
     * @param tags
     */
    void tag(String clientCode, RealmEntity entity, boolean overwrite, Tag... tags);

    /**
     * 给entity标记tag
     *
     * @param clientCode
     * @param entity
     * @param overwrite  true for overwrite previous tags, false for append
     * @param tags
     */
    void tag(String clientCode, RealmEntity entity, boolean overwrite, List<Tag> tags);

    /**
     * 列出entity所有的tag
     *
     * @param clientCode
     * @param entity
     * @return 如果没有Tag，会返回null
     */
    TagEntity getTagEntity(String clientCode, RealmEntity entity);

    /**
     * 统计tag标记的entity数量
     *
     * @param clientCode
     * @param tag
     * @return
     */
    int countByTag(String clientCode, Tag tag);

    /**
     * 列出tag标记的所有实体
     *
     * @param clientCode
     * @param tag
     * @param pageInfo
     * @return
     */
    PagedResult<RealmEntity> listByTag(String clientCode, Tag tag, PageInfo pageInfo);

    /**
     * 列出tag标记的属于某realm的所有实体
     *
     * @param clientCode
     * @param tag
     * @param realm
     * @param pageInfo
     * @return
     */
    PagedResult<RealmEntity> listByTagAndRealm(String clientCode, Tag tag, Realm realm, PageInfo pageInfo);

    /**
     * 查看entity是否已经拥有某tag
     *
     * @param clientCode
     * @param tag
     * @param entity
     * @return true if already tagged on entity, false for not
     */
    boolean checkTagExist(String clientCode, Tag tag, RealmEntity entity);

    /**
     * 查看一组RealmEntity是否有共同的tag
     *
     * @param clienCode
     * @param entityList
     * @param tag
     * @return true if all RealmEntity exist and has common tag
     */
    boolean checkCommonTags(String clientCode, List<RealmEntity> entityList, Tag tag);
}
