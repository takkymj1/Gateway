/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.api;

import com.creditcloud.fengMessage.model.TenderMailTemplateRequest;
import com.creditcloud.fengMessage.model.TenderTitleRequest;
import com.creditcloud.fengMessage.model.base.BaseRequest;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface FengMessageService {

   /**
     * 调用站内信发送接口
     * @param templateId
     * @param request
     * @param receiverIds
     * @param title
     * @return 
     */
    public boolean sendByTemplate(String templateId, TenderMailTemplateRequest request, List<String> receiverIds,String title);
    
    public boolean sendByTemplate(BaseRequest request, List<String> receiverIds, TenderTitleRequest title);
}
