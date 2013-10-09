/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.GPSCoordinates;
import com.creditcloud.model.enums.Source;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 主要记录居住地址更改和实地勘察信息
 *
 * @author rooseek
 */
@XmlRootElement
public class PersonalInfoRecord extends BaseObject implements GPSCoordinates {

    private static final long serialVersionUID = 20131009L;

    @NotNull
    private String id;

    @NotNull
    private String userId;

    //现居住地址
    private String currentAddress;

    /**
     * 修改人，可能是用户自己上传后修改也可能是员工实地勘察后修改
     */
    @Column(nullable = false)
    private String modifiedBy;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Source source;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public PersonalInfoRecord() {
    }

    public PersonalInfoRecord(String id,
                           String userId,
                           String currentAddress,
                           String modifiedBy,
                           Source source,
                           BigDecimal longitude,
                           BigDecimal latitude) {
        this.id = id;
        this.userId = userId;
        this.currentAddress = currentAddress;
        this.modifiedBy = modifiedBy;
        this.source = source;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public Source getSource() {
        return source;
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

    @Override
    public BigDecimal getLongitude() {
        return longitude;
    }

    @Override
    public BigDecimal getLatitude() {
        return latitude;
    }

    @Override
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Override
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
