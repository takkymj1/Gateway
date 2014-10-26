/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.RepayOrder;
import com.creditcloud.model.enums.TransStat;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface RepayOrderService {

    int countByLoanRepay(String loanRepayId);

    List<RepayOrder> listByLoanRepay(String loanRepayId);

    RepayOrder getByInvestRepay(String investRepayId);

    RepayOrder getByOrder(String orderId);

    boolean markStat(TransStat stat, String orderId);
}
