/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.feedback.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.Feedback;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author suetming
 */
@Remote
public interface FeedbackService {
 
    /**
     * list feedback by page info
     * @param clientCode
     * @param pageInfo
     * @return 
     */
    public List<Feedback> listFeedback(String clientCode, PageInfo pageInfo);
    
    /**
     * add feedback
     * @param clientCode
     * @param userId
     * @param contact
     * @param feedback 
     */
    public void addFeedback(String clientCode, String userId, String contact, String feedback);
    
    /**
     * get feedback list size
     * @param clientCode
     * @return 
     */
    public long getTotalSize(String clientCode);
    
    /**
     * remove feedback from list
     * @param clientCode
     * @param feedback 
     */
    public void remove(String clientCode, Feedback feedback);
    
}
