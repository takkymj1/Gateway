/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum Category implements BaseEnum {

    HOMEPAGE("首页大图", false),
    IMAGE("其他图片", false),
    INTRODUCTION("公司简介", true),
    PRODUCT("产品信息",false),
    REPORT("业绩报表", true),
    RESPONSIBILTY("社会责任", false),
    COOPERATION("合作伙伴", true),
    COVERAGE("媒体报道", false),
    NEWS("行业新闻", false),
    RECRUITER("工作机会", true),
    LINK("友情链接", true),
    CONTACT("联系方式", true),
    DECLARATION("服务声明", true),
    PUBLICATION("最新公告", false),
    HELP("帮助中心", false),
    SAFETY("安全保障", true),
    OTHER("其他", false);

    private final String key;

    private final boolean single;

    private Category(String key, boolean single) {
        this.key = key;
        this.single = single;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean isSingle() {
        return single;
    }

}
