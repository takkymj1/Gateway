package com.creditcloud.allwin.model;

public class Title implements java.io.Serializable {

    /**
     *
     */
    private String customerName;  //客户姓名
    private String paperNumber;   //客户身份证号
    private String reportTime;    //报告生成时间
    private String wjqCount;     //正常还款账户未结清笔数
    private String jqCount;      //正常还款账户已结清笔数
    private String totalCount;   //正常还款账户数小计
    private String ewjqCount;    //异常还款账户未结清笔数
    private String ejqCount;     //异常还款账户已结清笔数
    private String etotalCount;  //异常还款账户数小计
    private String applyingCount;//客户正在申请中的笔数
    private String applyPassedCount;//客户已经审批通过的笔数
    private String applyRejectCount;//客户申请审批被拒绝的笔数
    private String applyTotalCount;//客户申请统计
    private String queryCount;//最近2年内查询记录

    public String getApplyTotalCount() {
        return applyTotalCount;
    }

    public void setApplyTotalCount(String applyTotalCount) {
        this.applyTotalCount = applyTotalCount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(String paperNumber) {
        this.paperNumber = paperNumber;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getWjqCount() {
        return wjqCount;
    }

    public void setWjqCount(String wjqCount) {
        this.wjqCount = wjqCount;
    }

    public String getJqCount() {
        return jqCount;
    }

    public void setJqCount(String jqCount) {
        this.jqCount = jqCount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getEwjqCount() {
        return ewjqCount;
    }

    public void setEwjqCount(String ewjqCount) {
        this.ewjqCount = ewjqCount;
    }

    public String getEjqCount() {
        return ejqCount;
    }

    public void setEjqCount(String ejqCount) {
        this.ejqCount = ejqCount;
    }

    public String getEtotalCount() {
        return etotalCount;
    }

    public void setEtotalCount(String etotalCount) {
        this.etotalCount = etotalCount;
    }

    public String getApplyingCount() {
        return applyingCount;
    }

    public void setApplyingCount(String applyingCount) {
        this.applyingCount = applyingCount;
    }

    public String getApplyPassedCount() {
        return applyPassedCount;
    }

    public void setApplyPassedCount(String applyPassedCount) {
        this.applyPassedCount = applyPassedCount;
    }

    public String getApplyRejectCount() {
        return applyRejectCount;
    }

    public void setApplyRejectCount(String applyRejectCount) {
        this.applyRejectCount = applyRejectCount;
    }

    public String getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(String queryCount) {
        this.queryCount = queryCount;
    }

    @Override
    public String toString() {
        return "Title [customerName=" + customerName + ", paperNumber="
                + paperNumber + ", reportTime=" + reportTime + ", wjqCount="
                + wjqCount + ", jqCount=" + jqCount + ", totalCount="
                + totalCount + ", ewjqCount=" + ewjqCount + ", ejqCount="
                + ejqCount + ", etotalCount=" + etotalCount
                + ", applyingCount=" + applyingCount + ", applyPassedCount="
                + applyPassedCount + ", applyRejectCount=" + applyRejectCount
                + ", applyTotalCount=" + applyTotalCount + ", queryCount="
                + queryCount + "]";
    }
}
