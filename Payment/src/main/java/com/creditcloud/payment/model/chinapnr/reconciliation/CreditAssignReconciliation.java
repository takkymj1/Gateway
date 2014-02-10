/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.TransStat;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class CreditAssignReconciliation extends BaseObject {

    private static final long serialVersionUID = 20140117L;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 8)
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String SellCustId;

    @NotNull
    @Size(max = 14)
    private BigDecimal CreditAmt;

    @NotNull
    @Size(max = 14)
    private BigDecimal CreditDealAmt;

    @NotNull
    @Size(max = 14)
    private BigDecimal Fee;

    @NotNull
    @Size(max = 16)
    private String BuyCustId;

    @NotNull
    @Size(min = 1, max = 1)
    private TransStat TransStat;

    @NotNull
    private String PnrDate;

    @NotNull
    private String PnrSeqId;

    public CreditAssignReconciliation(String OrdId, 
                                      String OrdDate,
                                      String SellCustId, 
                                      BigDecimal CreditAmt, 
                                      BigDecimal CreditDealAmt, 
                                      BigDecimal Fee, 
                                      String BuyCustId, 
                                      TransStat TransStat, 
                                      String PnrDate, 
                                      String PnrSeqId) {
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.SellCustId = SellCustId;
        this.CreditAmt = CreditAmt;
        this.CreditDealAmt = CreditDealAmt;
        this.Fee = Fee;
        this.BuyCustId = BuyCustId;
        this.TransStat = TransStat;
        this.PnrDate = PnrDate;
        this.PnrSeqId = PnrSeqId;
    }
}
