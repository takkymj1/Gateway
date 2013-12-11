/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.activity.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;

/**
 * TODO
 *
 * @author rooseek
 */
public class Activity extends BaseObject {

    private static final long serialVersionUID = 20131211L;

    /**
     * 活动发起人
     */
    private RealmEntity performer;

    private Date timeRecorded;
}
