/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Base class for entity classes that presents a authenticatable principal Note
 * this kinda object is ALWAYS using UUID as key and belongs to a specific
 * client
 *
 * @author sobranie
 */
@MappedSuperclass
public abstract class Authenticatable extends ClientScopeEntity {

    /**
     * passphrase value
     */
    @Column(nullable = false, length = 40)
    protected String passphrase;
    /**
     * salt value in hex
     */
    @Column(nullable = false, length = 120)
    protected String salt;
    /**
     * The timestamp that last successfully login
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassphrase() {
        return this.passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
