/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class RequestAvg extends BaseObject {

    private static final long serialVersionUID = 20131029L;

    /**
     * 金额
     */
    private int amount;

    /**
     * 利率
     */
    private int rate;

    /**
     * 期限
     */
    private double days;
    public RequestAvg(int amount, int rate, double days) {
        this.amount = amount;
        this.rate = rate;
        this.days = days;
    }
}
