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
 * 汇付生利宝产品信息.
 * 
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FssProductInfo extends BaseObject {
    
    /**
     * 7日年化收益率
     */
    String AnnuRate;
    
    /**
     * 每万份收益
     */
    String PrdRate;
}
