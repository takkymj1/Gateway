package com.creditcloud.chinapay.model.request;

import com.creditcloud.chinapay.model.POJO;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class SinglePayParameters extends POJO {

    private static final long serialVersionUID = 20150311L;

    protected String merId = "";

    protected String merDate = "";

    protected String merSeqId = "";

    protected final String version = "20090501";

    protected final String signFlag = "1";

    protected String chkValue = "";

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getMerDate() {
        return merDate;
    }

    public void setMerDate(String merDate) {
        this.merDate = merDate;
    }

    public void setMerDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStringYYYYMMDD = sdf.format(date);
        setMerDate(dateStringYYYYMMDD);
    }

    public String getMerSeqId() {
        return merSeqId;
    }

    public void setMerSeqId(String merSeqId) {
        this.merSeqId = merSeqId;
    }

    public String getVersion() {
        return version;
    }

    public String getSignFlag() {
        return signFlag;
    }

    public String getChkValue() {
        return chkValue;
    }

    public void setChkValue(String chkValue) {
        this.chkValue = chkValue;
    }

    public abstract String getTextToSign();

    public String toJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "{}";
        }
    }

    public String toString() {
        return toJSON();
    }
}
