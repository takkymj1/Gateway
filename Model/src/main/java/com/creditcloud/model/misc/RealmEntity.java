/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Realm;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * identify an entity by its id and belonging realm
 *
 * @author rooseek
 */
@XmlRootElement
public class RealmEntity extends BaseObject {

    private static final long serialVersionUID = 20131023L;

    @NotNull
    private Realm realm;

    @NotNull
    private String entityId;

    public RealmEntity() {
    }

    public RealmEntity(Realm realm, String entityId) {
        this.realm = realm;
        this.entityId = entityId;
    }

    public Realm getRealm() {
        return realm;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
}
