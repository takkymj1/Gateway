/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model;

import com.creditcloud.model.enums.loan.DisburseType;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.misc.RealmEntity;
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
     * 操作人id
     */
    private String callerId;
   
    /**
     * 垫付来源，平台或者担保户等
     */
    private RealmEntity disburseSource;
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
    
    public DisburseInfo(LoanRepayment loanRepayment, DisburseType type, boolean fromGuarantee, String callerId, RealmEntity disburseSource) {
        this(loanRepayment, type);
        this.fromGuarantee = fromGuarantee;
        this.callerId = callerId;
        this.disburseSource = disburseSource;
    }
}
