/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.request;

import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新华电商支付接口请求
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnciPayRequest{
    
    /**
     * 加密后保单号   Md5加密
     */
    @FormParam(value = "policyNo")
    private String policyNo;
    
    /**
     * 支付时间戳
     */
    @FormParam(value = "time")
    private long time;
    
    /**
     * 渠道编码
     */
    @FormParam(value = "channelCode")
    private String channelCode;
    
    /**
     * 加密串   Md5加密
     */
    @FormParam(value = "sign")
    private String sign;
    
    /**
     * 业务类型
     * AMChannel=保费追加;空值为默认承保
     */
    @FormParam(value = "bizType")
    private String bizType;
    
    /**
     * 保费追加金额
     */
    @FormParam(value = "amount")
    private String amount;
}
