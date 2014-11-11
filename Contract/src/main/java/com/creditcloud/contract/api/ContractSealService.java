/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.contract.ContractSeal;
import com.creditcloud.contract.Seal;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.misc.ContractSealType;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author suetming
 */
@Remote
public interface ContractSealService {
    
    /**
     * 创建合同章
     * @param clientCode
     * @param page          合同模板页码
     * @param x             合同章横坐标
     * @param y             合同章纵坐标
     * @param sealId        合同特征章ID
     * @param templateId    合同模板
     * @return 
     */
    public ContractSeal createContractSeal(String clientCode, int page, int x, int y, String sealId, String templateId);
    
    /**
     * 创建特征章 (公章&私章)
     * 
     * @param clientCode
     * @param code
     * @param type
     * @param content
     * @param entityId
     * @return 
     */
    public Seal createSeal(String clientCode, String code, ContractSealType type, String content, String entityId);
    
    /**
     * 获取关联模板的合同章
     * 
     * @param clientCode
     * @param contractSealId
     * @param withSeal          关联特征章
     * @return 
     */
    public ContractSeal getById(String clientCode, String contractSealId, boolean withSeal);
    
    /**
     * 列出所有合同章
     * 
     * @param pageInfo
     * @param withSeal
     * @return 
     */
    public PagedResult<ContractSeal> list(PageInfo pageInfo, boolean withSeal);
    
    /**
     * 列出所有特征章
     * 
     * @param pageInfo
     * @return 
     */
    public PagedResult<Seal> listSeal(PageInfo pageInfo);
}
