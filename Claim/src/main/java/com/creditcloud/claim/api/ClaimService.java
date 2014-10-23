/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.claim.api;

import com.creditcloud.model.criteria.CriteriaInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;
import com.creditcloud.claim.model.Claim;
import java.util.List;
/**
 *
 * @author ceusan
 */
@Remote
public interface ClaimService {

    /**
     * 如果没有则添加，否则更新,TODO目前只支持从后台添加
     *
     * @param clientCode
     * @param claim
     * @return
     */
    String save(String clientCode, Claim claim);
    
    /**
     * 分页查询原始债权信息
     * @param clientCode
     * @param info
     * @return
     */
    PagedResult<Claim> list(String clientCode, CriteriaInfo info);
    
    /**
     * 根据唯一Id获取原始债权信息
     *
     * @param clientCode
     * @param claimId
     * @return
     */
    Claim getById(String clientCode, String claimId);
    
    /**
     * 列出所有原始债权信息
     *
     * @param clientCode
     * @return
     */
    List<Claim> listAll(String clientCode);

    
}
