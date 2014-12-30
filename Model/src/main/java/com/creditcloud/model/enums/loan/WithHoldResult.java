package com.creditcloud.model.enums.loan;
import com.creditcloud.model.enums.BaseEnum;

/**
 * 代扣状态
 * @author ceusan
 */
  public enum WithHoldResult implements BaseEnum {

    PARAM_ERROR("参数错误"),
    REPAY_NOT_FOUND("未找到还款记录"),
    REPAY_ALREADY("该还款已付"),
    FUND_ACCOUNT_NOT_FOUND("未找到资金账户"),
    TRANS_FAILED("交易失败"),
    OPERATION_SUCESS("操作成功"),
    NO_WITHHOLD_AMOUNT("没有要代扣金额");
    
    private final String key;

    WithHoldResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
