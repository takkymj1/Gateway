/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对投资者的认购统计,可以是对某一个Appointmnet的统计，
 * 也可以是对某个Agent下所有Appointment，或者所有Appointment的统计
 *
 * @author rooseek
 */
@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class UserAppointStat extends BaseObject {

    private static final long serialVersionUID = 20140106l;

    /**
     * 投资人
     */
    private String userId;

    /**
     * 认购总数
     */
    private int count;

    /**
     * 认购总额
     */
    private long sum;

    /**
     * 认购列表
     */
    private List<AppointRequest> request;
}
