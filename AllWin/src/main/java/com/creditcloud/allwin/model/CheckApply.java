package com.creditcloud.allwin.model;

/**
 * 贷款申请审核的数据信息。
 *
 * @author sobranie
 */
public class CheckApply {

    /**
     * 申请编号，必输且唯一
     */
    private String applyId;
    /**
     * 审批结果。 必输，符合： 01.审批通过 02.审批拒绝 04.重新审批 05.客户取消
     */
    private String applyResult;
    /**
     * 审批日期。 必输， 符合"YYYY-YY-DD"
     */
    private String applyResultTime;

    public CheckApply() {

    }

    /**
     * 包含了所有必输字段的构造函数
     *
     * @param applyId
     * @param applyResult
     * @param applyResultTime
     */
    public CheckApply(String applyId, String applyResult,
            String applyResultTime) {
        super();
        this.applyId = applyId;
        this.applyResult = applyResult;
        this.applyResultTime = applyResultTime;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public String getApplyResultTime() {
        return applyResultTime;
    }

    public void setApplyResultTime(String applyResultTime) {
        this.applyResultTime = applyResultTime;
    }

}
