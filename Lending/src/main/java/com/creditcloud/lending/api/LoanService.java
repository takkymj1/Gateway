/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.LoanStatus;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanService extends LoanQueryService{

    /**
     * mark loan as cleared
     *
     * @param ids
     * @return
     */
    public boolean markCleared(String... ids);

    /**
     * update loan status
     *
     * @param status
     * @param ids
     * @return
     */
    public boolean markStatus(LoanStatus status, String... ids);

    /**
     * update loan rewarded
     *
     * @param rewarded
     * @param ids
     * @return
     */
    public boolean markRewarded(boolean rewarded, String... ids);

}
