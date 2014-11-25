/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.loan.Invest;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface InvestService extends InvestQueryService, InvestStatService {

    public Invest addNew(Invest invest);

    public Invest getById(String investId);

    public boolean markStatus(InvestStatus status, List<String> ids);

    @Deprecated
    public boolean markStatusByLoan(InvestStatus status, String loanId);

    public boolean markStatusByLoan(InvestStatus status, List<InvestStatus> currentStatus, String loanId);

    public boolean invest(String investId, int amount);
    
    public void notifyLoanStatus(String loanId, LoanStatus status, List<LoanStatus> currentStatus);
}
