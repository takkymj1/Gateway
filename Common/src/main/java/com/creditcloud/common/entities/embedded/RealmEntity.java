/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.Realm;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * identify an entity by its id and belonging realm
 *
 * @author rooseek
 */
@Embeddable
public class RealmEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Realm realm;

    @Column(nullable = true)
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
