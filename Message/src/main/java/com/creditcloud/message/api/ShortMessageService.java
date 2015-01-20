/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.message.api;

import com.creditcloud.model.ShortMessage;
import com.creditcloud.model.client.Client;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import javax.ejb.Asynchronous;
import javax.ejb.Remote;

/**
 *
 * @author jinlzhang
 */
@Remote
public interface ShortMessageService {

    /**
     * send message from one sender to receivers
     *
     */
    @Asynchronous
    void sendMessage(String mobile, String content, Date sentTime, String type);

    /**
     * list shortmessage table content
     * @param client
     * @param pageInfo
     * @return 
     */
    PagedResult<ShortMessage> listNotification(Client client,PageInfo pageInfo);
}
