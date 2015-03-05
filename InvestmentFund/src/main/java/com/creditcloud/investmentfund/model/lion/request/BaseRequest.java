/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.request;

import com.creditcloud.investmentfund.model.exception.LionFundSignatureFailedException;
import com.creditcloud.investmentfund.model.lion.enums.Attribute;
import com.creditcloud.investmentfund.utils.LionUtils;
import com.creditcloud.model.BaseObject;
import com.lionfund.exception.ApplicationException;
import com.lionfund.security.Signature;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * 诺安基金 请求参数封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseRequest extends BaseObject {

    /**
     * 接口名称
     */
    private Attribute attribute;
    
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
    }

    public BaseRequest(Attribute attribute, String merid, long stamp) {
        this.attribute = attribute;
        this.merid = merid;
        this.stamp = stamp;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
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
     */
    public void sign(String merchantKey) {
        try {
            Map map = LionUtils.convertObjToMap(this);
            String fragment = merchantKey + LionUtils.convertMapToOrderedData(map) + merchantKey;
            token = new Signature().sign(fragment);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ApplicationException e) {
            throw new LionFundSignatureFailedException(e.getMessage());
        }
    }
}
