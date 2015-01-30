/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement
public class DivDetail extends BaseObject {

    private static final long serialVersionUID = 20131115L;

    @NotNull
    protected String DivAcctId;

    @NotNull
    protected String DivAmt;

    public DivDetail(String DivAcctId, String DivAmt) {
        this.DivAcctId = DivAcctId;
        this.DivAmt = DivAmt;
    }
}

