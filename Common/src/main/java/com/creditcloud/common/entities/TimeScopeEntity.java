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
 * abstract classes for entities has created time and last modified time
 *
 * @author rooseek
 */
@MappedSuperclass
public abstract class TimeScopeEntity extends UUIDEntity {

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date timeCreated;

    @Column(nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date timeLastUpdated;

    @PrePersist
    private void setup() {
        Date date = new Date();
        this.timeCreated = date;
        this.timeLastUpdated = date;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }
}
