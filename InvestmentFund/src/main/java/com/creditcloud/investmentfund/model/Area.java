/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.AreaLevel;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 银行网点区域
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area extends BaseObject {

    /**
     * uuid
     */
    private String id;
    
    /**
     * 上级区域id，从而支持区域的树状显示
     * 
     * @return
     */
    private String parentId;

    /**
     * 区域名称
     * 
     * @return
     */
    private String name;
    
    /**
     * 区域代码 <br>
     * 
     * 各家的区域代码不一样可以通过FundBrand区分 <br>
     * 
     * @return
     */
    private String code;
    
    /**
     * 区域类别
     * 
     * @return
     */
    private AreaLevel areaLevel;
    
    /**
     * 基金品牌
     * 
     * @return
     */
    private FundBrand fundBrand;
}
