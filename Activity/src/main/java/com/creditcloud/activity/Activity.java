/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author rooseek
 */
@Data
public class Activity extends BaseObject {

    private static final long serialVersionUID = 20131211L;
    
    private String id;

    /**
     * 活动发起人,可以是User、Employee、Role等,如果是null则为系统管理员
     */
    private RealmEntity performer;

    @NotNull
    private ActivityType type;

    /**
     * 活动的关联对象，例如贷款申请、贷款等
     */
    @NotNull
    private RealmEntity target;

    private String description;

    /**
     * 可能存储更改后对象整体的json string,或者只存储变动部分的key-value map
     */
    private String content;

    private Date timeRecorded;
    
    /**
     * 不存储，用于页面显示
     */
    private String performerName;

    
    public Activity(String id,
                    RealmEntity performer, 
                    ActivityType type, 
                    RealmEntity target, 
                    String description,
                    String content) {
        this.id = id;
        this.performer = performer;
        this.type = type;
        this.target = target;
        this.description = description;
        this.content = content;
    }
    
    public Activity(){
    }
    
}
