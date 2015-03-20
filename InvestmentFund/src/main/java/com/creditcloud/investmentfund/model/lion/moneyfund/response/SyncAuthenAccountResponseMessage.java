/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.moneyfund.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class SyncAuthenAccountResponseMessage extends ResponseMessageBase {

    /**
     * 验证码内容
     * 
     */
    private String verCode;
    
    /**
     * 客户是否需要验证码
     * 
     * 0:需要
     * 1:不需要
     * 
     * 诺安基金快捷全部为“0”：需要
     */
    private int needVer;
    
    /**
     * 是否需要平台发送验证码
     * 
     * 0:需要平台发送
     * 1:不需要平台发送
     */
    private int needVerCode;
    
}

