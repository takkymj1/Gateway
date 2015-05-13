/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.appoint.enums.AppointRequestStatus;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 认购申请
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class AppointRequest extends BaseObject {

    private static final long serialVersionUID = 20140102L;
    

    private String id;

    /**
     * 认购对象，可以是基金，标的，众筹等产品
     */
    private RealmEntity target;

    /**
     * 投资者userId
     */
    @NotNull
    private String userId;

    @NotNull
    private AppointRequestStatus status;

    /**
     * 认购金额
     */
    @Min(0)
    private int amount;
    

    /**
     * 认购时间
     */
    private Date timeRecorded;

    public AppointRequest() {
    }

    public AppointRequest(String id,
                          String userId,
                          RealmEntity target,
                          AppointRequestStatus status,
                          int amount) {
        this.id = id;
        this.target = target;
        this.userId = userId;
        this.status = status;
        this.amount = amount;
    }
}
