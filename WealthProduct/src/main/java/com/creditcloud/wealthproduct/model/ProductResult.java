/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 封装数据返回
 * 
 * @param <T>
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductResult<T> extends BaseObject {

    private static final long serialVersionUID = 20150514L;
    
    private T data;
    
    private boolean success;
    
    public ProductResult addError(T data) {
        this.data = data;
        this.success = false;
        return this;
    }
    
    public ProductResult addData(T data) {
        this.data = data;
        this.success = true;
        return this;
    }
    
}
