package com.creditcloud.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: meichao
 * Date: 2015/4/7
 * Time: 13:39
 * Desc: 提前还款配置文件
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RepaymentConfig extends BaseConfig implements Serializable{


    private static final long serialVersionUID = -7945339860855083328L;

    public static final String CONFIG_NAME = "RepaymentConfig";

    @XmlElement(required = false)
    private BigDecimal underSixMonthsRatio = new BigDecimal(0.2);

    @XmlElement(required = false)
    private BigDecimal overSixMonthsRatio = new BigDecimal(0.15);

}
