/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 汇付标的
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class PnrTender extends BaseObject {

    private static final long serialVersionUID = 20150108L;

    private String entityId;

    private String tenderId;

    private Date timeCreated;

    public PnrTender(String entityId, String tenderId, Date timeCreated) {
        this.entityId = entityId;
        this.tenderId = tenderId;
        this.timeCreated = timeCreated;
    }
}
