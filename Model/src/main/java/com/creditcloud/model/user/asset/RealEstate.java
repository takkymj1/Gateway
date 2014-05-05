/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.asset;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.GPSCoordinates;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.info.EstateType;
import java.math.BigDecimal;
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
public class RealEstate extends BaseObject implements GPSCoordinates {

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

    @FormParam("longitude")
    private BigDecimal longitude;

    @FormParam("latitude")
    private BigDecimal latitude;

    private String lastModifiedBy;

    @NotNull
    private Source source;

    public RealEstate(String id,
                      String userId,
                      EstateType type,
                      String location,
                      double area,
                      boolean loan,
                      int estimatedValue,
                      String description,
                      Date timeCreated,
                      Date timeLastUpdated,
                      BigDecimal longitude,
                      BigDecimal latitude,
                      String lastModifiedBy,
                      Source source) {
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
        this.longitude = longitude;
        this.latitude = latitude;
        this.lastModifiedBy = lastModifiedBy;
        this.source = source;
    }
}
