/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.tag.constants.TagConstant;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 可以自定义的标签
 *
 * @author rooseek
 */
@Data
@EqualsAndHashCode(exclude = {"description", "alias"})
public class Tag extends BaseObject {

    private static final long serialVersionUID = 20131230L;

    /**
     * 如果是Realm.STRING表示name中仅仅是字符串，不是系统中的实体
     */
    @NotNull
    private Realm realm;

    /**
     * tag名称，必须唯一
     */
    @NotNull
    @Size(max = TagConstant.MAX_TAG_NAME)
    private String name;

    /**
     * tag的别名，可以不唯一
     */
    @Size(max = TagConstant.MAX_TAG_NAME)
    private String alias;

    @Size(max = TagConstant.MAX_TAG_DESCRIPTION)
    private String description;

    public Tag() {
    }

    public Tag(Realm realm, String name, String alias, String description) {
        this.realm = realm;
        this.name = name;
        this.alias = alias;
        this.description = description;
    }

    @Override
    public String toString() {
        return realm.name().concat(TagConstant.SEPERATOR).concat(name);
    }

    public static Tag valueOf(Realm realm, String tagName) {
        return new Tag(realm, tagName, null, null);
    }
}
