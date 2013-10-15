/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import java.io.Serializable;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author sobranie
 */
public final class PageEntity implements Serializable {

    private static final long serialVersionUID = 20131015L;

    private final UriInfo uriInfo;

    private final Object entity;

    public PageEntity(final UriInfo uriInfo) {
        this(uriInfo, null);
    }

    public PageEntity(final UriInfo uriInfo, final Object entity) {
        this.uriInfo = uriInfo;
        this.entity = entity;
    }

    public UriInfo getUriInfo() {
        return uriInfo;
    }

    public Object getEntity() {
        return entity;
    }
}
