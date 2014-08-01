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
 * 合同章 （Seal 实例）
 * @author suetming
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractSeal extends BaseObject {
    
    private static final long serialVersionUID = 20140801L;
    
    // 印章
    private Seal seal;
    
    // 页码
    private int page;
    
    private int x;
    
    private int y;
    
    /**
     * 生成私章（电子签名）
     * @param code  证书
     * @param page  私章在 pdf 页码
     * @param x     私章在 pdf 的横坐标
     * @param y     私章在 pdf 的纵坐标
     * @return 
     */
    public static ContractSeal generatePersonContractSeal(String code, int page, int x, int y) {
        Seal seal = new Seal(code, 0, null);
        return new ContractSeal(seal, page, x, y);
    }
    
    /**
     * 生成公章
     * @param code  特征码
     * @param page  私章在 pdf 页码
     * @param x     私章在 pdf 的横坐标
     * @param y     私章在 pdf 的纵坐标
     * @return 
     */
    public static ContractSeal generateContractSeal(String code, int page, int x, int y) {
        Seal seal = new Seal(code, 1, null);
        return new ContractSeal(seal, page, x, y);
    }
}
