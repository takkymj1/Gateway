/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.api;


/**
 *
 * @author tinglany
 */

public class UserResult {

    protected String type;
    protected String userBase;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the userBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBase() {
        return userBase;
    }

    /**
     * Sets the value of the userBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBase(String value) {
        this.userBase = value;
    }

}