/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.device;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.ClientCode;
import com.creditcloud.model.enums.device.DeviceType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 * 表示一台移动设备
 *
 * @author sobranie
 */
public class Device extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    @ClientCode
    @Size(max = 15)
    private String clientCode;

    @FormParam("imei")
    @NotNull
    private String IMEI;

    @FormParam("mac")
    @NotNull
    @Size(max = 17)
    private String MAC;

    @FormParam("model")
    @NotNull
    @Size(max = 20)
    private String model;

    @FormParam("osVersion")
    @NotNull
    private String osVersion;

    @FormParam("kernelVersion")
    @NotNull
    private String kernelVersion;

    @FormParam("softwareVersion")
    @NotNull
    private String softwareVersion;

    @FormParam("type")
    private DeviceType type;

    private boolean enabled;

    @Past
    private Date initTime;

    @Past
    private Date registerTime;

    public Device() {
    }

    public Device(String id,
                  String clientCode,
                  String IMEI,
                  String MAC,
                  String model,
                  String osVersion,
                  String kernelVersion,
                  String softwareVersion,
                  DeviceType type,
                  boolean enabled,
                  Date initTime,
                  Date registerTime) {
        this.id = id;
        this.clientCode = clientCode;
        this.IMEI = IMEI;
        this.MAC = MAC;
        this.model = model;
        this.osVersion = osVersion;
        this.kernelVersion = kernelVersion;
        this.softwareVersion = softwareVersion;
        this.type = type;
        this.enabled = enabled;
        this.initTime = initTime;
        this.registerTime = registerTime;
    }

    public String getId() {
        return id;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getMAC() {
        return MAC;
    }

    public String getModel() {
        return model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public DeviceType getType() {
        return type;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Date getInitTime() {
        return initTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }
}
