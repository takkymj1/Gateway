/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.model.BaseObject;
import lombok.Data;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 * @param <T>
 */
@Data
public class FundResult<T extends FundObject> extends BaseObject {

    private T data;
    
    private String message;
    
    private boolean success;
    
    public FundResult(T data) {
        this.data = data;
        this.success = true;
    }
    
    /**
     * 错误消息
     * @param error 
     */
    public FundResult(String error) {
        this.message = error;
        this.success = false;
    }
}