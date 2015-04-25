/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
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
public class ProductSchedule extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    /**
     * appoint stage 预约期
     */
    private Date appointStartTime;

    private Date appointEndTime;

    /**
     * purchase stage 募集期
     */
    private Date purchaseStartTime;

    private Date purchaseEndTime;

    /**
     * wealth management stage 锁定期
     */
    private Date manageStartTime;

    private Date manageEndTime;

    public ProductSchedule(Date appointStartTime,
                           Date appointEndTime,
                           Date purchaseStartTime,
                           Date purchaseEndTime,
                           Date manageStartTime,
                           Date manageEndTime) {
        this.appointStartTime = appointStartTime;
        this.appointEndTime = appointEndTime;
        this.purchaseStartTime = purchaseStartTime;
        this.purchaseEndTime = purchaseEndTime;
        this.manageStartTime = manageStartTime;
        this.manageEndTime = manageEndTime;
    }

}
