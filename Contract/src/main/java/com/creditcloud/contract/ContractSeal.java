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
    
    private boolean locateByKeyword = false;
    
    private String keyword;
    
    public String getKeyword(){
        return keyword != null ? keyword.trim() : keyword;
    }
    
    // 页码
    private int page;
    
    private int x;
    
    private int y;
    
    private int scale;
    
    // 印章
    private Seal seal;
    
    // 关联合同模板
    private String templateId;
    
    public ContractSeal(String id, int page, int x, int y, Seal seal, String templateId){
        this.id = id;
        this.page = page;
        this.x = x;
        this.y = y;
        this.seal = seal;
        this.templateId = templateId;
    }
    
    /**
     * 生成私章（电子签名）
     * @param code  证书
     * @param page  私章在 pdf 页码
     * @param x     私章在 pdf 的横坐标
     * @param y     私章在 pdf 的纵坐标
     * @return 
     */
    public static ContractSeal generatePersonContractSeal(String code, int page, int x, int y) {
        Seal seal = new Seal(null, code, ContractSealType.PERSONAL, null, null, null, null);
        return new ContractSeal(null, false, "", page, x, y, 100, seal, null);
    }
    
    public static ContractSeal generatePersonContractSeal(String code, String keyword) {
        Seal seal = new Seal(null, code, ContractSealType.PERSONAL, null, null, null, null);
        return new ContractSeal(null, true, keyword, 0, 0, 0, 100, seal, null);
    }
    
    /**
     * 生成私章（电子签名）
     * @param user  用户
     * @param page  私章在 pdf 页码
     * @param x     私章在 pdf 的横坐标
     * @param y     私章在 pdf 的纵坐标
     * @return 
     */
    public static ContractSeal generatePersonContractSeal(User user, int page, int x, int y) {
        Seal seal = new Seal(null, null, ContractSealType.PERSONAL, null, user.getId(), user, null);
        return new ContractSeal(null, false, "", page, x, y, 100, seal, null);
    }
    
    public static ContractSeal generatePersonContractSeal(User user, String keyword) {
        Seal seal = new Seal(null, null, ContractSealType.PERSONAL, null, user.getId(), user, null);
        return new ContractSeal(null, true, keyword, 0, 0, 0, 100, seal, null);
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
        Seal seal = new Seal(null, code, ContractSealType.ENTERPRISE, null, null, null, null);
        return new ContractSeal(null, false, "", page, x, y, 100, seal, null);
    }
    
    public static ContractSeal generateContractSeal(String code, String keyword){
        Seal seal = new Seal(null, code, ContractSealType.ENTERPRISE, null, null, null, null);
        return new ContractSeal(null, true, keyword, 0, 0, 0, 100, seal, null);
    }
    
    /**
     * 通过阈值关键字生成图片
     * 
     * @param name      公章图片名字
     * @param scale     放缩系数
     * @return 
     */
    public static ContractSeal generateContractSeal(String name, int scale){
        Seal seal = new Seal(null, name, ContractSealType.ENTERPRISE, null, null, null, null);
        return new ContractSeal(null, true, name, 0, 0, 0, scale, seal, null);
    }
    
    /**
     * 通过阈值关键字生成图片
     * 
     * @param name      公章图片名字
     * @param keyword   合同表单关键字
     * @param scale     放缩系数
     * @return 
     */
    public static ContractSeal generateContractSeal(String name, String keyword, int scale){
        Seal seal = new Seal(null, name, ContractSealType.ENTERPRISE, null, null, null, null);
        return new ContractSeal(null, true, keyword, 0, 0, 0, scale, seal, null);
    }
    
    
}
