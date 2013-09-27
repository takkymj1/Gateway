/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.info.VehicleType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class Vehicle extends BaseObject {

    private static final long serialVersionUID = 20130926L;

    @NotNull
    @FormParam("id")
    private String id;

    @NotNull
    @FormParam("userId")
    private String userId;

    /**
     * 车辆基本型号信息:奥迪A8L
     */
    @NotNull
    @FormParam("model")
    private String model;

    @NotNull
    @FormParam("type")
    private VehicleType type;

    /**
     * 机动车行驶证
     */
    @NotNull
    @FormParam("vehicleLicense")
    private String vehicleLicense;

    /*
     * 车牌号
     */
    @NotNull
    @FormParam("plateNumber")
    private String plateNumber;

    /**
     * 购车年份
     */
    @NotNull
    @FormParam("yearOfPurchase")
    private int yearOfPurchase;

    /**
     * 购车价格
     */
    @NotNull
    @FormParam("priceOfPurchase")
    private int priceOfPurchase;

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

    public Vehicle() {
    }

    public Vehicle(String id,
                   String userId,
                   String model,
                   VehicleType type,
                   String vehicleLicense,
                   String plateNumber,
                   int yearOfPurchase,
                   int priceOfPurchase,
                   int estimatedValue,
                   String description,
                   Date timeCreated,
                   Date timeLastUpdated) {
        this.id = id;
        this.userId = userId;
        this.model = model;
        this.type = type;
        this.vehicleLicense = vehicleLicense;
        this.plateNumber = plateNumber;
        this.yearOfPurchase = yearOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
        this.estimatedValue = estimatedValue;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
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

    public String getModel() {
        return model;
    }

    public VehicleType getType() {
        return type;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public int getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }

    public String getDescription() {
        return description;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public void setPriceOfPurchase(int priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }

    public void setEstimatedValue(int estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public void setDescription(String description) {
        this.description = description;
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
