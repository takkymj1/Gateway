/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author xiongyong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UmpBank extends BaseObject{
    
    private String bankNo;
    
    private String bankName;
    
    private Integer singleQuota;
    
    private Integer dailyQuota;
    
}