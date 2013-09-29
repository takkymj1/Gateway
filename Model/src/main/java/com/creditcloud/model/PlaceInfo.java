/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.BaseObject;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class PlaceInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;
    //籍贯省

    @XmlElement(name = "nativeProvince")
    private String nativeProvince;

    //籍贯市
    @XmlElement(name = "nativeCity")
    private String nativeCity;

    //户口所在省
    @XmlElement(name = "hukouProvince")
    private String hukouProvince;

    //户口所在市
    @XmlElement(name = "hukouCity")
    private String hukouCity;

    //现居住地址
    @XmlElement(name = "currentAddress")
    private String currentAddress;

    //现居住地址电话
    @XmlElement(name = "currentPhone")
    private String currentPhone;

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

    public static PlaceInfo fromJsonString(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        PlaceInfo result = new PlaceInfo();
        result.setNativeProvince(jo.getString("nativeProvince"));
        result.setNativeCity(jo.getString("nativeCity"));
        result.setHukouProvince(jo.getString("hukouProvince"));
        result.setHukouCity(jo.getString("hukouCity"));
        result.setCurrentPhone(jo.getString("currentPhone"));
        result.setCurrentAddress(jo.getString("currentAddress"));
        return result;
    }

    public PlaceInfo() {
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

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getCurrentPhone() {
        return currentPhone;
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
}
