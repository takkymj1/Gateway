/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import com.creditcloud.common.security.LoginRequired;
import com.creditcloud.common.security.PrivilegeRequired;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Response;

/**
 * TODO: We can cache the filter instance somehow
 *
 * @author sobranie
 */
public abstract class AbstractAuthenticationFilter implements ContainerRequestFilter {

    @Inject
    protected javax.inject.Provider<HttpServletRequest> request;
    
    @Inject
    protected javax.inject.Provider<ResourceInfo> resourceInfo;

    protected abstract boolean checkLogin();

    protected abstract boolean checkPrivileges(final String... privileges);

    @Override
    public void filter(ContainerRequestContext requestContext) {

        Set<String> priv = new HashSet<String>();

        PrivilegeRequired pr = resourceInfo.get().getResourceClass().getAnnotation(PrivilegeRequired.class);
        if (pr != null && pr.value() != null && pr.value().length > 0) {
            priv.addAll(Arrays.asList(pr.value()));
        }

        pr = resourceInfo.get().getResourceMethod().getAnnotation(PrivilegeRequired.class);
        if (pr != null && pr.value() != null && pr.value().length > 0) {
            priv.addAll(Arrays.asList(pr.value()));
        }

        String[] privileges = priv.toArray(new String[priv.size()]);
        boolean loginRequired = privileges.length > 0
                || resourceInfo.get().getResourceClass().isAnnotationPresent(LoginRequired.class)
                || resourceInfo.get().getResourceMethod().isAnnotationPresent(LoginRequired.class);

        if (loginRequired && !checkLogin()) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        if (privileges.length > 0 && !checkPrivileges(privileges)) {
            throw new WebApplicationException(Response.Status.FORBIDDEN);
        }
    }
}
