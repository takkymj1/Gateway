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
     * 列出entity所有tag中属于realm的tag
     *
     * @param clientCode
     * @param entity
     * @param realm
     * @return
     */
    List<Tag> listTagByRealm(String clientCode, RealmEntity entity, Realm realm);

    /**
     * 添加更新tag到可用tag列表中
     *
     * @param clientCode
     * @param tag
     * @return
     */
    Tag saveTag(String clientCode, Tag tag);
    
    /**
     * 将两个RealmEntity用tag建立链接
     * 
     * @param clientCode
     * @param source
     * @param target
     * @param reverse 是否同时建立反向的链接. 将在target对象上打上以source为内容的tag.
     * @param replaceLink 如果当前source已经与同Realm的其他target链接，是否将原有链接替换掉
     * @param replaceReverseLink 当reverse为true时，如果target当前与同Realm的其他source链接，是否将原有反向的链接替换掉
     * @param alias 链接tag的Readable说明，reverse为true时，也使用同样的alias
     * @param description 链接tag的详细描述，reverse为true时，也使用同样的description
     */
    void link(String clientCode,
              RealmEntity source,
              RealmEntity target,
              boolean reverse,
              boolean replaceLink,
              boolean replaceReverseLink,
              String alias,
              String description);
    
    /**
     * 解除两个RealmEntity之间的链接
     * 
     * @param clientCode
     * @param source
     * @param target
     * @param unlinkReverse 如果有反向链接，是否一并解除
     */
    void unlink(String clientCode, RealmEntity source, RealmEntity target, boolean unlinkReverse);
    
    /**
     * 删除entity上所有Realm类的tag关联
     * 
     * @param clientCode
     * @param entity
     * @param realm 
     */
    void unlinkAny(String clientCode, RealmEntity entity, Realm realm);
    
    /**
     * 根据source的tag查找对应的target RealmEntity，并以Tag的形式返回
     * 
     * @param clientCode
     * @param source
     * @param realm
     * @return null表示没有realm类型的target与source相链接
     */
    Tag refer(String clientCode, RealmEntity source, Realm realm);

    /**
     * 给entity标记tag，慎用！
     *
     * @param clientCode
     * @param entity
     * @param overwrite  true for overwrite previous tags, false for append
     * @param tags
     */
    void tag(String clientCode, RealmEntity entity, boolean overwrite, Pair<Realm, String>... tags);

    /**
     * 给entity标记tag，慎用！
     *
     * @param clientCode
     * @param entity
     * @param overwrite  true for overwrite previous tags, false for append
     * @param tags
     */
    void tag(String clientCode, RealmEntity entity, boolean overwrite, Tag... tags);

    /**
     * 给entity标记tag，慎用！
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
     * @param clientCode
     * @param entityList
     * @param tag
     * @return true if all RealmEntity exist and has common tag
     */
    boolean checkCommonTags(String clientCode, List<RealmEntity> entityList, Tag tag);
}
