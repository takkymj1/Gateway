/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公章 for FMAX
 * @author suetming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seal {
    
    // 印章特性码
    private String code;
    
    // 印章类型
    private int type;
    
    // 印章内容
    private byte[] seal;
    
}
