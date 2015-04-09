/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model;

import com.creditcloud.fund.model.enums.EventStatus;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author wenqiang
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FundEvent extends BaseObject {

    private String description;

    private String name;

    private Date startTime;

    private Date endTime;

    private EventStatus status;

    public FundEvent(String description, String name, Date startTime, Date endTime, EventStatus status) {
        this.description = description;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
}
