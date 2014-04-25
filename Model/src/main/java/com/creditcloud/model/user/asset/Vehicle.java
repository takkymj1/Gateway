/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.info.VehicleType;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
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
public class Vehicle extends BaseObject {

    private static final long serialVersionUID = 20130926L;

    @FormParam("id")
    private String id;

    @FormParam("userId")
    private String userId;

    /**
     * 相关联的实体，例如贷款申请
     */
    private RealmEntity owner;

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
     * 购车年月份，2014表示年，如果精确到月格式为201404
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
    @NotNull
    @FormParam("brand")
    private String brand;

    /**
     * 车辆性质（运营 or 非运营）
     */
    @FormParam("operating")
    private boolean operating;

    /**
     * 行驶里程(公里)
     */
    @FormParam("mileage")
    private int mileage;

    private Date timeCreated;

    private Date timeLastUpdated;

    private Source source;

    private String lastModifiedBy;

    public Vehicle(String id,
                   String userId,
                   RealmEntity owner,
                   String model,
                   VehicleType type,
                   String vehicleLicense,
                   String plateNumber,
                   int yearOfPurchase,
                   int priceOfPurchase,
                   int estimatedValue,
                   String description,
                   String brand,
                   boolean operating,
                   int mileage,
                   Source source,
                   String lastModifiedBy) {
        this.id = id;
        this.userId = userId;
        this.owner = owner;
        this.model = model;
        this.type = type;
        this.vehicleLicense = vehicleLicense;
        this.plateNumber = plateNumber;
        this.yearOfPurchase = yearOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
        this.estimatedValue = estimatedValue;
        this.description = description;
        this.brand = brand;
        this.operating = operating;
        this.mileage = mileage;
        this.source = source;
        this.lastModifiedBy = lastModifiedBy;
    }
}
