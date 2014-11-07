/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.model.misc;

import com.creditcloud.model.misc.RealmEntity;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author keven
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class LoanRequestDetail {
    
    private static final long serialVersionUID = 20141103L;
    /**
     * ID: 同LoanRequestId
     */
    private String requestId;
    /**
     * 项目录入人
     */
    private RealmEntity requestCreator;
    /**
     * 区域位置
     */
    private String location;
    /**
     * 共同借款人
     */
    private RealmEntity coborrower;
}
