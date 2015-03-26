/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.impl;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.ticket.CallOperation;
import com.creditcloud.model.enums.ticket.TicketCategory;
import com.creditcloud.model.enums.ticket.TicketStatus;
import com.creditcloud.model.enums.ticket.TicketType;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.ticket.Ticket;
import com.creditcloud.service.ManagerTicketService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chai
 */
public abstract class AbstractManagerTicketService implements ManagerTicketService{

    @Override
    public Ticket addNew(Ticket ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult listBySearch(PageInfo pageInfo, String userId, List<TicketType> typeList, List<TicketCategory> categoryList, List<CallOperation> callOperationList, List<TicketStatus> statusList, Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PagedResult listByTicketId(PageInfo pageInfo, String ticketId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
