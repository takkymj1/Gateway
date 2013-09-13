/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import com.creditcloud.model.enums.user.MaritalStatus;
import java.util.Date;
import javax.json.Json;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class PersonalInfo extends BaseObject implements Jsonizable<PersonalInfo> {

    //性别
    @FormParam("male")
    @XmlElement(name = "male")
    private boolean male;

    //出生日期
    @FormParam("dateOfBirth")
    @XmlElement(name = "dateOfBirth")
    private Date dateOfBirth;

    //婚姻状况
    @FormParam("maritalStatus")
    @XmlElement(name = "maritalStatus")
    private MaritalStatus maritalStatus;

    //有无子女
    @FormParam("children")
    @XmlElement(name = "children")
    private boolean children;

    //教育信息
    @FormParam("education")
    @XmlElement(name = "education")
    private EducationInfo education;

    //所在地信息
    @FormParam("place")
    @XmlElement(name = "place")
    private PlaceInfo place;

    //个人头像图片名
    @FormParam("avatar")
    @XmlElement(name = "avatar")
    private String avatar;

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

    public PersonalInfo() {
    }

    @Override
    public PersonalInfo fromJsonString(String jsonString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("male", male)
                .add("dateOfBirth", dateOfBirth.toString())
                .add("maritalStatus", maritalStatus.name())
                .add("children", children)
                .add("education", education.toJsonString())
                .add("place", place.toJsonString())
                .add("avatar", avatar)
                .build().toString();
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

    public EducationInfo getEducation() {
        return education;
    }

    public PlaceInfo getPlace() {
        return place;
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

    public void setEducation(EducationInfo education) {
        this.education = education;
    }

    public void setPlace(PlaceInfo place) {
        this.place = place;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
