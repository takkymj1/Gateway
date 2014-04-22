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
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author rooseek
 */
@Data
@AllArgsConstructor
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

    /**
     * 车辆品牌（奥迪）
     */
    @FormParam("brand")
    private String brand;
        
    /**
     * 车辆性质（运营 or 非运营）
     */
    @FormParam("operating")
    private boolean operating;
    
    /**
     * 行驶里程(万公里)
     */
    @FormParam("mileage")
    private int mileage;
    
    private Date timeCreated;

    private Date timeLastUpdated;
    
    private Source source;
    
    private String lastModifiedBy;

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
                   Date timeLastUpdated,
                   Source source,
                   String lastModifiedBy) {
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
        this.source = source;
        this.lastModifiedBy = lastModifiedBy;
    }
}
