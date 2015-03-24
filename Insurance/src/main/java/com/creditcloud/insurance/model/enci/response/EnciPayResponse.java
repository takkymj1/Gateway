/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import javax.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新华电商支付接口回调
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnciPayResponse {
    
    /**
     * 保单号
     */
    @QueryParam(value = "policyNo")
    private String policyNo;
    
    /**
     * 支付结果状态码
     * 
     * 92 支付成功；91 支付失败
     */
    @QueryParam(value = "tradeStatus")
    private String tradeStatus;
    
    /**
     * 实际支付时间的时间戳
     */
    @QueryParam(value = "time")
    private long time;
    
    /**
     * 渠道编码
     */
    @QueryParam(value = "channelCode")
    private String channelCode;
    
    /**
     * 加密串
     */
    @QueryParam(value = "sign")
    private String sign;
    
    /**
     * 业务类型
     */
    @QueryParam(value = "bizType")
    private String bizType;
}
