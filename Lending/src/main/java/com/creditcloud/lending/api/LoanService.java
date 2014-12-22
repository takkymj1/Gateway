/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanService extends LoanQueryService, LoanStatService {

    public Loan find(String id);

    public Loan addNew(Loan loan);
    
    public boolean markScheduled(String loanId, Date timeOpen, int timeOut);

    /**
     * mark loan as cleared
     *
     * @param id
     * @return
     */
    public boolean markCleared(String id);

    /**
     * update loan status
     *
     * @param status
     * @param id
     * @return
     */
    public boolean markStatus(LoanStatus status, String id);

    /**
     * 主要供CreditMarket中更新状态用,只有OPENED/FAILED/FINISHED三种状态可以从CreditMarket更新
     *
     * @param loanId
     * @param status
     * @param bidNumber
     * @param bidAmount
     * @return
     */
    public boolean markStatus(String loanId, LoanStatus status, int bidNumber, int bidAmount);

    /**
     * update loan rewarded
     *
     * @param rewarded
     * @param id
     * @return
     */
    public boolean markRewarded(boolean rewarded, String id);

    /**
     * mark settle time for loan
     *
     * @param loanId
     * @param timeSettled
     * @return
     */
    public boolean markSettleTime(String loanId, Date timeSettled);
    
    public boolean changeTitle(String loanId, String title);
    
    public boolean changeTimeOut(String loanId, int timeOut);
    
    /**
     * has not cleared loan
     */
    public boolean hasNotClearedLoan(String userId);
    
    /**
     * list loan by user id
     *
     * @param clientCode
     * @param userId
     * @param pageInfo
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    PagedResult<Loan> listByUser(String userId, PageInfo pageInfo);

}
