package com.creditcloud.payment.model.chinapnr.constraint;

/**
 *
 * @author rooseek
 */
public class MockData {

    @PnRReturnURL
    private String url;

    @PnRDate
    private String date;

    public MockData() {
    }

    public MockData(String url, String date) {
        this.url = url;
        this.date = date;
    }

    public MockData(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
