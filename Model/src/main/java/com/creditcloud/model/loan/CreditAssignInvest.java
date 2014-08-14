/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 债权转让承接
 *
 * @author rooseek
 */
@XmlRootElement
public class CreditAssignInvest extends BaseObject {

    private static final long serialVersionUID = 20140811L;

    private String id;
    
    private CreditAssign creditAssign;
    
    /**
     * 承接人
     */
    private String userId;
    
    /**
     * 债权转让转出的本金
     */
    private BigDecimal creditAmount;
    
    /**
     * 债权转让承接人付给转让人的金额
     */
    private BigDecimal creditDealAmount;
    
    private Date timeRecorded;
}
