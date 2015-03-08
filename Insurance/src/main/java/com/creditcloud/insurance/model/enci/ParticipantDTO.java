/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;

/**
 * 被保险人员基本信息
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class ParticipantDTO extends BaseObject {

    /**
     * 姓名
     */
    @NotNull
    private String name;
    
    /**
     * 英文名
     */
    private String nameEn;
    
    /**
     * 性别 CD8
     */
    @NotNull
    private String sex;
    
    /**
     * 证件类型 CD9
     */
    @NotNull
    private String cardType;
    
    /**
     * 证件号码
     */
    @NotNull
    private String cardNo;
    
    /**
     * 证件生效日 yyyy-MM-dd
     */
    @NotNull
    private String cardValidDate;
    
    /**
     * 证件过期日 yyyy-MM-dd
     */
    @NotNull
    private String cardExpDate;
    
    /**
     * 出生日期 yyyy-MM-dd
     */
    private String birthday;
    
    /**
     * 电话
     */
    private String phone;
    
    /**
     * 手机号
     */
    @NotNull
    private String mobile;
    
    /**
     * 邮箱
     */
    @NotNull
    private String email;
    
    /**
     * 国籍 CD10
     */
    @NotNull
    private String nativePlace;
    
    /**
     * 常用地址.省 CD11
     */
    @NotNull
    private String residentProvince;
    
    /**
     * 常用地址.市 CD11
     */
    @NotNull
    private String residentCity;
    
    /**
     * 常用地址.区/县 CD11
     */
    @NotNull
    private String residentCounty;
    
    /**
     * 常用地址.联系地址
     */
    @NotNull
    private String address;
    
    /**
     * 邮编
     */
    @NotNull
    private String zip;
    
    /**
     * 行业 CD12
     */
    @NotNull
    private String industry;
    
    /**
     * 工种 CD13
     */
    @NotNull
    private String jobs;
    
    /**
     * 婚姻状况 CD14
     */
    private String marital;
    
    /**
     * 身高
     */
    private int height;
    
    /**
     * 体重
     */
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardValidDate() {
        return cardValidDate;
    }

    public void setCardValidDate(String cardValidDate) {
        this.cardValidDate = cardValidDate;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getResidentProvince() {
        return residentProvince;
    }

    public void setResidentProvince(String residentProvince) {
        this.residentProvince = residentProvince;
    }

    public String getResidentCity() {
        return residentCity;
    }

    public void setResidentCity(String residentCity) {
        this.residentCity = residentCity;
    }

    public String getResidentCounty() {
        return residentCounty;
    }

    public void setResidentCounty(String residentCounty) {
        this.residentCounty = residentCounty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
}
