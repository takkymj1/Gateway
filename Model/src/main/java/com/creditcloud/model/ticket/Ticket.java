/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.ticket;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.ticket.TicketCategory;
import com.creditcloud.model.enums.ticket.TicketStatus;
import com.creditcloud.model.enums.ticket.TicketType;
import com.creditcloud.model.enums.ticket.CallOperation;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
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
public class Ticket extends BaseObject {
    
    private String id;
    
    /**
     * 工单标题
     */
    @FormParam("title")
    private String title;
    
    /**
     * 工单状态
     */
    @FormParam("status")
    @NotNull
    private TicketStatus status;
    
    /**
     * 工单类型
     */
    @FormParam("type")
    @NotNull
    private TicketType type;
    
    /**
     * 工单类别
     */
    @FormParam("category")
    @NotNull
    private TicketCategory category;
    
    /**
     * 工单来源
     */
    @FormParam("source")
    @NotNull
    private Source source;
    
    /**
     * 呼入或呼出操作
     */
    @FormParam("callOperation")
    @NotNull
    private CallOperation callOperation;
    
    /**
     * 呼入或呼出号码
     */
    @FormParam("callNumber")
    private String callNumber;
    
    /**
     * 是否公开
     */
    @FormParam("hidden")
    @NotNull
    private boolean hidden;
    
    /**
     * 相关用户ID
     */
    @FormParam("userId")
    private String userId;
    
    /**
     * 受理员工ID，未指派状态下为空
     */
    private String employeeId;
    
    /**
     * 工单内容
     */
    @FormParam("content")
    @NotNull
    private String content;
    
    /**
     * 工单创建时间
     */
    @FormParam("timeCreated")
    @NotNull
    private Date timeCreated;
    
    /**
     * 工单最近修改时间
     */
    @FormParam("timeLastModified")
    private Date timeLastModified;
    
    /**
     * 工单关闭时间
     */
    @FormParam("timeSettled")
    private Date timeSettled;
}
