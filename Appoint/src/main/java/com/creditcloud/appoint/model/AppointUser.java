/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.appoint.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constraints.IdNumber;
import com.creditcloud.model.constraints.MobileNumber;
import com.creditcloud.model.constraints.RealName;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Manager从文本中导入，有资格参与某产品认购的用户基本信息记录. TODO ApointAgent也算做AppointUser
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class AppointUser extends BaseObject {

    private static final long serialVersionUID = 20140109L;

    @RealName
    @NotNull
    private String name;

    @IdNumber
    @NotNull
    private String idNumber;

    @MobileNumber
    @NotNull
    private String mobile;

    /**
     * 所属机构中文全称
     */
    @NotNull
    private String branch;
    
    private Date timeRecorded;

    public AppointUser(String name, String idNumber, String mobile, String branch) {
        this.name = name;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.branch = branch;
    }
}