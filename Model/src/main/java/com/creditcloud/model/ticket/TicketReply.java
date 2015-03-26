/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.ticket;

import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketReply extends BaseObject{
    
    private String id;
    
    @NotNull
    private String ticketId;
    
    @NotNull
    private String repliedEmployeeId;
    
    @NotNull
    private String replyContent;
    
    private Date timeReplied;
}
