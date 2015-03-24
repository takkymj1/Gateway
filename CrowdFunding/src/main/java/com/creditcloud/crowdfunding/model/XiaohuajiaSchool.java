/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 中网小画家需要的学校信息
 * @author zaishu.ye@fengjr.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class XiaohuajiaSchool extends BaseObject {
    private String id;
    
    private String district;
    
    private String pinyin;
    
    private String school;
}
