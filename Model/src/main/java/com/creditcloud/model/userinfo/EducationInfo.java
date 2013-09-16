/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.EducationLevel;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class EducationInfo extends BaseObject{

    //最高学历
    @FormParam("educationLevel")
    @XmlElement(name = "educationLevel")
    private EducationLevel educationLevel;

    //入学年份
    @FormParam("enrollmentYear")
    @XmlElement(name = "enrollmentYear")
    private String enrollmentYear;

    //学校
    @FormParam("school")
    @XmlElement(name = "school")
    private String school;

    /**
     *
     * @param educationLevel 最高学历
     * @param enrollmentYear 入学年份
     * @param school 学校
     */
    public EducationInfo(EducationLevel educationLevel,
                         String enrollmentYear,
                         String school) {
        this.educationLevel = educationLevel;
        this.enrollmentYear = enrollmentYear;
        this.school = school;
    }

    public EducationInfo() {
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setEnrollmentYear(String enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public String getEnrollmentYear() {
        return enrollmentYear;
    }

    public String getSchool() {
        return school;
    }
}
