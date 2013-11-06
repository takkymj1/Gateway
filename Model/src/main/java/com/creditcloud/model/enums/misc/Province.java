/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.misc;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author sobranie
 */
public enum Province implements BaseEnum {
    
    北京("0011"),
    天津("0012"),
    上海("0031"),
    重庆("0050"),
    河北("0013"),
    山西("0014"),
    内蒙古("0015"),
    辽宁("0021"),
    吉林("0022"),
    黑龙江("0023"),
    江苏("0032"),
    浙江("0033"),
    安徽("0034"),
    福建("0035"),
    江西("0036"),
    山东("0037"),
    河南("0041"),
    湖北("0042"),
    湖南("0043"),
    广东("0044"),
    广西("0045"),
    海南("0046"),
    四川("0051"),
    贵州("0052"),
    云南("0053"),
    西藏("0054"),
    陕西("0061"),
    甘肃("0062"),
    青海("0063"),
    宁夏("0064"),
    新疆("0065"),
    香港("2001"),
    澳门("2002"),
    台湾("2003");
    
    private final String key;
    
    Province(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
