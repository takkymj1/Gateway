/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;

/**
 *
 * @author rooseek
 */
public interface Investable {

    /**
     * 
     * @return 
     */
    String getId();

    /**
     * 
     * @return 
     */
    int getRate();

    /**
     * 
     * @return 
     */
    Duration getDuration();

    /**
     * 
     * @return 
     */
    RepaymentMethod getMethod();
    
    /**
     * 
     * @return 
     */
    LoanStatus getStatus();
}
