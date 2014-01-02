/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.loan.InvestRule;
import com.creditcloud.appoint.AppointConstant;
import com.creditcloud.appoint.enums.AppointmentStatus;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 认购的投资产品
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class Appointment extends BaseObject {

    private static final long serialVersionUID = 20140102L;

    private String id;
    
    /**
     * 认购产品标题或名称
     */
    @NotNull
    @Size(max = AppointConstant.MAX_APPOINT_TITLE)
    private String title;
    
    @NotNull
    private AppointmentStatus status;

    /**
     * 总认购金额限度
     */
    @Min(0)
    private int quota;

    /**
     * 剩余可认购额度
     */
    @Min(0)
    private int available;

    /**
     * 认购数额
     */
    @Min(0)
    private int count;

    /**
     * 投资额度控制
     */
    @NotNull
    private InvestRule investRule;

    @Size(max = AppointConstant.MAX_APPOINT_DESCRIPTION)
    private String description;

    /**
     * 开放募集时间
     */
    private Date timeOpened;

    /**
     * 募集期限(单位小时)
     */
    private int timeOut;

    /**
     * 结束募集时间
     */
    private Date timeFinished;

    public Appointment() {
    }

    public Appointment(String id,
                       String title, 
                       AppointmentStatus status,
                       int quota,
                       int available, 
                       int count, 
                       InvestRule investRule, 
                       String description, 
                       Date timeOpened,
                       int timeOut, 
                       Date timeFinished) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.quota = quota;
        this.available = available;
        this.count = count;
        this.investRule = investRule;
        this.description = description;
        this.timeOpened = timeOpened;
        this.timeOut = timeOut;
        this.timeFinished = timeFinished;
    }
    
}
