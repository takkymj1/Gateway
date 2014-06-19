/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 推荐用户,主要用于页面显示
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class ReferralUser extends BaseObject {

    private static final long serialVersionUID = 20140612L;

    private User user;

    /**
     * 成功投标金额
     */
    @Min(0)
    private long investAmount;

    /**
     * 奖励金额
     */
    @Min(0)
    private int rewardAmount;

    /**
     * 是否已经奖励
     *
     * @return
     */
    public boolean isRewarded() {
        if (user == null) {
            return false;
        }
        return user.isReferralRewarded();
    }

}
