/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.lending.model.LoanRequestDetail;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRequestDetailService {

    LoanRequestDetail find(String requestId);

    LoanRequestDetail create(LoanRequestDetail detail);

    void edit(LoanRequestDetail detail);
}
