/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.model.BaseObject;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 债权转让明细
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class BidDetail extends BaseObject {

    private static final long serialVersionUID = 20140120L;

    @NotNull
    @Size(max = 20)
    private String BidOrdId;

    @NotNull
    @Size(min = 8, max = 8)
    private String BidOrdDate;

    @NotNull
    @Size(max = 14)
    private String BidCreditAmt;

    private List<BidBorrowerDetail> BorrowerDetails;

    public BidDetail(String BidOrdId, String BidOrdDate, String BidCreditAmt, List<BidBorrowerDetail> BorrowerDetails) {
        this.BidOrdId = BidOrdId;
        this.BidOrdDate = BidOrdDate;
        this.BidCreditAmt = BidCreditAmt;
        this.BorrowerDetails = BorrowerDetails;
    }
}
