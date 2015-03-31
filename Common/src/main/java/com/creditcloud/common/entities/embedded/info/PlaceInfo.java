/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.validation.group.LoanRequestCheck;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
@Embeddable
public class PlaceInfo extends BaseEntity {
    //籍贯省

    @NotNull(message = "籍贯省不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "NATIVE_PROVINCE")
    private String nativeProvince;

    //籍贯市
    @NotNull(message = "籍贯市不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "NATIVE_CITY")
    private String nativeCity;

    //户口所在省
    @NotNull(message = "户口所在省/市不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "HUKOU_PROVINCE")
    private String hukouProvince;

    //户口所在市
    @NotNull(message = "户口所在市/区不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "HUKOU_CITY")
    private String hukouCity;

    //现居住地址
    @NotNull(message = "现居住地址不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "CURRENT_ADDRESS")
    private String currentAddress;

    //现居住地址电话
    @Column(name = "CURRENT_PHONE")
    private String currentPhone;
    
    //现居住地址邮编
    @Column(name = "CURRENT_ZIP", nullable = true)
    private String currentZip;

    public PlaceInfo() {
    }

    /**
     *
     * @param nativeProvince 籍贯省
     * @param nativeCity 籍贯市
     * @param hukouProvince 户口所在省
     * @param hukouCity 户口所在市
     * @param currentAddress 现居住地址
     * @param currentPhone 现居住地址电话,可以为空
     */
    public PlaceInfo(String nativeProvince,
                     String nativeCity,
                     String hukouProvince,
                     String hukouCity,
                     String currentAddress,
                     String currentPhone) {
        this.nativeProvince = nativeProvince;
        this.nativeCity = nativeCity;
        this.hukouProvince = hukouProvince;
        this.hukouCity = hukouCity;
        this.currentAddress = currentAddress;
        this.currentPhone = currentPhone;
    }

    public String getNativeProvince() {
        return nativeProvince;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public String getHukouProvince() {
        return hukouProvince;
    }

    public String getHukouCity() {
        return hukouCity;
    }

    public void setNativeProvince(String nativeProvince) {
        this.nativeProvince = nativeProvince;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    public void setHukouProvince(String hukouProvince) {
        this.hukouProvince = hukouProvince;
    }

    public void setHukouCity(String hukouCity) {
        this.hukouCity = hukouCity;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setCurrentPhone(String currentPhone) {
        this.currentPhone = currentPhone;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getCurrentPhone() {
        return currentPhone;
    }
    
    public String getCurrentZip() {
        return currentZip;
    }

    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip;
    }
}
