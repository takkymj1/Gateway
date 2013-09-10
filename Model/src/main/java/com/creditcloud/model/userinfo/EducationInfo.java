/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.EducationLevel;

/**
 *
 * @author sobranie
 */
public class EducationInfo extends BaseObject {

    //最高学历
    private final EducationLevel educationLevel;

    //入学年份
    private final String enrollmentYear;

    //学校
    private final String school;

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
