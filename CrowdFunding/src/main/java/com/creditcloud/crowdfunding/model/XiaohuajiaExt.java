/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class XiaohuajiaExt extends BaseObject{
    Xiaohuajia xiaohuajia;
    private boolean isOperation;
    public XiaohuajiaExt(Xiaohuajia huajia,boolean isOperation){
        this.xiaohuajia = huajia;
        this.isOperation = isOperation;
    }
}
