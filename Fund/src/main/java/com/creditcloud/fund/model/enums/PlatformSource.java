package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/10
 * Time: 13:35
 * Desc:
 * To change this template use File | Settings | File Templates.
 */
public enum PlatformSource implements BaseEnum {
    UMP("联动优势");


    private final String key;




    private PlatformSource(String key) {
        this.key = key;
    }
    /**
     * key along with enum
     *
     * @return
     */
    @Override
    public String getKey() {
        return key;
    }
}
