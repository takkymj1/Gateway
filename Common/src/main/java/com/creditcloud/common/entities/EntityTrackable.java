/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities;

import com.creditcloud.common.entities.embedded.RealmEntity;

/**
 * any entity designed to track meaningful changes, should implements this
 * interface, to identify the last operator who ever change this entity
 *
 * @author rooseek
 */
public interface EntityTrackable {

    /**
     * return entity who is the one modify this entity
     *
     * @return
     */
    RealmEntity getLastModifiedBy();
}
