/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.enums.DisburseStatus;
import com.creditcloud.lending.model.DisburseRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.DisburseType;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface DisburseRecordService {

    @Deprecated
    public void addNew(String loanRepaymentId,
                       String employeeId,
                       DisburseStatus status,
                       DisburseType type);

    /**
     *
     * @param record
     * @return
     */
    public DisburseRecord addNew(DisburseRecord record);

    public int countByDate(Date from, Date to, List<DisburseStatus> statusList);

    public PagedResult<DisburseRecord> listByDate(Date from, Date to, PageInfo pageInfo, List<DisburseStatus> statusList);

    public int countByLoan(String loanId, List<DisburseStatus> statusList);

    public PagedResult<DisburseRecord> listByLoan(String loanId, PageInfo pageInfo, List<DisburseStatus> statusList);

    public int countByUser(String userId, List<DisburseStatus> statusList);

    public PagedResult<DisburseRecord> listByUser(String userId, PageInfo pageInfo, List<DisburseStatus> statusList);

    public List<DisburseRecord> listByLoanRepayment(String loanRepaymentId, List<DisburseStatus> statusList);
}
