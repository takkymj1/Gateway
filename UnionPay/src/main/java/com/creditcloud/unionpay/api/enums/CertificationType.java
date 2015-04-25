/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.api.enums;

/**
 * 银联在线全渠道接口交易类型代码表 <br>
 * 定义参考 : 中国银联全渠道支付平台-产品接口规范-商户卷-第9部分 代收产品.pdf <br>
 *
 * @author GuohuaZhang
 */
public enum CertificationType {

    ID("01", "身份证"),
    JUN_GUAN_ZHENG("02", "军官证"),
    PASSPORT("03", "护照"),
    HUI_XIANG_ZHENG("04", "回乡证"),
    TAO_BAO_ZHENG("05", "台胞证"),
    JING_GUAN_ZHENG("06", "警官证"),
    SHI_BING_ZHENG("07", "士兵证"),
    OTHERS("99", "其它证件");

    private final String name;
    private final String code;

    private CertificationType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
