package com.creditcloud.allwin.model;

/**
 * 查询信息
 */
public class QueryDetail implements java.io.Serializable {

    private String queryDate; //查询日期
    private String memberType; //会员类型
    private String queryType;  //查询类型
    private String remark; //备注

    public String getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "QueryDetail [queryDate=" + queryDate + ", memberType="
                + memberType + ", queryType=" + queryType + ", remark="
                + remark + "]";
    }
}
