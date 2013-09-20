/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CompanyIndustry implements BaseEnum {

    MANUFACTURE("制造业"),
    IT("通信/计算机/互联网"),
    GOVERNMENT("政府部门/事业单位"),
    MEDIA_ADVERTISEMENT("媒体/广告"),
    RETAIL_WHOLESALE("零售/批发"),
    EDUCATION_TRAINING("教育/培训 "),
    PUBLIC_SERVICES("公共事业"),
    FINANCE_LAW("金融/法律"),
    TRANSPORTATION("交通运输业"),
    REAL_ESTATE("房地业"),
    ENERGY("能源业"),
    CATERING_HOTEL("餐饮/旅馆业"),
    MEDICAL_HEALTH_CARE(" 医疗/卫生/保健"),
    CONSTRUCTION_ENGINERRING("建筑/工程"),
    AGRICULTURE("农业"),
    ENTERTAIMENT("娱乐服务业"),
    SPORT_ART("体育/艺术"),
    UTILITY("公益事业"),
    OTHER("其他");

    private final String key;

    private CompanyIndustry(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
