/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.mock;

import com.creditcloud.model.constraints.PNRReturnURL;

/**
 *
 * @author rooseek
 */
public class MockURL {

    @PNRReturnURL
    private String url;

    public MockURL() {
    }

    public MockURL(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
