/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.info.EstateType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class RealEstate extends BaseObject {

    private static final long serialVersionUID = 20130926L;

    @NotNull
    @FormParam("id")
    private String id;

    @NotNull
    @FormParam("userId")
    private String userId;

    @NotNull
    @FormParam("type")
    private EstateType type;

    /**
     * 地址
     */
    @NotNull
    @FormParam("location")
    private String location;

    /**
     * 建筑面积
     */
    @NotNull
    @FormParam("area")
    private double area;

    /**
     * 是否有房贷
     */
    @NotNull
    @FormParam("loan")
    private boolean loan;

    /**
     * 现估值
     */
    @NotNull
    @FormParam("estimatedValue")
    private int estimatedValue;

    @FormParam("description")
    private String description;
    
    private Date timeCreated;
    
    private Date timeLastUpdated;

    public RealEstate() {
    }

    public RealEstate(String id,
                      String userId,
                      EstateType type,
                      String location,
                      double area,
                      boolean loan,
                      int estimatedValue,
                      String description,
                      Date timeCreated,
                      Date timeLastUpdated) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.location = location;
        this.area = area;
        this.loan = loan;
        this.estimatedValue = estimatedValue;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
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

    public String getDescription() {
        return description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }
}
