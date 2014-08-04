/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model.fuiou;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.BaseEnum;
import lombok.Data;

/**
 *
 * @author kdliu
 */
@Data
public class FuiouTransactionStatus extends BaseObject{
    
    private TransactionStatus status;
    
    private String result;
    
    private String reason;

    public FuiouTransactionStatus(TransactionStatus status,
                                  String result,
                                  String reason) {
        this.status = status;
        this.result = result;
        this.reason = reason;
    }
    
    public static FuiouTransactionStatus createUnconfirm(String result,
                                                         String reason) {
        return new FuiouTransactionStatus(TransactionStatus.UNCONFIRM, result, reason);
    }
    
    public static FuiouTransactionStatus createSuccess(String result,
                                                       String reason) {
        return new FuiouTransactionStatus(TransactionStatus.SUCCESS, result, reason);
    }    
    
    public static FuiouTransactionStatus createFailed(String result,
                                                      String reason) {
        return new FuiouTransactionStatus(TransactionStatus.FAILED, result, reason);
    }
    
    public static FuiouTransactionStatus createProcessing(String result,
                                                          String reason) {
        return new FuiouTransactionStatus(TransactionStatus.PROCESSING, result, reason);
    }
        
    public static FuiouTransactionStatus createTimeout(String result,
                                                       String reason) {
        return new FuiouTransactionStatus(TransactionStatus.TIMEOUT, result, reason);
    }

    public static enum TransactionStatus implements BaseEnum {
        UNCONFIRM("0", "未发送"),
        SUCCESS("1", "成功"),
        FAILED("2", "失败"),
        PROCESSING("3", "处理中"),
        TIMEOUT("7", "超时");


        protected String key;
        protected String status;

        TransactionStatus(String key, String status) {
            this.key = key;
            this.status = status;
        }

        @Override
        public String getKey() {
            return key;
        }

        public String getStatus() {
            return status;
        }
    }
}