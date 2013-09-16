/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.CareerStatus;
import com.creditcloud.model.enums.user.MonthlySalary;
import com.creditcloud.model.enums.user.YearOfService;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class CareerInfo extends BaseObject {

    //职业状态
    @FormParam("careerStatus")
    @XmlElement(name = "careerStatus")
    private CareerStatus careerStatus;

    //公司信息
    @FormParam("company")
    @XmlElement(name = "company")
    private CompanyInfo company;

    //工作省份
    @FormParam("province")
    @XmlElement(name = "province")
    private String province;

    //工作城市
    @FormParam("city")
    @XmlElement(name = "city")
    private String city;

    //职位
    @FormParam("position")
    @XmlElement(name = "position")
    private String position;

    //月收入
    @FormParam("salary")
    @XmlElement(name = "salary")
    private MonthlySalary salary;

    //在现单位工作年限
    @FormParam("yearOfService")
    @XmlElement(name = "yearOfService")
    private YearOfService yearOfService;

    //工作邮箱
    @FormParam("workMail")
    @XmlElement(name = "workMail")
    private String workMail;

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

    public CareerInfo() {
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

    public void setCareerStatus(CareerStatus careerStatus) {
        this.careerStatus = careerStatus;
    }

    public void setCompany(CompanyInfo company) {
        this.company = company;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(MonthlySalary salary) {
        this.salary = salary;
    }

    public void setYearOfService(YearOfService yearOfService) {
        this.yearOfService = yearOfService;
    }

    public void setWorkMail(String workMail) {
        this.workMail = workMail;
    }
}
