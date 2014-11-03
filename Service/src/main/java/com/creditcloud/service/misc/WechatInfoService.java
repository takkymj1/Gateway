/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service.misc;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.service.model.misc.WechatInfo;
import java.util.Date;
import java.util.List;

/**
 * @author rooseek
 */
public interface WechatInfoService {

    int addWechatInfos(List<WechatInfo> wis);

    PagedResult<com.creditcloud.service.model.misc.WechatInfo> listWechatInfoByDate(Date from, Date to, PageInfo pageInfo);

    WechatInfo addWechatInfo(WechatInfo wxi);

    boolean rewardWechatInfo(String id);
}
