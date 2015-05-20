/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.info.CareerStatus;
import com.creditcloud.model.enums.user.info.MonthlySalary;
import com.creditcloud.model.enums.user.info.YearOfService;
import com.creditcloud.model.enums.user.info.YearlyIncome;
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
public class CareerInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;
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

    //年收入
    @FormParam("yearlyIncome")
    @XmlElement(name = "yearlyIncome")
    private YearlyIncome yearlyIncome;
    
    //在现单位工作年限
    @FormParam("yearOfService")
    @XmlElement(name = "yearOfService")
    private YearOfService yearOfService;

    //工作邮箱
    @FormParam("workMail")
    @XmlElement(name = "workMail")
    private String workMail;

    //从出道开始总工作年限
    @FormParam("totalYearOfService")
    @XmlElement(name = "totalYearOfService")
    private YearOfService totalYearOfService;

    /**
     *
     * @param careerStatus  职业状态
     * @param company       公司信息
     * @param province      工作省市
     * @param city          工作城市
     * @param position      职位
     * @param salary        月收入
     * @param yearOfService 在现单位工作年限
     * @param workMail      工作邮箱
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
}
