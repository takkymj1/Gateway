/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.ticket.CallOperation;
import com.creditcloud.model.enums.ticket.TicketCategory;
import com.creditcloud.model.enums.ticket.TicketStatus;
import com.creditcloud.model.enums.ticket.TicketType;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.ticket.Ticket;
import com.creditcloud.model.ticket.TicketReply;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;

/**
 *
 * @author chai
 */
@Remote
public interface ManagerTicketService {
    
    
    public Ticket addNew(Ticket ticket);
    
    public PagedResult<Ticket> listBySearch(PageInfo pageInfo,
                                    String userId,
                                    List<TicketType> typeList,
                                    List<TicketCategory> categoryList,
                                    List<CallOperation> callOperationList,
                                    List<TicketStatus> statusList,
                                    Date from,
                                    Date to);
    
    public PagedResult<TicketReply> listByTicketId(PageInfo pageInfo, String ticketId);
}
