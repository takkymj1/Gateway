/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded.info;

import com.creditcloud.common.entities.BaseEntity;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
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
    @Transient
    private String weibo;

    /**
     * 微信
     */
    @Transient
    private String wechat;

    public SocialInfo(String weibo, String wechat) {
        this.weibo = weibo;
        this.wechat = wechat;
    }
}
