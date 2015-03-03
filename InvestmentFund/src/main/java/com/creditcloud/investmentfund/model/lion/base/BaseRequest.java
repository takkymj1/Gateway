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
    
    
}
