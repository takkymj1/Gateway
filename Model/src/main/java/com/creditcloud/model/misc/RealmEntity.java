/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * identify an entity by its id and belonging realm
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class RealmEntity extends BaseObject {

    private static final long serialVersionUID = 20131023L;

    @NotNull
    private Realm realm;

    @NotNull
    private String entityId;

    @Override
    public String toString() {
        return realm + ":" + entityId;
    }

    /**
     * 快速建立RealmEntity
     * 
     * @param realm
     * @param entityId
     * @return 
     */
    public static RealmEntity of(final Realm realm, final String entityId) {
        return new RealmEntity(realm, entityId);
    }
}
