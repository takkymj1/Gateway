/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.api;

import com.creditcloud.cms.constant.Category;
import com.creditcloud.cms.model.Article;
import com.creditcloud.cms.model.Channel;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface CMSService {

    /**
     * 创建新的文章
     */
    Article addArticle(Article artticle);

    /**
     * 创建新的栏目
     */
    Channel addChannel(Channel channel);

    /**
     * 通过类别列出文章
     */
    PagedResult<Article> listByCategory(Category category);

    /**
     * 通过类别列出文章
     */
    Article listBySingle(Category category);

    /**
     * 通过栏目列出文章
     */
    PagedResult<Article> listByChannel(String channelName);

    /**
     * 列出最近的文章
     */
    PagedResult<Article> listByTime(int limit);

    /**
     * 列出所有的栏目
     */
    PagedResult<Channel> listChannel();

    /**
     * 更新文章
     */
    boolean updateArticle(Article article);

    /**
     * 更新栏目
     */
    boolean updateChannel(Channel channel);

    /**
     * 删除栏目
     */
    boolean deleteChannel(String name);

    /**
     * 根据标题查找文章
     */
    Article findByName(String title);

    /**
     * 根据关键字查找文章
     */
    PagedResult<Article> findByKeyword(String keyword);

}
