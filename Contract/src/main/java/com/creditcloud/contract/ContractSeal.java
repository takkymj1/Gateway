/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.misc.ContractSealType;
import com.creditcloud.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 合同章 （Seal 实例）
 * @author suetming
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class ContractSeal extends BaseObject {
    
    private static final long serialVersionUID = 20140801L;
    
    private String id;
    
    private String keyword;//盖章位置定位关键词#xxx#
    
    public String getKeyword(){
        return keyword != null ? keyword.trim() : keyword;
    }
    
    // 印章
    private Seal seal;
    
    // 关联合同模板
    private String templateId;
    
    public ContractSeal(String id, Seal seal, String keyword, String templateId){
        this.id = id;
        this.seal = seal;
        this.keyword = keyword;
        this.templateId = templateId;
    }
    
    /**
     * 生成私章（电子签名）
     * @param code
     * @param keyword
     * @return 
     */
    public static ContractSeal generatePersonContractSeal(String code, String keyword) {
        Seal seal = new Seal(null, code, ContractSealType.PERSONAL, null, null, null, null);
        return new ContractSeal(null, seal, keyword, null);
    }
    
    /**
     * 生成私章（电子签名）
     * @param user
     * @param keyword
     * @return 
     */
    public static ContractSeal generatePersonContractSeal(User user, String keyword) {
        Seal seal = new Seal(null, null, ContractSealType.PERSONAL, null, user.getId(), user, null);
        return new ContractSeal(null, seal, keyword, null);
    }
    
    /**
     * 生成公章
     * @param code
     * @param keyword
     * @return 
     */
    public static ContractSeal generateContractSeal(String code, String keyword){
        Seal seal = new Seal(null, code, ContractSealType.ENTERPRISE, null, null, null, null);
        return new ContractSeal(null, seal, keyword, null);
    }
}
