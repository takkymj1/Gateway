/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.user.User;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author keven
 */
@XmlRootElement
@Data
public class AppointRequestExt {

    private User user;
    private String branch;
    private String status;
    private AppointRequest request;
    /**
     * 预约实体
     */
    private Object obj;
    /**
     * 预约对象名称
     */
    private String targetName;

    public AppointRequestExt() {
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request,
                             String targetName) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
        this.targetName = targetName;
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
    }

    public AppointRequestExt(User user,
                             String branch,
                             String status,
                             AppointRequest request,
                             String targetName,
                             Object obj) {
        this.user = user;
        this.branch = branch;
        this.status = status;
        this.request = request;
        this.targetName = targetName;
        this.obj = obj;
    }
}
