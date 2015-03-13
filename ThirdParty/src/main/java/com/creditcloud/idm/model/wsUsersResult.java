package com.creditcloud.idm.model;


import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class wsUsersResult extends BaseObject {
    
    private String uid;

    private String mobile;

    private String userType;

    private String userpassword;

    private String idcardtype;
    
    private String idCode;
    
    private String sn;
    
    private  String cn;

    public wsUsersResult() {
    }

    public wsUsersResult(String uid, String mobile, String userType, String userpassword, String idcardtype, String idCode, String sn, String cn) {
        this.uid = uid;
        this.mobile = mobile;
        this.userType = userType;
        this.userpassword = userpassword;
        this.idcardtype = idcardtype;
        this.idCode = idCode;
        this.sn = sn;
        this.cn = cn;
    }

    public String getUid() {
        return uid;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public String getIdCode() {
        return idCode;
    }

    public String getSn() {
        return sn;
    }

    public String getCn() {
        return cn;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
    
    
}