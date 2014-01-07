/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.Realm;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Embeddable
public class RealmEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "REALM", nullable = true)
    private Realm realm;

    @Column(name = "ENTITYID", nullable = true)
    private String entityId;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.realm);
        hash = 73 * hash + Objects.hashCode(this.entityId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RealmEntity other = (RealmEntity) obj;
        if (this.realm != other.realm) {
            return false;
        }
        if (!Objects.equals(this.entityId, other.entityId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (realm != null && entityId != null) {
            return realm + ":" + entityId;
        }
        return "null";
    }
}
