/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract.api;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.contract.Contract;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.user.User;
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
     * 生成一份普通的平台借款合同
     *
     * @param client 平台
     * @param lender 投资人/出借人
     * @param obligator 借款人
     * @param loan 借款对象
     * @param repayments 还款列表
     * @param feeConfig 费用配置
     * @return
     */
    Contract generateLoanContract(Client client,
                                  User lender,
                                  User obligator,
                                  Loan loan,
                                  List<LoanRepayment> repayments,
                                  FeeConfig feeConfig);

}
