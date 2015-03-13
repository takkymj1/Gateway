/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.idm.model;

import com.creditcloud.model.BaseObject;

/**
 *
 * @author tinglany
 */
public class UserAttr extends BaseObject {
    private String uid;
    
    private String userpassword;
    
    private String cn;
    
    private String mobile;
    
    private String securemobile;
    
    private String mail;
    
    private String userType;
    
    private String idcardtype;
    
    private String idcardnumber;
    
    private String bankid;
    
    private String bankname;
    
    private String bankaccountmobile;
    
    private String bankaccountcha;
    
    private String fundaccount;
    
    private String fundcustomerid;
    
    private String fundtradingpass;

    public UserAttr() {
    }

    public UserAttr(String uid, String userpassword, String cn, String mobile, String securemobile, String mail, String userType, String idcardtype, String idcardnumber, String bankid, String bankname, String bankaccountmobile, String bankaccountcha, String fundaccount, String fundcustomerid, String fundtradingpass) {
        this.uid = uid;
        this.userpassword = userpassword;
        this.cn = cn;
        this.mobile = mobile;
        this.securemobile = securemobile;
        this.mail = mail;
        this.userType = userType;
        this.idcardtype = idcardtype;
        this.idcardnumber = idcardnumber;
        this.bankid = bankid;
        this.bankname = bankname;
        this.bankaccountmobile = bankaccountmobile;
        this.bankaccountcha = bankaccountcha;
        this.fundaccount = fundaccount;
        this.fundcustomerid = fundcustomerid;
        this.fundtradingpass = fundtradingpass;
    }

    public String getUid() {
        return uid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public String getCn() {
        return cn;
    }

    public String getMobile() {
        return mobile;
    }

    public String getSecuremobile() {
        return securemobile;
    }

    public String getMail() {
        return mail;
    }

    public String getUserType() {
        return userType;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public String getIdcardnumber() {
        return idcardnumber;
    }

    public String getBankid() {
        return bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public String getBankaccountmobile() {
        return bankaccountmobile;
    }

    public String getBankaccountcha() {
        return bankaccountcha;
    }

    public String getFundaccount() {
        return fundaccount;
    }

    public String getFundcustomerid() {
        return fundcustomerid;
    }

    public String getFundtradingpass() {
        return fundtradingpass;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setSecuremobile(String securemobile) {
        this.securemobile = securemobile;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setBankaccountmobile(String bankaccountmobile) {
        this.bankaccountmobile = bankaccountmobile;
    }

    public void setBankaccountcha(String bankaccountcha) {
        this.bankaccountcha = bankaccountcha;
    }

    public void setFundaccount(String fundaccount) {
        this.fundaccount = fundaccount;
    }

    public void setFundcustomerid(String fundcustomerid) {
        this.fundcustomerid = fundcustomerid;
    }

    public void setFundtradingpass(String fundtradingpass) {
        this.fundtradingpass = fundtradingpass;
    }
    
}
