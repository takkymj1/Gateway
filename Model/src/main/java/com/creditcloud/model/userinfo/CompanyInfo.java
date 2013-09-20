/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.CompanyIndustry;
import com.creditcloud.model.enums.user.CompanySize;
import com.creditcloud.model.enums.user.CompanyType;
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

    //公司规模
    @FormParam("size")
    @XmlElement(name = "size")
    private CompanySize size_;

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
     * @param size_ 公司规模
     * @param phone 公司电话
     * @param address 公司地址
     */
    public CompanyInfo(String name,
                       CompanyType type,
                       CompanyIndustry industry,
                       CompanySize size_,
                       String phone,
                       String address) {
        this.name = name;
        this.type = type;
        this.industry = industry;
        this.size_ = size_;
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

    public CompanySize getSize() {
        return size_;
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

    public void setSize_(CompanySize size_) {
        this.size_ = size_;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
