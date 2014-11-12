/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.contract.api;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.Repayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * 合同生成服务扩展
 * 
 * @author hfp
 */
@Remote
public interface ContractExtendService {

    /**
     * 
     * @param client 平台
     * @param invest 投资
     * @param investList 所有投资人投资列表
     * @param loan 借款对象
     * @param loanRepayments 借款人还款列表
     * @param feeConfig 费用配置
     * @param templateIdO2O 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    public void generateLoanContract(Client client, 
                                    Invest invest, 
                                    List<Invest> investList, 
                                    Loan loan, 
                                    List<LoanRepayment> loanRepayments, 
                                    FeeConfig feeConfig, 
                                    String templateIdO2O);

    /**
     * 
     * @param client 平台
     * @param investList 所有投资人投资列表
     * @param loan 借款对象
     * @param loanRepayments 借款人还款列表
     * @param feeConfig 费用配置
     * @param templateIdO2M 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    public void generateLoanContract(Client client, 
                                    List<Invest> investList, 
                                    Loan loan, 
                                    List<LoanRepayment> loanRepayments, 
                                    FeeConfig feeConfig, 
                                    String templateIdO2M);
    
    /**
     * 生成一份普通的平台借款合同.
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + investor + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param invest     投资
     * @param loan       借款对象
     * @param repayments 还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    void generateMainLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId);
    
}
