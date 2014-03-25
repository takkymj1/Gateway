/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 汇付生利宝账户信息.
 * 
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FssAccount extends BaseObject {
    
    /**
     * 总金额
     */
    String TotalAsset;
    
    /**
     * 历史累计收益
     */
    String TotalProfit;
}
