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
    protected Date lastLoginDate;

    /**
     * The time that this guy registered, the value is immutable
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    protected Date registerDate;

    /**
     * indicate whether the entity need to change its password on login
     */
    @Column(nullable = false)
    protected boolean needChangePassword;
    
    /**
     * 账户是否可以用.
     * 
     * 用于封禁账户或类似功能
     */
    @Column(nullable = false)
    protected boolean enabled;

    /**
     * Setup when the entity been created.
     *
     * We setup the registerDate here.
     */
    @PrePersist
    private void setup() {
        this.registerDate = new Date();
    }

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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isNeedChangePassword() {
        return needChangePassword;
    }

    public void setNeedChangePassword(boolean needChangePassword) {
        this.needChangePassword = needChangePassword;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
