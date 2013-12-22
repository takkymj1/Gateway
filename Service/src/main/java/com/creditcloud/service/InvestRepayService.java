/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.loan.InvestRepayment;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.RepayDetail;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestRepayService {

    /**
     * list InvestRepayment by invest id
     *
     * @param clientCode
     * @param investId
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<InvestRepayment> listRepayByInvest(String clientCode, String investId);
    
    /**
     * 根据贷款第几期所有投资应还款计算总费用，以避免直接从LoanRepayment计算的误差
     *
     * @param clientCode
     * @param repayId
     * @return
     */
    RepayDetail getRepayDetail(String clientCode, LoanRepayment loanRepay);
}
