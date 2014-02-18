/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.contract.ContractTemplate;
import java.util.List;
import javax.ejb.Remote;

/**
 * 合同模板接口
 * @author suetming
 */
@Remote
public interface ContractTemplateService {
    /**
     * 列出所有模板
     * @param clientCode
     * @return 
     */
    public List<ContractTemplate> listAllTemplates(String clientCode);
    
    /**
     * 根据模板Id删除实体
     * @param contractTemplateId 
     */
    public void deleteById(String contractTemplateId);
    
    /**
     * 添加模板
     * @param name  模板名称
     * @param content   模板内容
     * @return 
     */
    public ContractTemplate addNew(String name, byte [] content);
    
    /**
     * 根据模板Id更新名称
     * @param id
     * @param name
     * @return 
     */
    public ContractTemplate update(String id, String name);
}
