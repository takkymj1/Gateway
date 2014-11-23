/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

/**
 * 订单状态
 *
 * @author rooseek
 */
public enum Status {

    INIT,
    SUCCESS,
    FREEZED,
    PREAUTH,//已授权
    CONFIRM,//已确认出款
    CANCEL,//已取消
    PROCESSING,//处理中
    ERROR,//异常
    FAIL,//失败
}
