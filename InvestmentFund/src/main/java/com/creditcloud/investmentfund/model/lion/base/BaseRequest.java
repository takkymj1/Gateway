/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.base;

import com.creditcloud.model.BaseObject;

/**
 * 诺安基金 请求参数封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
public abstract class BaseRequest extends BaseObject {

    /**
     * 接口名称
     */
    public String attribute;
    
    /**
     * 商户ID，由诺安基金分配
     */
    public String merid;
    
    /**
     * 时间串（long型的毫秒数）
     */
    public long stamp;
    
    /**
     * 电商加密串，服务端要验证token
     */
    public String token;

    public BaseRequest() {
    }

    public BaseRequest(String attribute, String merid, long stamp, String token) {
        this.attribute = attribute;
        this.merid = merid;
        this.stamp = stamp;
        this.token = token;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getMerid() {
        return merid;
    }

    public void setMerid(String merid) {
        this.merid = merid;
    }

    public long getStamp() {
        return stamp;
    }

    public void setStamp(long stamp) {
        this.stamp = stamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
