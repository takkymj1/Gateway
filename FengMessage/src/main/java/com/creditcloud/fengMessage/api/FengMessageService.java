/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fengMessage.api;

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
     * @param request
     * @param receiverIds
     * @param title
     */
    public void sendByTemplate(BaseRequest request, List<String> receiverIds, TenderTitleRequest title);
}
