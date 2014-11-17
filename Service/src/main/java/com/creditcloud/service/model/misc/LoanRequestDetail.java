/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;
import java.math.BigDecimal;

/**
 *
 * @author keven
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class LoanRequestDetail  extends BaseObject {
    
    private static final long serialVersionUID = 20141103L;
    
    private String requestId;

    
    private RealmEntity requestCreator;
    
     /**
     * 最小资金比例
     */
    private int minCapitalRatio;

    /**
     * 区域位置
     */
    private String location;
    
    /**
     * 风险等级
     */
    private String riskGrade;

    /**
     * 共同借款人
     */

    private String coborrower;
    
    private int highestCreditAmount;
    
    private LocalDate timeEstablished;
    
    private BigDecimal registeredCapital;
    
    private String businessScope;
}
