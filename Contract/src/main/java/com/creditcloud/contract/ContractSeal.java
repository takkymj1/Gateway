/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 合同章 （Seal 实例）
 * @author suetming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractSeal {
    
    // 印章
    private Seal seal;
    
    // 页码
    private int page;
    
    private int x;
    
    private int y;
    
    public static ContractSeal generatePersonContractSeal(String code, int page, int x, int y) {
        Seal seal = new Seal(code, 0, null);
        return new ContractSeal(seal, page, x, y);
    }
}
