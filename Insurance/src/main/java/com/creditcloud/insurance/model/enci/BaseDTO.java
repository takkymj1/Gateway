/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci;

import com.creditcloud.common.utils.DateUtils;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import java.util.UUID;
import lombok.Data;

/**
 * request & response
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
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
     *  
     * 成功:  FI00000或 SI00000
     * 处理中: FI00001或 SI00001
     * 失败： 其他
     */
    private String rspCode;
    
    /**
     * 响应消息
     */
    private String rspMsg;

    
    public void initHeader(String appId, String transCode){
        this.setTransCode(transCode);
        this.setAppId(appId);
        this.setRspCode("S");
        this.setTransSn(UUID.randomUUID().toString());
        this.setTransTime(DateUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }
}
