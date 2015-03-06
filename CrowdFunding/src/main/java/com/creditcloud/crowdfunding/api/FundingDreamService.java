/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.api;

import com.creditcloud.crowdfunding.model.FundingDream;
import com.creditcloud.crowdfunding.model.FundingDreamReward;
import javax.ejb.Remote;

/**
 *
 * @author xiongyong
 */
@Remote
public interface FundingDreamService {

    /**
     *
     * @param clientCode
     * @param dream
     * @return
     */
    public FundingDream addDream(String clientCode, FundingDream dream);
    
    /**
     *
     * @param clientCode
     * @param dreamReward
     * @return
     */
    public FundingDreamReward addDreamReward(String clientCode, FundingDreamReward dreamReward);
}
