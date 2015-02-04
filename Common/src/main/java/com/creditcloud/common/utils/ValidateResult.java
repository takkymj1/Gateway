/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateResult {
    
    /**
     * 验证结果
     */
    private boolean success;
    
    /**
     * 验证结果信息
     */
    private String message;
    
    /**
     * 验证结果码
     */
    private String code;
}
