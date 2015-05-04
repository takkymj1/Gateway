/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.PreRepaymentStatus;
import com.creditcloud.model.loan.LoanPreRepaymentStatus;
import javax.ejb.Remote;

/**
 *
 * @author peili
 */
@Remote
public interface LoanPreRepayStatusService {
    
    /**
     * mark loanPreRepayment status and timeScheduled
     *
     * @param status
     * @param id
     * @return 
     */
    public boolean markStatusAndTimeScheduled(PreRepaymentStatus status, String id);

    /**
     * get LoanPreRepaymentStatus by id
     *
     * @param id
     * @return
     */
    public LoanPreRepaymentStatus find(String id);

    /**
     * hugang.liu added 20150427
     * 根据loanId和状态查询记录
     * @param id
     * @return
     */
    public LoanPreRepaymentStatus findByIdAndStatus(Object id, PreRepaymentStatus status);
    
    /**
     * mark loanPreRepayment status and timePreRepayed
     *
     * @param status
     * @param id
     * @return 
     */
    public boolean markStatusAndTimePreRepayed(PreRepaymentStatus status, String id);
}
