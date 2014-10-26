/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.enums.loan.DisburseType;
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
public class DisburseInfo extends AbstractRepayInfo {

    private static final long serialVersionUID = 20140804L;

    private DisburseType type;

    public DisburseInfo(LoanRepayment loanRepayment, DisburseType type) {
        setLoanRepayment(loanRepayment);
        this.type = type;
    }
}
