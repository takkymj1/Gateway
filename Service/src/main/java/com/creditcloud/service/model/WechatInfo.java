package com.creditcloud.service.model;


import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author panda
 */

@Data
@NoArgsConstructor
@XmlRootElement
public class WechatInfo extends BaseObject{
    
    private static final long serialVersionUID = 20141023L;
    /**
     * ID
     */
    private String id;
    /**
     * 微信号
     */
   
    private String wxId;

    /**
     * 手机号
     */
    private String phone;
    
    /**
     * 中奖金额
     */
    private Double money;

    /**
     * 中奖时间
     */
    private Date duration;
    
    /**
     * 是否中奖,0:未中奖，1:已中奖未兑换，2:已中奖已兑换，3:已中奖已派发
     */
    private int operation;
    
    public WechatInfo(String id,String wxId,String phone,Double money,Date duration,int operation){
        this.id =  id;
        this.wxId = wxId;
        this.phone = phone;
        this.money = money;
        this.duration = duration;
        this.operation = operation;
    }
    
    
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getWxId(){
        return this.wxId;
    }
    public void setWxId(String wxId){
        this.wxId = wxId;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public Double getMoney(){
        return this.money;
    }
    public void setMoney(Double money){
        this.money = money;
    }
    public int getOperation(){
        return this.operation;
    }
    public void setOperation(int operation){
        this.operation = operation;
    }
}


