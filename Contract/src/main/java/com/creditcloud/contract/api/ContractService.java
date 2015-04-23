/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.claim.model.Claim;
import com.creditcloud.config.FeeConfig;
import com.creditcloud.contract.Contract;
import com.creditcloud.contract.ContractSeal;
import com.creditcloud.contract.ContractType;
import com.creditcloud.contract.Guarantor;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.Repayment;
import com.creditcloud.model.misc.RealmEntity;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 * 合同生成服务
 *
 * @author sobranie
 */
@Remote
public interface ContractService {
    /**
     * 生成一份普通的平台借款合同（电子签名和电子签章） for FMAX.
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
     * @param values
     * @param seals      合同签章
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Map<String, Object> values,
                              List<ContractSeal> seals);
    
    /**
     * 生成一份普通的平台借款合同（电子签名和电子签章） for FMAX.
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
     * @param values
     * @param seals      合同签章
     * @param claim
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Map<String, Object> values,
                              List<ContractSeal> seals,
                              Claim claim);
    
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
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId);
    
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
     * @param guarantorList  担保方名单
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              List<Guarantor> guarantorList,
                              String templateId);
    
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
     * @param claim
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Claim claim);
    
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
     * @param values
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Map<String, Object> values);
    
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
     * @param values
     * @param claim
     */
    void generateLoanContract(Client client,
                              Invest invest,
                              Loan loan,
                              List<Repayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Map<String, Object> values,
                              Claim claim);

    /**
     * 生成一份普通的平台借款合同(里面会有一份多投资人列表).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param currentInvest     当前投资人投标
     * @param investList 所有投资人投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    void generateLoanContract(Client client,
                              Invest currentInvest,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId);
    
    /**
     * 生成一份普通的平台借款合同(里面会有一份多投资人列表).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param currentInvest     当前投资人投标
     * @param investList 所有投资人投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     * @param seals
     */
    void generateLoanContract(Client client,
                              Invest currentInvest,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              List<ContractSeal> seals);
    
    /**
     * 生成一份普通的平台借款合同(里面会有一份多投资人列表).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param currentInvest     当前投资人投标
     * @param investList 所有投资人投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     * @param claim
     */
    void generateLoanContract(Client client,
                              Invest currentInvest,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Claim claim);
    
    /**
     * 生成一份普通的平台借款合同(生成一份多个投资人对借款人).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param investList 投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     */
    void generateLoanContract(Client client,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId);
    
    /**
     * 生成一份普通的平台借款合同(生成一份多个投资人对借款人).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param investList 投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     * @param seals      合同章
     */
    void generateLoanContract(Client client,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              List<ContractSeal> seals);
    
    /**
     * 生成一份普通的平台借款合同(生成一份多个投资人对借款人).
     *
     * 只是触发远程的生成过程，为异步调用
     *
     * 重复调用将生成新的合同，原有合同不删除
     *
     * 借款合同命名为 loan title + obligator + date，合同名称不是唯一的！
     *
     * @param client     平台
     * @param investList 投资列表
     * @param loan       借款对象
     * @param repayments 借款人还款列表
     * @param feeConfig  费用配置
     * @param templateId 合同模板id，为空则使用默认模板或LoanRequest指定的关联模板
     * @param claim
     */
    void generateLoanContract(Client client,
                              List<Invest> investList,
                              Loan loan,
                              List<LoanRepayment> repayments,
                              FeeConfig feeConfig,
                              String templateId,
                              Claim claim);

    /**
     * 读取借款协议.
     *
     * 如果为同一借款生成了多份协议，则只返回最后生成的版本<p>
     *
     * @param clientCode
     * @param entity      贷款对应的实体
     * @param withContent 是否同时取出内容
     * @return
     */
    Contract getLoanContract(String clientCode, RealmEntity entity, boolean withContent);

    /**
     * 直接获取Contract内容
     *
     * @param clientCode
     * @param contractId
     * @return contract不存在返回null
     */
    byte[] getContractContent(String clientCode, String contractId);
    
    
    /**
     * 生成居间合同 （不含签章）
     * @author zaishu.ye@fengjr.com
     * @param client
     * @param loan
     * @param loanRepayments
     * @param feeConfig
     * @param templateId:居间合同模板id，若为null，则根据
     * @param seals
     */
    public void generateBrokerageContract(Client client,
                                        Loan loan,
                                        List<LoanRepayment> loanRepayments,
                                        FeeConfig feeConfig,
                                        String templateId,
                                        List<ContractSeal> seals);
    
    public Contract getBrokerageContract(String clientCode, 
            RealmEntity contractEntity, boolean withContent);
    
    public Contract getLoanClientContract(String clientCode, 
            RealmEntity contractEntity, boolean withContent);
    
    public Contract getAdvanceRepayContract(String clientCode, 
            RealmEntity contractEntity, boolean withContent);
    
    public Contract getContractByEntityAndType(String clientCode, 
            RealmEntity contractEntity, boolean withContent, ContractType contractType);
    
    
    /**
     * 动态生成基于借款标的的合同编号（借款人与多投资人）
     *
     * @param loan
     * @return
     */
    public String getContractCodeByLoan(Loan loan);
    
    /**
     * 针对众筹投资生成众筹合同（如果项目设定要生成合同的话）
     * @param investId
     * @return 
     */
    public void generateCrowdFundingContract(String investId);
    
    /**
     * 针对众筹项目ID生成所有众筹投资合同（如果项目设定要生成合同的话）
     * @param projectId
     * @param templateId
     */
    public void generateCrowdFundingContracts(String projectId, String templateId);
    
    /**
     * @author zaishu.ye@fengjr.com
     * 生成债权转让合同
     * 若标的有担保，使用默认模板
     * 若标的没担保，使用非默认代码。
     * 
     * 因此，债权转让合同模板对多仅能允许有2份
     * @param assignInvest 
     */
    public void generateCreditAssignContract(Invest assignInvest);
    
    /**
     * 批量确认合同信息，将确认的合同的confirm属性设置为true
     * @param contractIdList 
     */
    public void confirmContract(List<String> contractIdList);
    
    public List<Contract> traceContractsOfCreditAssignInvest(String assignInvestId);
    
    /**
     * 分页获取合同列表
     * @param pageinfo
     * @return 
     */
    public List<Contract> contractlist(PageInfo pageinfo);
}
