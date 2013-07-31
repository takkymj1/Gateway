/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.MaritalStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author rooseek
 */
public class PersonalInfo extends BaseObject {

    //性别
    @NotNull
    private boolean male;

    //出生日期
    @NotNull
    @Past
    private Date dateOfBirth;

    //婚姻状况
    @NotNull
    private MaritalStatus maritalStatus;

    //有无子女
    @NotNull
    private boolean children;

    //教育信息
    @NotNull
    private EducationInfo education;

    //所在地信息
    @NotNull
    private PlaceInfo place;

    //个人头像存储路径
    @NotNull
    private String avatar;

    public PersonalInfo() {
    }

    /**
     *
     * @param male 性别
     * @param dateOfBirth 出生日期
     * @param maritalStatus 婚姻状况
     * @param children 有无子女
     * @param education 教育信息
     * @param place 籍贯及所在地信息
     * @param avatar 个人头像,可以为空
     */
    public PersonalInfo(boolean male,
                        Date dateOfBirth,
                        MaritalStatus maritalStatus,
                        boolean children,
                        EducationInfo education,
                        PlaceInfo place,
                        String avatar) {
        this.male = male;
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
}
