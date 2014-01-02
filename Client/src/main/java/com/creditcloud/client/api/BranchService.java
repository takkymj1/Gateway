/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.client.api;

import com.creditcloud.model.client.Branch;
import javax.ejb.Remote;

/**
 * 组织机构管理接口
 *
 * @author sobranie
 */
@Remote
public interface BranchService {

    /**
     * 添加新的Branch
     *
     * @param clientCode
     * @param branch
     * @return
     */
    Branch addNew(String clientCode, Branch branch);

    /**
     * 更新现有branch
     *
     * @param clientCode
     * @param branch
     * @return
     */
    Branch update(String clientCode, Branch branch);
}
