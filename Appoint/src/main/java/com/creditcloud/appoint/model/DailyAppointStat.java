/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * 按照天统计认购申請
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyAppointStat extends BaseObject {

    private static final long serialVersionUID = 20140121l;

    private LocalDate date;

    private int count;

    private long sum;

}
