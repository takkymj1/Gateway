/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is the wrapper class for the return JSON result for jqBootstrapValidation plugin.
 * 
 * @author sobranie
 */
@XmlRootElement
public class AnalysisData {

    private Date day;
    private long count;

    public AnalysisData() {
    }
    
    public AnalysisData(Date day, long count) {
        this.day = day;
        this.count = count;
    }

    
    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(long count) {
        this.count = count;
    }
    

}
