package com.creditcloud.fengMessage.model;

import com.creditcloud.fengMessage.model.base.BaseRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class TenderNoticeAssign01Request extends BaseRequest{
    
    private String userName;
    private String assignTitle;
    private String creditAmount;
    private String bidDealAmount;
    private String serviceFee;
    public TenderNoticeAssign01Request(String userName,String assignTitle,
            String creditAmount,String bidDealAmount,String serviceFee){
        this.setTemplate_id("NOTI_ASSIGN_000001");
        this.userName = userName;
        this.assignTitle = assignTitle;
        this.creditAmount = creditAmount;
        this.bidDealAmount = bidDealAmount;
        this.serviceFee = serviceFee;
    }
}
