/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CreditRank;
import com.creditcloud.model.user.credit.Assessment;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 * 
 * @see UserCredit
 */
@XmlRootElement
public class UserCreditRecord extends BaseObject {

    private static final long serialVersionUID = 20130927L;

    @NotNull
    private CreditRank creditRank;

    @NotNull
    private Assessment assessment;

    @NotNull
    private int creditLimit;

    @NotNull
    private int creditAvailable;

    /**
     * 修改人，只能是员工
     */
    @NotNull
    private String modifiedBy;

    public UserCreditRecord() {
    }

    public UserCreditRecord(CreditRank creditRank,
                            Assessment assessment,
                            int creditLimit,
                            int creditAvailable,
                            String modifiedBy) {
        this.creditRank = creditRank;
        this.assessment = assessment;
        this.creditLimit = creditLimit;
        this.creditAvailable = creditAvailable;
        this.modifiedBy = modifiedBy;
    }

    public CreditRank getCreditRank() {
        return creditRank;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditAvailable() {
        return creditAvailable;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }


    public void setCreditRank(CreditRank creditRank) {
        this.creditRank = creditRank;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditAvailable(int creditAvailable) {
        this.creditAvailable = creditAvailable;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public Assessment getAssessment() {
        return assessment;
    }
}
