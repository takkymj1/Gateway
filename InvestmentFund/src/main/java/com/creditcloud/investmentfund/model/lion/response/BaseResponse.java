/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 诺安基金 响应封装
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
