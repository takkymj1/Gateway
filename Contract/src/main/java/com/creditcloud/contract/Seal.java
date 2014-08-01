/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
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
public class Seal extends BaseObject {
    
    private static final long serialVersionUID = 20140801L;
    
    // 公章特性码 or 私章证书ID
    private String code;
    
    // 印章类型 （1：公章 0：私章）
    private int type;
    
    // 印章内容
    private byte[] seal;
    
}
