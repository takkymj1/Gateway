/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class DzFeeReturnReconciliation extends BaseObject {

    private static final long serialVersionUID = 20131128L;

    @Size(max = 16)
    private String MerCustId;

    @Size(max = 14)
    private String ReturnFee;

    @Size(max = 6)
    private String ReturnAcctType;

    @Size(max = 9)
    private String ReturnAcctId;

    private String ReturnDate;

    private String Stat;

    public DzFeeReturnReconciliation() {
    }

    public DzFeeReturnReconciliation(String MerCustId, 
                                     String ReturnFee, 
                                     String ReturnAcctType, 
                                     String ReturnAcctId,
                                     String ReturnDate, 
                                     String Stat) {
        this.MerCustId = MerCustId;
        this.ReturnFee = ReturnFee;
        this.ReturnAcctType = ReturnAcctType;
        this.ReturnAcctId = ReturnAcctId;
        this.ReturnDate = ReturnDate;
        this.Stat = Stat;
    }

    public void setMerCustId(String MerCustId) {
        this.MerCustId = MerCustId;
    }

    public void setReturnFee(String ReturnFee) {
        this.ReturnFee = ReturnFee;
    }

    public void setReturnAcctType(String ReturnAcctType) {
        this.ReturnAcctType = ReturnAcctType;
    }

    public void setReturnAcctId(String ReturnAcctId) {
        this.ReturnAcctId = ReturnAcctId;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public void setStat(String Stat) {
        this.Stat = Stat;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public String getReturnFee() {
        return ReturnFee;
    }

    public String getReturnAcctType() {
        return ReturnAcctType;
    }

    public String getReturnAcctId() {
        return ReturnAcctId;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public String getStat() {
        return Stat;
    }
}
