/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.ump.enums.UmpBusiType;
import com.creditcloud.ump.model.ump.enums.UmpSeqCashFlow;
import com.creditcloud.ump.model.ump.enums.UmpSeqTransStatus;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class UmpSeqTransaction extends BaseObject {
    
    private String accCheckDate;
    
    private BigDecimal amount;
    
    private BigDecimal comAmt;
    
    private UmpSeqCashFlow dcMark;
    
    private UmpBusiType transType;
    
    private UmpSeqTransStatus transState;
}
