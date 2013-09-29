/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.EthnicGroup;
import com.creditcloud.model.enums.user.info.MaritalStatus;
import com.creditcloud.model.validation.group.LoanRequestCheck;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
@Embeddable
public class PersonalInfo extends BaseEntity {

    //性别
    @NotNull(message = "性别信息不能为空",
             groups = LoanRequestCheck.class)
    private boolean male;

    @NotNull(message = "民族信息不能为空",
             groups = LoanRequestCheck.class)
    @Enumerated(EnumType.STRING)
    private EthnicGroup ethnic;

    //出生日期
    @NotNull(message = "出生日期不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    //婚姻状况
    @NotNull(message = "婚姻状况不能为空",
             groups = LoanRequestCheck.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "MARITAL_STATUS")
    private MaritalStatus maritalStatus;

    //有无子女
    @NotNull(message = "有无子女信息不能为空",
             groups = LoanRequestCheck.class)
    private boolean children;

    //教育信息
    @NotNull(message = "教育信息不能为空",
             groups = LoanRequestCheck.class)
    @Valid
    private EducationInfo education;

    //所在地信息
    @NotNull(message = "所在地信息不能为空",
             groups = LoanRequestCheck.class)
    @Valid
    private PlaceInfo place;

    //个人头像图片名
    private String avatar;

    public PersonalInfo() {
    }

    /**
     *
     * @param male          性别
     * @param ethnic        民族
     * @param dateOfBirth   出生日期
     * @param maritalStatus 婚姻状况
     * @param children      有无子女
     * @param education     教育信息
     * @param place         籍贯及所在地信息
     * @param avatar        个人头像,可以为空
     */
    public PersonalInfo(boolean male,
                        EthnicGroup ethnic,
                        Date dateOfBirth,
                        MaritalStatus maritalStatus,
                        boolean children,
                        EducationInfo education,
                        PlaceInfo place,
                        String avatar) {
        this.male = male;
        this.ethnic = ethnic;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.children = children;
        this.education = education;
        this.place = place;
        this.avatar = avatar;
    }

    public boolean isMale() {
        return male;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public boolean hasChildren() {
        return children;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isChildren() {
        return children;
    }

    public EducationInfo getEducation() {
        return education;
    }

    public PlaceInfo getPlace() {
        return place;
    }

    public void setEducation(EducationInfo education) {
        this.education = education;
    }

    public void setPlace(PlaceInfo place) {
        this.place = place;
    }

    public EthnicGroup getEthnic() {
        return ethnic;
    }

    public void setEthnic(EthnicGroup ethnic) {
        this.ethnic = ethnic;
    }
}
