/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.info.EstateType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class RealEstate extends BaseObject {

    private static final long serialVersionUID = 20130926L;

    @NotNull
    private String id;

    @NotNull
    private String userId;

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
    private String area;

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

    public RealEstate() {
    }

    public RealEstate(String id,
                      String userId,
                      EstateType type,
                      String location,
                      String area,
                      boolean loan,
                      int estimatedValue,
                      String description) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.location = location;
        this.area = area;
        this.loan = loan;
        this.estimatedValue = estimatedValue;
        this.description = description;
    }

    public EstateType getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getArea() {
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

    public void setArea(String area) {
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
}
