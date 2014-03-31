/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.api;

import com.creditcloud.cms.constant.Category;
import com.creditcloud.cms.model.Article;
import com.creditcloud.cms.model.Channel;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface CMSService {

    /**
     * 保存新的文章
     */
    Article save(String title, String id, String url, String pubdate, String media, String author, String content, Category category, boolean hasImage, boolean priority);

    /**
     * 保存新的栏目
     */
    Channel saveChannel(String name, Category category);

    /**
     * 通过类别列出文章
     */
    PagedResult<Article> listByCategory(Category category, PageInfo pageInfo);

    /**
     * 通过类别列出文章
     */
    Article getBySingle(Category category);

    /**
     * 通过栏目列出文章
     */
    //PagedResult<Article> listByChannel(String channelName, PageInfo pageInfo);

    /**
     * 列出最近的文章
     */
    PagedResult<Article> listByTime(PageInfo pageInfo);

    /**
     * 列出所有的栏目
     */
    PagedResult<Channel> listChannel(PageInfo pageInfo);

    /**
     * 删除栏目
     */
    boolean deleteChannel(String name);

    /**
     * 根据标题查找文章
     */
    Article getByName(String title);

    /**
     * 根据关键字查找文章
     */
    PagedResult<Article> listByKeyword(String keyword, PageInfo pageInfo);

}
