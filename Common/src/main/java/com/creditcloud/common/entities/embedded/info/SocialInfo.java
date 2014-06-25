/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@Embeddable
public class SocialInfo extends BaseEntity {

    /**
     * 新浪微博(TODO 暂不考虑国内其他微博)
     */
    private String weibo;

    /**
     * 微信
     */
    private String webchat;

    public SocialInfo(String weibo, String webchat) {
        this.weibo = weibo;
        this.webchat = webchat;
    }
}
