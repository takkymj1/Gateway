/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.EthnicGroup;
import com.creditcloud.model.enums.user.info.HouseStatus;
import com.creditcloud.model.enums.user.info.HukouType;
import com.creditcloud.model.enums.user.info.MaritalStatus;
import java.util.Date;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class PersonalInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;
    //性别

    @FormParam("male")
    @XmlElement(name = "male")
    private boolean male;

    @FormParam("ethnic")
    @XmlElement(name = "ethnic")
    private EthnicGroup ethnic;

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
        
    //户口类型
    @FormParam("hukouType")
    @XmlElement(name = "hukouType")
    private HukouType hukouType;
    
    //住房状况
    @FormParam("houseStatus")
    @XmlElement(name="houseStatus")
    private HouseStatus houseStatus;

    //证件生效日期
    @FormParam("cardValidDate")
    @XmlElement(name="cardValidDate")
    private Date cardValidDate;
    
    //证件过期日期
    @FormParam("cardExpDate")
    @XmlElement(name="cardExpDate")
    private Date cardExpDate;
    
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
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.children = children;
        this.education = education;
        this.place = place;
        this.avatar = avatar;
        this.ethnic = ethnic;
    }

    public boolean hasChildren(){
        return children;
    }
}
