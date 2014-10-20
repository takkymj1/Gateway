/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import javax.ejb.Remote;

/**
 * 控制Market前台一些行为的接口
 *
 * @author sobranie
 */
@Remote
public interface MarketControlService {

    /**
     * 取消一个前台投标.
     *
     * 将相应的loan从前台的缓存中撤出
     *
     * <b>在多节点的部署方案中可能会有问题!
     *
     * @param clientCode
     * @param loanId
     * @return loan在缓存中且被成功撤出
     */
    public boolean cancelLoan(String clientCode, String loanId);

    /**
     * cancel FundingInvest
     *
     * @param clientCode
     * @param investId
     * @return
     */
    public boolean cancelFundingInvest(String clientCode, String investId);

    /**
     * cancel FundingProject
     *
     * @param clientCode
     * @param projectId
     * @return
     */
    public boolean cancelFundingProject(String clientCode, String projectId);

}
