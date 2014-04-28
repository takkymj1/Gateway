/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.constant;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum Category implements BaseEnum {

    HOMEPAGE("首页大图", false),
    IMAGE("其他图片", false),
    INTRODUCTION("公司简介", true),
    REPORT("业绩报表", true),
    RESPONSIBILTY("社会责任", false),
    COOPERATION("合作伙伴", true),
    COVERAGE("媒体报道", false),
    NEWS("行业新闻", false),
    RECRUITER("工作机会", true),
    LINK("友情链接", true),
    CONTACT("联系方式", true),
    DECLARATION("服务声明", true),
    PUBLICATION("最新公告", false);

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

    public boolean getSingle() {
        return single;
    }

    /**
     * 根据枚举Name值获取一个新的分类
     *
     * @param name
     * @return
     */
    public static Category adapte(String name) {
        //默认没有匹配的，则默认成为行业新闻
        Category result = Category.NEWS;
        Category[] categorys = Category.values();
        for (Category category : categorys) {
            if (category.name().equals(name)) {
                result = category;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Category category = Category.COOPERATION;
        System.out.println(category.ordinal());
    }

}
