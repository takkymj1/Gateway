/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.model.BaseObject;
import com.lionfund.exception.ApplicationException;
import com.lionfund.security.Signature;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public BaseRequest(String attribute, String merid, long stamp) {
        this.attribute = attribute;
        this.merid = merid;
        this.stamp = stamp;
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
     * 诺安签名信息
     * 
     * 加密规则：
     * 若数据签名方式为MD5则加密字段为按字母排序的除token字段的所有非空字段
     * keyvalue组成的字符串并在字符串头部和尾部加上商户密码组成的一个源串
     * 例如：
     * 传入参数为“fundacco=421000000 authcode=0000”，商户密码为“123456789”， 
     * 则拼接后为“123456789authcode0000fundacco421000000123456789”
     * 
     * 将上述数据传入诺安基金签名方法new Signature().sign(fragment)进行签名
     * 
     * @param merchantKey 
     * @throws com.lionfund.exception.ApplicationException
     */
    public void sign(String merchantKey) throws ApplicationException {
        try {
            Map<String, String> objectAsMap = new HashMap<>();
            BeanInfo info = Introspector.getBeanInfo(getClass());
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                Method reader = pd.getReadMethod();
                if (!pd.getName().contentEquals("class") && reader != null) {
                    Object obj = reader.invoke(this);
                    if (obj != null)
                        objectAsMap.put(pd.getName(),String.valueOf(reader.invoke(this)));
                }
            }
            
            String fragment = merchantKey + sort(objectAsMap) + merchantKey;
            token = new Signature().sign(fragment);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            
        }
    }
    
    private String sort(Map map) {
        StringBuilder sequence = new StringBuilder();
        Set set = map.keySet();
        Object[] ObjectArr = set.toArray();
        String[] keyArr = new String[ObjectArr.length];
        for (int i = 0; i < ObjectArr.length; i++) {
            keyArr[i] = (String) ObjectArr[i];
        }
        Arrays.sort(keyArr, String.CASE_INSENSITIVE_ORDER);
        for (String key : keyArr) {
            sequence.append(key.trim()).append(map.get(key).toString().trim());
        }
        return sequence.toString();
    }
    
}
