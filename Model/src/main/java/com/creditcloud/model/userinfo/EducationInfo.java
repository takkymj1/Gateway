/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.EducationLevel;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class EducationInfo extends BaseObject {

    //最高学历
    @NotNull
    private EducationLevel educationLevel;

    //入学年份
    @NotNull
    private String enrollmentYear;

    //学校
    @NotNull
    private String school;

    public EducationInfo() {
    }

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
