/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.info.VehicleType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * record the changes of Vehicle 
 *
 * @author rooseek
 */
@XmlRootElement
public class VehicleRecord extends BaseObject {

    private static final long serialVersionUID = 20130927L;

    /**
     * 车辆基本型号信息:奥迪A8L
     */
    @NotNull
    private String model;

    @NotNull
    private VehicleType type;

    /**
     * 机动车行驶证
     */
    @NotNull
    private String vehicleLicense;

    /*
     * 车牌号
     */
    @NotNull
    private String plateNumber;

    /**
     * 购车年份
     */
    @NotNull
    private int yearOfPurchase;

    /**
     * 购车价格
     */
    @NotNull
    private int priceOfPurchase;

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

    public VehicleRecord() {
    }

    public VehicleRecord(String model,
                         VehicleType type,
                         String vehicleLicense,
                         String plateNumber,
                         int yearOfPurchase,
                         int priceOfPurchase,
                         int estimatedValue,
                         String description,
                         String modifiedBy,
                         Source source,
                         Date timeRecorded) {
        this.model = model;
        this.type = type;
        this.vehicleLicense = vehicleLicense;
        this.plateNumber = plateNumber;
        this.yearOfPurchase = yearOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
        this.estimatedValue = estimatedValue;
        this.description = description;
        this.modifiedBy = modifiedBy;
        this.source = source;
        this.timeRecorded = timeRecorded;
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

    public String getModifiedBy() {
        return modifiedBy;
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

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }
}
