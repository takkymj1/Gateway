/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.ClientURL;
import java.util.Locale;
import javax.validation.constraints.NotNull;

/**
 * 表示客户机构
 *
 * @author sobranie
 */
public class Client extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    /**
     * full name of the client
     */
    @NotNull
    protected String name;

    /**
     * 4 characters codes 唯一标识
     */
    @ClientCode
    protected String code;

    /**
     * url
     */
    @ClientURL
    protected String url;

    /**
     * locale setting for this client
     */
    @NotNull
    protected Locale locale;

    public Client() {
    }

    public Client(String name, String code, String url, Locale locale) {
        this.name = name;
        this.code = code;
        this.url = url;
        this.locale = locale;
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
