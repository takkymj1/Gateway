/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.enums.AuditStat;
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
public class CorpRegisterResult extends BaseObject {

    private static final long serialVersionUID = 20140320L;

    private String UsrCustId;

    private String UsrId;

    private AuditStat AuditStat;

    private String BusiCode;

}
