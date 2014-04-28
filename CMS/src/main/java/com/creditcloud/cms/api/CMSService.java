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
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface CMSService {

    //**********************************关于栏目的API***********************************
    /**
     * 列出所有的栏目
     *
     * @param pageInfo
     * @return
     */
    PagedResult<Channel> listChannel(PageInfo pageInfo);

    /**
     * 删除栏目
     *
     * @param name
     * @return
     */
    boolean deleteChannel(String name);

    /**
     * 根据主键删除栏目
     *
     * @param id
     * @return
     */
    boolean deleteChannelById(String id);

    /**
     * 更新栏目
     * <p>
     * 更新之后返回新的数据
     *
     * @param channel
     * @return
     */
    public Channel updateChannel(Channel channel);

    /**
     * 根据主键获取一个栏目
     *
     * @param id
     * @return
     */
    public Channel getChannelById(String id);

    /**
     * 保存新的栏目
     *
     * @param name
     * @param category
     * @return
     */
    Channel saveChannel(String name, Category category);

    /**
     * 通过列出一个类别下的所有栏目
     *
     * @param category
     * @return
     */
    List<Channel> listChannelByCategory(Category category);

    //**********************************************关于文章的API***********************************
    /**
     * 根据标题查找文章
     *
     * @param title
     * @return
     */
    Article getByName(String title);

    /**
     * 根据文章Id获取文章
     *
     * @param id
     * @return
     */
    Article getArticleById(String id);

    /**
     * 根据关键字查找文章
     *
     * @param keyword
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listByKeyword(String keyword, PageInfo pageInfo);

    /**
     * 通过类别列出文章
     *
     * @param category
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listByCategory(Category category, PageInfo pageInfo);

    /**
     * 通过类别列出文章
     *
     * @param category
     * @return
     */
    Article getBySingle(Category category);

    /**
     * 通过栏目列出文章
     */
    //PagedResult<Article> listByChannel(String channelName, PageInfo pageInfo);
    /**
     * 列出最近的文章
     *
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listByTime(PageInfo pageInfo);

    /**
     * 创建新的文章
     *
     * @param title
     * @param url
     * @param pubdate
     * @param newsId
     * @param media
     * @param author
     * @param content
     * @param category
     * @param hasImage
     * @param priority
     * @return
     */
    Article createArticle(String title, String url, String pubdate, String newsId, String media, String author, String content, Category category, boolean hasImage, boolean priority);

    /**
     * 根据主键删除一篇文章
     *
     * @param id
     * @return
     */
    public boolean deleteArticleById(String id);

    /**
     * 更新文章
     * <p>
     * 更新成功之后返回更新成功的文章
     *
     * @param article
     * @return
     */
    public Article updateArticle(Article article);
}
