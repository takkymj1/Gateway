/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.LoanRequestAssignType;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.loan.LoanRequest;
import com.creditcloud.model.loan.SubmitRequestResult;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRequestService extends LoanRequestQueryService, LoanRequestStatService {

    public LoanRequest find(String id);

    public SubmitRequestResult addNew(LoanRequest loanRequest);

    public void update(LoanRequest loanRequest);

    public boolean markStatus(LoanRequestStatus status, String id);
    
    public LoanRequest getBySerial(String serial);
    
    public boolean updateAssignType(LoanRequestAssignType assignType, String id);
}
