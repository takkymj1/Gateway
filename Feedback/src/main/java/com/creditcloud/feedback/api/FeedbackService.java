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
 
    public List<Feedback> listFeedback(String clientCode, PageInfo pageInfo);
    
    public void addFeedback(String clientCode, String userId, String contact, String feedback);
    
}
