/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.RepayType;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import java.math.BigDecimal;

/**
 *
 * @author rooseek
 */
public interface LoanRepayStatService {
    
    /**
     * 根据还款资金类型和指定的状态，计算回款的金额总和
     * @param type
     * @param status
     * @return 
     */
    BigDecimal sumByStatus(RepayType type, RepaymentStatus... status);
}
