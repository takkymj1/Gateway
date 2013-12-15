/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.contract.Contract;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.Repayment;
import java.util.List;
import javax.ejb.Remote;

/**
 * 合同生成服务
 *
 * @author sobranie
 */
@Remote
public interface ContractService {

    /**
     * 生成一份普通的平台借款合同.
     * 
     * 只是触发远程的生成过程，为异步调用
     * 
     * 借款合同命名为 loan title + investor + obligator + date，合同名称不是唯一的！
     *
     * @param client 平台
     * @param invest 投资
     * @param loan 借款对象
     * @param repayments 还款列表
     * @param feeConfig 费用配置
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig);
    
    /**
     * 读取借款协议.
     * 
     * @param clientCode
     * @param investId
     * @param withContent 是否同时取出内容
     * @return 
     */
    Contract getLoanContract(String clientCode, String investId, boolean withContent);
    
    /**
     * 直接获取Contract内容
     * 
     * @param clientCode
     * @param contractId
     * @return contract不存在返回null
     */
    byte[] getContractContent(String clientCode, String contractId);
}
