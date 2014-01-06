/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import com.creditcloud.common.security.FreeAccess;
import com.creditcloud.common.security.LoginRequired;
import com.creditcloud.common.security.PrivilegeRequired;
import com.creditcloud.model.enums.client.Privilege;
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

    /**
     * 检查当前用户是是否拥有<b>任意一个</b>要求的权限
     * 
     * @param privileges 要求的权限列表
     * @return 
     */
    protected abstract boolean checkPrivileges(final Privilege... privileges);

    @Override
    public void filter(ContainerRequestContext requestContext) {
        
        if (resourceInfo.get().getResourceMethod().isAnnotationPresent(FreeAccess.class)) {
            return;
        }

        Set<Privilege> priv = new HashSet<>();

        PrivilegeRequired pr = resourceInfo.get().getResourceClass().getAnnotation(PrivilegeRequired.class);
        if (pr != null && pr.value() != null && pr.value().length > 0) {
            priv.addAll(Arrays.asList(pr.value()));
        }

        pr = resourceInfo.get().getResourceMethod().getAnnotation(PrivilegeRequired.class);
        if (pr != null && pr.value() != null && pr.value().length > 0) {
            priv.addAll(Arrays.asList(pr.value()));
        }

        Privilege[] privileges = priv.toArray(new Privilege[priv.size()]);
        boolean loginRequired = privileges.length > 0
                || resourceInfo.get().getResourceClass().isAnnotationPresent(LoginRequired.class)
                || resourceInfo.get().getResourceMethod().isAnnotationPresent(LoginRequired.class);
        
        if (loginRequired && !checkLogin()) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
        if (privileges.length > 0 && !checkPrivileges(privileges)) {
            request.get().setAttribute("insufficientPrivilege", privileges[0].getKey());
            throw new WebApplicationException(privileges[0].getKey(), Response.Status.FORBIDDEN);
        }
    }
}
