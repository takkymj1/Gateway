/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.payment.model.chinapnr.enums.AuditStat;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class CorpRegisterResult extends PaymentResult {

    private static final long serialVersionUID = 20140320L;

    private String UsrCustId;

    private String UsrId;

    private AuditStat AuditStat;

    private String BusiCode;

}
