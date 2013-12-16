/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.client;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.constraints.ClientURL;
import com.creditcloud.model.constraints.MobileNumber;
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
     * 客户简称
     */
    @NotNull
    private String shortName;
    
    /**
     * 显示在Market上的title
     */
    @NotNull
    private String title;
    
    /**
     * 系统使用的手机，用于发送重要消息
     */
    @MobileNumber
    private String mobile;

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

    public Client(String name,
                  String shortName,
                  String title,
                  String mobile,
                  String code,
                  String url,
                  Locale locale) {
        this.name = name;
        this.shortName = shortName;
        this.title = title;
        this.mobile = mobile;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
