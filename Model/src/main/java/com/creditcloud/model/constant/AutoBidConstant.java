/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author rooseek
 */
public interface AutoBidConstant {
    
    /**
     * 首次启动自动投标时自动投标金额占贷款总金额比例上限
     */
    double MAX_AUTO_BID_PERCENT = 0.5;

    /**
     * 自动投标单次投标占总贷款额最大百分比
     */
    double MAX_SINGLE_AUTO_BID_PERCENT = 0.2;

    /**
     * 贷款招标开始后自动投标重新启动时间间隔，单位毫秒
     */
    long AUTO_BID_REOPEN_INTERVAL = 20 * 60 * 1000;
}
