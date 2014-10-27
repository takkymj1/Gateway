/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.LoanOrder;
import com.creditcloud.model.enums.TransStat;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanOrderService {

    LoanOrder addNew(LoanOrder order);

    int countByLoan(String loanId);

    List<LoanOrder> listByLoan(String loanId);

    LoanOrder getByInvest(String investId);

    LoanOrder getByOrder(String orderId);

    boolean markStat(TransStat stat, String orderId);
}
