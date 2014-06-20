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

    EXCAVATE("采掘业"),
    GEO_SURVEY("地质勘查业"),
    RESEARCH("科学研究/技术服务"),
    IRRIGATION_ENVIRONMENT("水利/环境/公共设施管理"),
    RENTAL("租赁/商务服务"),
    MILITARY("军队/武警"),
    INTERNATIONAL("国际组织"),
    MANUFACTURE("制造业"),
    IT("电信/通信/计算机/软件/互联网"),
    GOVERNMENT("国家机关/政党机关/社会团体"),
    MEDIA_ADVERTISEMENT("媒体/广告/广播/电影/电视"),
    RETAIL_WHOLESALE("零售/批发"),
    EDUCATION_TRAINING("教育/培训 "),
    PUBLIC_SERVICES("社会服务业"),
    FINANCE_LAW("金融/保险/法律"),
    TRANSPORTATION("交通运输/仓储/邮政"),
    REAL_ESTATE("房地产业"),
    ENERGY("水/电/煤/气/能源生产供应"),
    CATERING_HOTEL("住宿/餐饮"),
    MEDICAL_HEALTH_CARE("医疗/卫生/保健"),
    CONSTRUCTION_ENGINERRING("建筑/工程"),
    AGRICULTURE("农/林/牧/渔"),
    ENTERTAIMENT("文化/娱乐服务业"),
    SPORT_ART("体育/艺术"),
    UTILITY("社会福利/公益事业"),
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
