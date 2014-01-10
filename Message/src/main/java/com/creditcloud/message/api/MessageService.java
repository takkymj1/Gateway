/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.message.api;

import com.creditcloud.model.client.Client;
import com.creditcloud.model.Message;
import com.creditcloud.model.MessageBody;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.enums.message.MessageStatus;
import com.creditcloud.model.enums.message.MessageType;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface MessageService {

    /**
     * send message from one sender to receivers
     *
     * @param client
     * @param realm
     * @param title
     * @param content
     * @param sendSM
     * @param sender
     * @param receiver
     */
    void sendMessage(Client client,
                     Realm realm,
                     String title,
                     String content,
                     boolean sendSM,
                     String sender,
                     String... receiver);

    /**
     * reply a sender
     *
     * @param client
     * @param realm
     * @param title
     * @param content
     * @param sendSM
     * @param sender
     * @param receiver
     * @return
     */
    Message reply(Client client,
                  Realm realm,
                  String title,
                  String content,
                  boolean sendSM,
                  String sender,
                  String receiver);

    /**
     * send system notifications to some receivers
     *
     * @param client
     * @param realm
     * @param title
     * @param content
     * @param sendSM
     * @param receiver
     */
    void sendNotification(Client client,
                          Realm realm,
                          String title,
                          String content,
                          boolean sendSM,
                          String... receiver);

    /**
     * broadcast notification to all receivers in a realm
     *
     * @param client
     * @param realm
     * @param title
     * @param content
     * @param sendSM
     */
    void broadcast(Client client,
                   Realm realm,
                   String title,
                   String content,
                   boolean sendSM);

    /**
     * list conversation between sender and receiver, order by sent time in DESC
     *
     * @param client
     * @param realm
     * @param sender
     * @param receiver
     * @param info
     * @return
     */
    PagedResult<Message> listConversation(Client client,
                                          Realm realm,
                                          String sender,
                                          String receiver,
                                          PageInfo info);

    /**
     * count messages for receiver by type and status
     *
     * @param client
     * @param realm
     * @param receiver
     * @param type
     * @param status
     * @return
     */
    int countByReceiver(Client client,
                        Realm realm,
                        String receiver,
                        MessageType[] type,
                        MessageStatus[] status);

    /**
     * list messages for receiver by type and status
     *
     * @param client
     * @param realm
     * @param receiver
     * @param type
     * @param status
     * @param pageInfo
     * @return
     */
    PagedResult<Message> listByReceiver(Client client,
                                        Realm realm,
                                        String receiver,
                                        MessageType[] type,
                                        MessageStatus[] status,
                                        PageInfo pageInfo);

    /**
     * count messages for sender by type
     *
     * @param Client
     * @param realm
     * @param sender
     * @param type
     * @return
     */
    int countBySender(Client client,
                      Realm realm,
                      String sender,
                      MessageType... type);

    /**
     * list messages for sender by type
     *
     * @param client
     * @param realm
     * @param sender
     * @param type
     * @param pageInfo
     * @return
     */
    PagedResult<Message> listBySender(Client client,
                                      Realm realm,
                                      String sender,
                                      PageInfo pageInfo,
                                      MessageType... type);

    /**
     * 列出所有realm
     *
     * @param client
     * @param realm
     * @param pageInfo
     * @return
     */
    PagedResult<MessageBody> listNotification(Client client,
                                              PageInfo pageInfo,
                                              Realm... realms);

    /**
     * mark MessageStatus for messages
     *
     * @param client
     * @param status
     * @param messageIds
     */
    public void markStatus(Client client, MessageStatus status, String... messageIds);
}
