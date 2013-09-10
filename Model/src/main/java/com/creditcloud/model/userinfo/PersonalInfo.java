/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.MaritalStatus;
import java.util.Date;

/**
 *
 * @author rooseek
 */
public class PersonalInfo extends BaseObject {

    //性别
    private final boolean male;

    //出生日期
    private final Date dateOfBirth;

    //婚姻状况
    private final MaritalStatus maritalStatus;

    //有无子女
    private final boolean children;

    //教育信息
    private final EducationInfo education;

    //所在地信息
    private final PlaceInfo place;

    //个人头像存储路径
    private final String avatar;

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

    public boolean isChildren() {
        return children;
    }

    public EducationInfo getEducation() {
        return education;
    }

    public PlaceInfo getPlace() {
        return place;
    }
}
