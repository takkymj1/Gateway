/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.util.Locale;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class Client extends BaseObject {
    /**
     * full name of the client
     */
    @NotNull
    protected String name;
    /**
     * 4 characters codes
     */
    @NotNull
    protected String code;
    /**
     * url
     */
    @NotNull
    protected String url;
    /**
     * locale setting for this client
     */
    @NotNull
    protected Locale locale;
    
    public Client(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
