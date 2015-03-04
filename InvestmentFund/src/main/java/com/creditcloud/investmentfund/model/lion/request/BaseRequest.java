/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.model.BaseObject;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 诺安基金 请求参数封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseRequest extends BaseObject {

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
    
    /**
     * 签名信息
     * 
     * @return 
     */
    public Map sign() {
        try {
            Map<String, Object> objectAsMap = new HashMap<>();
            BeanInfo info = Introspector.getBeanInfo(getClass());
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                Method reader = pd.getReadMethod();
                if (!pd.getName().contentEquals("class") && reader != null) {
                    Object obj = reader.invoke(this);
                    if (obj != null)
                        objectAsMap.put(pd.getName(),String.valueOf(reader.invoke(this)));
                }
            }
            return objectAsMap;
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            
        }
        return null;
    }
}
