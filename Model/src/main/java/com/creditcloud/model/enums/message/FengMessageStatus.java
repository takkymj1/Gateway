package com.creditcloud.model.enums.message;
import com.creditcloud.model.enums.BaseEnum;
/**
 *
 * @author zhanggma
 */
public enum FengMessageStatus implements BaseEnum {

    NOTI_ASSIGN_000001("全部债权转让完成"),
    NOTI_ASSIGN_000002("部分债权转让完成"),
    NOTI_ASSIGN_000003("债权投资交易完成"),
    NOTI_ASSIGN_000004("借款项目债权转让通知");

    private final String key;

    private FengMessageStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
