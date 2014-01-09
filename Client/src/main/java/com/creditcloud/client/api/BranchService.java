/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client.api;

import com.creditcloud.model.client.Branch;
import java.util.List;
import javax.ejb.Remote;

/**
 * 组织机构管理接口
 *
 * @author sobranie
 */
@Remote
public interface BranchService {

    /**
     * 添加或更新Branch
     *
     * @param clientCode
     * @param branch
     * @return
     */
    Branch saveBranch(String clientCode, Branch branch);

    /**
     * 根据id获取branch
     *
     * @param clientCode
     * @param branchId
     * @return
     */
    Branch getById(String clientCode, String id);

    /**
     * 根据code获取branch
     *
     * @param clientCode
     * @param code
     * @return
     */
    Branch getByCode(String clientCode, String code);

    /**
     * 根据name获取branch
     *
     * @param clientCode
     * @param name
     * @return
     */
    Branch getByName(String clientCode, String name);

    /**
     * 列出客户所有branch
     *
     * @param clientCode
     * @return
     */
    List<Branch> listByClient(String clientCode);

    /**
     * 根据负责人列出所有Branch
     *
     * @param clientCode
     * @param principalEmployeeId
     * @return
     */
    List<Branch> listByPrincipal(String clientCode, String principalEmployeeId);

    /**
     * 根据联系人列出所有Branch
     *
     * @param clientCode
     * @param contactEmployeeId
     * @return
     */
    List<Branch> listByContact(String clientCode, String contactEmployeeId);
}
