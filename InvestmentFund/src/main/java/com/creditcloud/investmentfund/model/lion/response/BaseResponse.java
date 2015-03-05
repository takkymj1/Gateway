/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.model.exception.LionFundSignatureVerifyFailedException;
import com.creditcloud.investmentfund.utils.LionUtils;
import com.creditcloud.model.BaseObject;
import com.lionfund.exception.ApplicationException;
import com.lionfund.security.Signature;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 诺安基金 响应封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseResponse extends BaseObject {

    /**
     * 错误码
     */
    private String returnCode;
    
    /**
     * 错误描述，小于200字节
     */
    private String returnmsg;
    
    /**
     * MD5加密串
     */
    private String token;
    
    /**
     * 时间串（long型的毫秒数）
     */
    private long stamp;

    private BaseResponse() {
    }

    public BaseResponse(String returnCode, String returnmsg, String token, long stamp) {
        this.returnCode = returnCode;
        this.returnmsg = returnmsg;
        this.token = token;
        this.stamp = stamp;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnmsg() {
        return returnmsg;
    }

    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getStamp() {
        return stamp;
    }

    public void setStamp(long stamp) {
        this.stamp = stamp;
    }
    
    public boolean isValid(String merchantKey) {
        try {
            Map map = LionUtils.convertObjToMap(this);
            new Signature().signValidate(map, merchantKey, token);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ApplicationException ex) {
            throw new LionFundSignatureVerifyFailedException(ex.getMessage());
        }
        return false;
    }
}
