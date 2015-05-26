package com.creditcloud.allwin.model;

import java.util.Arrays;
import java.util.List;

public class CreditReport implements java.io.Serializable {

    private Title title;
    private List<ApplyDetail> applyDetails;
    private List<NormalCreditDetail> normalCreditDetails;
    private List<AbnormalCreditDetail> abnormalCreditDetails;
    private List<QueryDetail> queryDetails;
    private List<Error> errors;
    private List<BlackData> blackDatas;
    private String excelPath;

    public List<BlackData> getBlackDatas() {
        return blackDatas;
    }

    public void setBlackDatas(List<BlackData> blackDatas) {
        this.blackDatas = blackDatas;
    }

    public String getExcelPath() {
        return excelPath;
    }

    public void setExcelPath(String excelPath) {
        this.excelPath = excelPath;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<ApplyDetail> getApplyDetails() {
        return applyDetails;
    }

    public void setApplyDetails(List<ApplyDetail> applyDetails) {
        this.applyDetails = applyDetails;
    }

    public List<NormalCreditDetail> getNormalCreditDetails() {
        return normalCreditDetails;
    }

    public void setNormalCreditDetails(
            List<NormalCreditDetail> normalCreditDetails) {
        this.normalCreditDetails = normalCreditDetails;
    }

    public List<AbnormalCreditDetail> getAbnormalCreditDetails() {
        return abnormalCreditDetails;
    }

    public void setAbnormalCreditDetails(
            List<AbnormalCreditDetail> abnormalCreditDetails) {
        this.abnormalCreditDetails = abnormalCreditDetails;
    }

    public List<QueryDetail> getQueryDetails() {
        return queryDetails;
    }

    public void setQueryDetails(List<QueryDetail> queryDetails) {
        this.queryDetails = queryDetails;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CreditReport [");

        if (title != null) {
            builder.append(title.toString());
        } else {
            builder.append("[title = null]");
        }

        if (applyDetails != null) {
            builder.append(Arrays.asList(applyDetails).toString());
        } else {
            builder.append("[applyDetails = null]");
        }

        if (normalCreditDetails != null) {
            builder.append(Arrays.asList(normalCreditDetails).toString());
        } else {
            builder.append("[normalCreditDetails=null]");
        }

        if (abnormalCreditDetails != null) {
            builder.append(Arrays.asList(abnormalCreditDetails).toString());
        } else {
            builder.append("[abnormalCreditDetails = null]");
        }

        if (queryDetails != null) {
            builder.append(Arrays.asList(queryDetails).toString());
        } else {
            builder.append("[queryDetail=null]");
        }

        if (errors != null) {
            builder.append(Arrays.asList(errors).toString());
        } else {
            builder.append("[errors =null]");
        }

        if (blackDatas != null) {
            builder.append("blackDatas=" + Arrays.asList(blackDatas).toString());
        } else {
            builder.append("[blackDatas = null]");
        }

        if (excelPath != null) {
            builder.append(excelPath);
        } else {
            builder.append("[excelPath = null]");
        }

        return builder.toString();
    }

}
