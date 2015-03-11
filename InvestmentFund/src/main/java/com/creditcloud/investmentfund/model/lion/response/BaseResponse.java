/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.constant.FundConstant;
import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

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

    /**
     * 是否成功
     * 
     * @return 
     */
    public boolean success() {
        if(StringUtils.isNotEmpty(returnCode)) {
            return returnCode.contentEquals(FundConstant.SUCCESS_CODE);
        }else{
            return false;
        }
    }
}
