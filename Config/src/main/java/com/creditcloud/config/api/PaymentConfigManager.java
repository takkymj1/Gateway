/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.api;

import com.creditcloud.config.ChinaPayConfig;
import com.creditcloud.config.EnciPayConfig;
import com.creditcloud.config.FuiouConfig;
import com.creditcloud.config.LianPayConfig;
import com.creditcloud.config.LycheePayConfig;
import com.creditcloud.config.PaymentConfig;
import com.creditcloud.config.UmpConfig;
import com.creditcloud.config.YeepConfig;

/**
 * 三方支付相关配置
 *
 * @author rooseek
 */
public interface PaymentConfigManager {

    /**
     * 汇付天下
     *
     * @return
     */
    public PaymentConfig getPaymentConfig();

    /**
     * 易宝
     *
     * @return
     */
    public YeepConfig getYeepConfig();

    /**
     * 富友
     *
     * @return
     */
    public FuiouConfig getFuiouConfig();

    /**
     * 快付通
     *
     * @return
     */
    public LycheePayConfig getLycheePayConfig();

    /**
     * 联动优势
     *
     * @return
     */
    public UmpConfig getUmpConfig();

    /**
     *  连连支付
     * 
     * @return 
     */
    public LianPayConfig getLianPayConfig();
    /**
     * 银联
     *
     * @return
     */
    public ChinaPayConfig getChinaPayConfig();
    
    /**
     * 新华电商支付
     * @return 
     */
    public EnciPayConfig getEnciPayConfig();
}
