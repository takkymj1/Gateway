/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.user.info.EducationLevel;
import com.creditcloud.model.validation.group.LoanRequestCheck;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
@Embeddable
public class EducationInfo extends BaseEntity {

    //最高学历
    @NotNull(message = "最高学历信息不能为空",
             groups = LoanRequestCheck.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "EDUCATION_LEVEL")
    private EducationLevel educationLevel;

    //入学年份
    @NotNull(message = "入学年份不能为空",
             groups = LoanRequestCheck.class)
    @Column(name = "ENROLLMENT_YEAR")
    private String enrollmentYear;

    //学校
    @NotNull(message = "学校信息不能为空",
             groups = LoanRequestCheck.class)
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
