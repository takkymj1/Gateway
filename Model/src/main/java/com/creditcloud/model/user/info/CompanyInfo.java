/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.info;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.info.CompanyIndustry;
import com.creditcloud.model.enums.user.info.CompanySize;
import com.creditcloud.model.enums.user.info.CompanyType;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class CompanyInfo extends BaseObject {

    private static final long serialVersionUID = 20130918L;
    //公司或单位名称

    @FormParam("name")
    @XmlElement(name = "name")
    private String name;

    //公司类别
    @FormParam("type")
    @XmlElement(name = "type")
    private CompanyType type;

    //公司行业
    @FormParam("industry")
    @XmlElement(name = "industry")
    private CompanyIndustry industry;
    
    //公司行业api中文
    @FormParam("industryName")
    @XmlElement(name = "industryName")
    private String industryName;

    //公司规模
    @FormParam("size")
    @XmlElement(name = "size")
    private CompanySize companySize;

    //公司电话
    @FormParam("phone")
    @XmlElement(name = "phone")
    private String phone;

    //公司地址
    @FormParam("address")
    @XmlElement(name = "address")
    private String address;

    /**
     *
     * @param name 公司或单位名称
     * @param type 公司类别
     * @param industry 公司行业
     * @param companySize 公司规模
     * @param phone 公司电话
     * @param address 公司地址
     */
    public CompanyInfo(String name,
                       CompanyType type,
                       CompanyIndustry industry,
                       CompanySize companySize,
                       String phone,
                       String address) {
        this.name = name;
        this.type = type;
        this.industry = industry;
        this.companySize = companySize;
        this.phone = phone;
        this.address = address;
    }

    public CompanyInfo() {
    }

    public String getName() {
        return name;
    }

    public CompanyType getType() {
        return type;
    }

    public CompanyIndustry getIndustry() {
        return industry;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public CompanySize getCompanySize() {
        return companySize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CompanyType type) {
        this.type = type;
    }

    public void setIndustry(CompanyIndustry industry) {
        this.industry = industry;
    }

    public void setCompanySize(CompanySize companySize) {
        this.companySize = companySize;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIndustryName() {
        return industryName;
    }
}
