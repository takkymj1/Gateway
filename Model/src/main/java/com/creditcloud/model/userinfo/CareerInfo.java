/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.CareerStatus;
import com.creditcloud.model.enums.user.MonthlySalary;
import com.creditcloud.model.enums.user.YearOfService;

/**
 *
 * @author rooseek
 */
public class CareerInfo extends BaseObject {

    //职业状态
    private final CareerStatus careerStatus;

    //公司信息
    private final CompanyInfo company;

    //工作省份
    private final String province;

    //工作城市
    private final String city;

    //职位
    private final String position;

    //月收入
    private final MonthlySalary salary;

    //在现单位工作年限
    private final YearOfService yearOfService;

    //工作邮箱
    private final String workMail;

    /**
     * 
     * @param careerStatus 职业状态
     * @param company 公司信息
     * @param province 工作省市
     * @param city 工作城市
     * @param position 职位
     * @param salary 月收入
     * @param yearOfService 在现单位工作年限
     * @param workMail 工作邮箱
     */
    public CareerInfo(CareerStatus careerStatus,
                      CompanyInfo company,
                      String province,
                      String city,
                      String position,
                      MonthlySalary salary,
                      YearOfService yearOfService,
                      String workMail) {
        this.careerStatus = careerStatus;
        this.company = company;
        this.province = province;
        this.city = city;
        this.position = position;
        this.salary = salary;
        this.yearOfService = yearOfService;
        this.workMail = workMail;
    }

    public CompanyInfo getCompany() {
        return company;
    }

    public CareerStatus getCareerStatus() {
        return careerStatus;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getPosition() {
        return position;
    }

    public MonthlySalary getSalary() {
        return salary;
    }

    public YearOfService getYearOfService() {
        return yearOfService;
    }

    public String getWorkMail() {
        return workMail;
    }
}
