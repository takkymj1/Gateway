/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.security;

import com.creditcloud.model.enums.client.Privilege;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Need some specific privileges
 *  
 * @author sobranie
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
public @interface PrivilegeRequired {
    /**
     * The name/code of the privileges required
     * 
     * @return 
     */
    public Privilege[] value();
}
