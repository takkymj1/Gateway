/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.ump.model.ump.enums.SettleRecordState;
import com.creditcloud.ump.model.ump.enums.UmpSettleType;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kdliu
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class UmpSettleRecord extends BaseObject {
    
    private String id;
    
    private Date settleDate;
    
    private UmpSettleType settleType;
    
    private SettleRecordState state;
    
    private Date startTime;
    
    private Date endTime;
}
