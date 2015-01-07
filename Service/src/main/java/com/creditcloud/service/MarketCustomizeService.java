/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.service.misc.WechatInfoService;
import com.creditcloud.sms.SMSType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.ejb.Remote;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * wrap client customized requirements from CreditMarket
 *
 * @author rooseek
 */
@Remote
public interface MarketCustomizeService extends WechatInfoService{
    
    public Map<SMSType, ConcurrentHashMap<String, Map<String, Pair<Long, Long>>>> querySmsCaptchaMap(); 
}
