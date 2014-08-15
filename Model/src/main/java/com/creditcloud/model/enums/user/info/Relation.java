/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author suetming (suetming.ma@creditcloud.com)
 *
 * 创建时间：2013-11-1 下午6:52:07
 *
 */
public enum Relation implements BaseEnum {

    MotherDaughter("母女"),
    FatherDaughter("父女"),
    FatherSon("父子"), 
    MotherSon("母子"), 
    Brother("兄弟"),
    Sister("姐妹"),
    Colleague("同事"), 
    Higher("上级"), 
    Lower("下级"), 
    Relative("亲戚"), 
    Other("其他");

    private final String key;

    Relation(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
