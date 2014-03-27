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
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.Repayment;
import com.creditcloud.model.misc.RealmEntity;
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
     * 读取借款协议.
     *
     * 如果为同一借款生成了多份协议，则只返回最后生成的版本
     *
     * @param clientCode
     * @param investId
     * @param withContent 是否同时取出内容
     * @return
     */
    Contract getLoanContract(String clientCode, String investId, boolean withContent);

    /**
     * 读取借款协议.
     *
     * 如果为同一借款生成了多份协议，则只返回最后生成的版本<p>
     * TODO替换上面方法
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
}
