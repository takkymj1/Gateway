/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.lychee.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author whitesky
 */
@Data
@NoArgsConstructor
public class LycheePayReqInfo extends BaseObject{
    private static final long serialVersionUID = 20141202L;
    
    private String reqNo;
    
    private String info;
    
    private Date timeCreate;

    public LycheePayReqInfo(String reqNo, String info, Date timeCreate) {
        this.reqNo = reqNo;
        this.info = info;
        this.timeCreate = timeCreate;
    }
    
}
