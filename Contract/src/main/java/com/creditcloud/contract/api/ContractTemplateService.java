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
 *
 * @author suetming
 */
@Remote
public interface ContractTemplateService {

    /**
     * 列出所有模板.
     *
     * 只返回id和name，不返回content内容
     *
     * @param clientCode
     * @return
     */
    public List<ContractTemplate> listAllTemplates(String clientCode);
    
    /**
     * 添加模板.
     *
     * name重复则创建失败。
     * 
     * 如果isDefault为true，则将该client内的其他模板设置为default false，保证每个client只有一个default为true的
     *
     * @param clientCode
     * @param name 模板名称
     * @param isDefault 是否设置为默认模板
     * @param content 模板内容
     * @return 创建完成的模板，包含content内容
     */
    public ContractTemplate create(String clientCode,
                                   String name,
                                   boolean isDefault,
                                   byte[] content);

    /**
     * 根据Id获取模板内容.
     *
     * @param clientCode
     * @param id
     * @param fetchContent 是否获取content
     * @return
     */
    public ContractTemplate getById(String clientCode,
                                    String id,
                                    boolean fetchContent);
    
    /**
     * 获取默认的模板.
     * 
     * 每个Client有一个默认的模板.
     * 
     * @param clientCode
     * @return 
     */
    public ContractTemplate getDefault(String clientCode);

    /**
     * 根据模板Id删除实体
     *
     * @param clientCode
     * @param id
     */
    public void deleteById(String clientCode, String id);


    /**
     * 根据模板Id更新名称
     *
     * @param clientCode
     * @param id
     */
    public void renameById(String clientCode,
                           String id,
                           String name);
}
