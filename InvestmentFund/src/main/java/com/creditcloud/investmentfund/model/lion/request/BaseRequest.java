/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import com.creditcloud.model.BaseObject;
import java.util.Calendar;
import lombok.Getter;
import lombok.Setter;

/**
 * 诺安基金 请求参数封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseRequest extends BaseObject {

    /**
     * 接口名称
     */
    @Getter
    @Setter
    private String attribute;
    
    /**
     * 商户ID，由诺安基金分配
     */
    private String merid;
    
    /**
     * 时间串（long型的毫秒数）
     */
    private long stamp;
    
    /**
     * 电商加密串，服务端要验证token
     */
    private String token;

    public BaseRequest() {
        this.stamp = Calendar.getInstance().getTimeInMillis();
    }

    public BaseRequest(Attribute attribute, String merid) {
        this.attribute = attribute.name();
        this.merid = merid;
        this.stamp = Calendar.getInstance().getTimeInMillis();
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
}
