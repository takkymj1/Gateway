/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class BaseDTO extends BaseObject {

    /**
     * 交易码
     * 
     * 由新华电商提供
     */
    private String transCode;
    
    /**
     * 接入方应用ID
     * 
     * 与QueryString中appId参数需保持一致由新华电商提供
     */
    private String appId;
    
    /**
     * 交易流水号 UUID
     * 
     * 根据交易流水号进行请求等幂性判断
     */
    private String transSn;
    
    /**
     * 交易时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String transTime;
    
    /**
     * 版本
     */
    private String version;
    
    /**
     * 原交易流水号
     */
    private String originTransSn;
    
    /**
     * 响应模式
     */
    private String rspMode;
    
    /**
     * 响应码
     */
    private String rspCode;
    
    /**
     * 响应消息
     */
    private String rspMsg;

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTransSn() {
        return transSn;
    }

    public void setTransSn(String transSn) {
        this.transSn = transSn;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOriginTransSn() {
        return originTransSn;
    }

    public void setOriginTransSn(String originTransSn) {
        this.originTransSn = originTransSn;
    }

    public String getRspMode() {
        return rspMode;
    }

    public void setRspMode(String rspMode) {
        this.rspMode = rspMode;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspMsg() {
        return rspMsg;
    }

    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
    }
    
}
