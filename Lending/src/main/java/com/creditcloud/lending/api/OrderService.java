/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.LoanOrder;
import com.creditcloud.lending.model.RepayOrder;
import com.creditcloud.model.enums.TransStat;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface OrderService {

    boolean markLoanOrderStat(TransStat stat, String orderId);

    boolean markRepayOrderStat(TransStat stat, String orderId);

    Map<String, LoanOrder> listOrderByLoan(String loanId, List<String> investIdList);

    Map<String, RepayOrder> listOrderByRepay(String loanRepayId, List<String> investRepayIdList);
}
