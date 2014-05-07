/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * read only record entities, with unmodified record time
 *
 * @author rooseek
 */
@MappedSuperclass
public class RecordScopeEntity extends UUIDEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    protected Date timeRecorded;

    @PrePersist
    private void setup() {
        this.timeRecorded = new Date();
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }
}
