/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.userinfo;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.CompanyIndustry;
import com.creditcloud.model.enums.user.CompanySize;
import com.creditcloud.model.enums.user.CompanyType;

/**
 *
 * @author rooseek
 */
public class CompanyInfo extends BaseObject {
    //公司或单位名称
    private String name;

    //公司类别
    private CompanyType type;

    //公司行业
    private CompanyIndustry industry;

    //公司规模
    private CompanySize size_;

    //公司电话
    private String phone;

    //公司地址
    private String address;

    public CompanyInfo() {
    }

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

    public String getName() {
        return name;
    }

    public CompanyType getType() {
        return type;
    }

    public CompanyIndustry getIndustry() {
        return industry;
    }

    public CompanySize getSize() {
        return size_;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
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

    public void setSize(CompanySize size_) {
        this.size_ = size_;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
