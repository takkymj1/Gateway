/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.info.EstateType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * record the changes of RealEstate
 *
 * @author rooseek
 */
@XmlRootElement
public class RealEstateRecord extends BaseObject {

    private static final long serialVersionUID = 20130927L;

    @NotNull
    private EstateType type;

    /**
     * 地址
     */
    @NotNull
    private String location;

    /**
     * 建筑面积
     */
    @NotNull
    private double area;

    /**
     * 是否有房贷
     */
    @NotNull
    private boolean loan;

    /**
     * 现估值
     */
    @NotNull
    private int estimatedValue;

    private String description;

    /**
     * 修改人，可能是用户自己上传后修改也可能是员工实地勘察后修改
     */
    private String modifiedBy;

    @NotNull
    private Source source;

    private Date timeRecorded;

    public RealEstateRecord() {
    }

    public RealEstateRecord(EstateType type,
                            String location,
                            double area,
                            boolean loan,
                            int estimatedValue,
                            String description,
                            String modifiedBy,
                            Source source,
                            Date timeRecorded) {
        this.type = type;
        this.location = location;
        this.area = area;
        this.loan = loan;
        this.estimatedValue = estimatedValue;
        this.description = description;
        this.modifiedBy = modifiedBy;
        this.source = source;
        this.timeRecorded = timeRecorded;
    }

    public EstateType getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getArea() {
        return area;
    }

    public boolean isLoan() {
        return loan;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public String getDescription() {
        return description;
    }

    public Source getSource() {
        return source;
    }

    public void setType(EstateType type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }
}
