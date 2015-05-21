/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum OpenBankId implements BaseEnum {

    PSBC("邮政储蓄银行", "0100"),
    ICBC("中国工商银行", "0102"),
    ABC("中国农业银行", "0103"),
    BOC("中国银行", "0104"),
    CCB("建设银行", "0105"),
    BOCOM("交通银行", "0301"),
    CITIC("中信银行", "0302"),
    CEB("光大银行", "0303"),
    CMBC("民生银行", "0305"),
    GDB("广发银行", "0306"),
    SDB("深发银行", "0307"),
    CMB("招商银行", "0308"),
    CIB("兴业银行", "0309"),
    PINGAN("平安银行", "0410");

    private final String key;

    private final String code;

    private OpenBankId(final String key, final String code) {
        this.key = key;
        this.code = code;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }

    public static OpenBankId fromCode(String code) {
        for (OpenBankId bank : OpenBankId.values()) {
            if (bank.getCode().equalsIgnoreCase(code)) {
                return bank;
            }
        }
        return null;
    }
}
