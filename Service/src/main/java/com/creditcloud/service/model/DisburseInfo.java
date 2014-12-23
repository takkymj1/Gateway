/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.model.enums.loan.DisburseType;
import com.creditcloud.model.loan.LoanRepayment;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
@ToString(callSuper = true)
public class DisburseInfo extends AbstractRepay {

    private static final long serialVersionUID = 20140804L;

    private DisburseType type;

    /**
     * 担保方垫付, false则为平台垫付
     */
    private boolean fromGuarantee = true;

    public DisburseInfo(LoanRepayment loanRepayment, DisburseType type) {
        setLoanRepayment(loanRepayment);
        this.type = type;
    }

    public DisburseInfo(LoanRepayment loanRepayment, DisburseType type, boolean fromGuarantee) {
        this(loanRepayment, type);
        this.fromGuarantee = fromGuarantee;
    }
}
