/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.device;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author suetming
 */
@XmlRootElement
public class DeviceAppFeedback extends BaseObject {
    @NotNull
    private String id;
    
   @NotNull
    private String feedback;

    public DeviceAppFeedback() {
    }

    public DeviceAppFeedback(String id, String feedback) {
        this.id = id;
        this.feedback = feedback;
    }
   
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
