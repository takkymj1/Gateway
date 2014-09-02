/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.config.FeeConfig;
import com.creditcloud.model.BaseObject;
import com.creditcloud.model.loan.LoanRepayment;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
class AbstractRepay extends BaseObject {

    private LoanRepayment loanRepayment;

    private FeeConfig feeConfig;

    private boolean calculateFee = true;

    private boolean calculatePrincipal = false;

    private boolean calculateInterest = false;

    private boolean calculateOutstanding = false;

}
