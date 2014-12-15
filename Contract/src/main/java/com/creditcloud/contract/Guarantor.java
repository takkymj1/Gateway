/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 担保方(合同生成时调用)
 * 
 * @author suetming
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Guarantor extends BaseObject {
    
    private static final long serialVersionUID = 20141210L;
    
    /**
     * 是否是自然人 （基于出生而为民事权利和义务主体的人）
     */
    boolean isNaturalPerson = true;
    
    /**
     * 名称 (如果是企业则为企业全称，如果是自然人则为真实姓名)
     */
    String name;
    
    /**
     * 特征码 (如果是企业为组织结构代码，如果是自然人则为身份证号)
     */
    String code;
}
