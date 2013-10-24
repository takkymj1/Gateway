/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.device;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author suetming
 */
@XmlRootElement
public class DeviceApp extends BaseObject {

    private static final long serialVersionUID = 20131024L;
    
    public static final String APP_NAME_SEPARATOR = "-";

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String versionName;

    @NotNull
    private Long versionCode;

    @NotNull
    protected Date timeCreated;

    @NotNull
    protected Date timeLastUpdated;

    public DeviceApp() {
    }

    public DeviceApp(String id, String name, String versionName, Long versionCode, Date timeCreated, Date timeLastUpdated) {
        this.id = id;
        this.name = name;
        this.versionName = versionName;
        this.versionCode = versionCode;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Long getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Long versionCode) {
        this.versionCode = versionCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获得由App内相关field组成的唯一文件name,用于存储
     * @return 
     */
    public String getAppFileName(){
        return name.concat(APP_NAME_SEPARATOR).concat(versionName);
    }
}
