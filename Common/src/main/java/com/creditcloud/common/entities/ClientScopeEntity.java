/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities;

import com.creditcloud.model.constraints.ClientCode;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * The entities that having a ClientCode field.
 *
 * This means the record are belongs to specific Client
 *
 * @author sobranie
 */
@MappedSuperclass
public abstract class ClientScopeEntity extends UUIDEntity {

    /**
     * belonging client
     */
    @ClientCode
    @Column(name = "ClientCode", nullable = false, length = 4)
    protected String clientCode;

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }
}
