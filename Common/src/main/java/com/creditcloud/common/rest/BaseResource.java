/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import com.creditcloud.common.validation.ValidatorWrapper;
import java.io.Serializable;
import java.net.URI;
import javax.annotation.Resource;
import javax.validation.Validator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.glassfish.jersey.server.mvc.Viewable;

/**
 *
 * @author sobranie
 */
public abstract class BaseResource implements Serializable {

    @Context
    protected UriInfo uriInfo;

    @Resource
    protected Validator validator;

    private ValidatorWrapper validatorWrapper;

    protected Response forward(String path) {
        return forward(path, null);
    }

    protected Response forward(String path, Object entity) {
        return Response.ok(new Viewable(path, new PageEntity(uriInfo, entity))).build();
    }

    protected Response redirect(String path) {
        return Response.seeOther(uriInfo.getBaseUriBuilder().path(path).build()).build();
    }
    
    /**
     * customized redirect, avoid automatic uri encoding
     * @param path
     * @return 
     */
    protected Response redirectRaw(String path) {
        StringBuilder sbuilder = new StringBuilder();
        if (uriInfo.getBaseUri().toString().endsWith("/")) {
            sbuilder.append(uriInfo.getBaseUri().toString().substring(0, uriInfo.getBaseUri().toString().length() - 1));
        }
        sbuilder.append(path);
        return Response.seeOther(URI.create(sbuilder.toString())).build();
    }

    protected ValidatorWrapper getValidatorWrapper() {
        if (validatorWrapper == null) {
            validatorWrapper = new ValidatorWrapper(validator);
        }
        return validatorWrapper;
    }

    /**
     * get the current jersey path
     *
     * @return
     */
    protected String getAbsolutePath() {
        return uriInfo.getAbsolutePath().getPath();
    }
}
