/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.model;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@XmlRootElement
@Data
@NoArgsConstructor
public class FavoriteProject extends BaseObject {

    private static final long serialVersionUID = 20140922L;

    private String id;

    private String projectId;
    
    private String userId;

    private Date timeRecorded;

    public FavoriteProject(String id,
                           String projectId,
                           String userId,
                           Date timeRecorded) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.timeRecorded = timeRecorded;
    }
}
