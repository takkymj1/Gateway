/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.api;

import com.creditcloud.cms.enums.Category;
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
     * @param clientCode
     * @return
     */
    List<Channel> listAllChannel(String clientCode);

    /**
     * 删除栏目
     *
     * @param clientCode
     * @param name
     * @return
     */
    boolean deleteChannelByName(String clientCode, String name);

    /**
     * 根据主键删除栏目
     *
     * @param clientCode
     * @param id
     * @return
     */
    boolean deleteChannelById(String clientCode, String id);

    /**
     * 根据主键获取一个栏目
     *
     * @param clientCode
     * @param id
     * @return
     */
    Channel getChannelById(String clientCode, String id);

    /**
     * 保存新的栏目
     *
     * @param clientCode
     * @param channel
     * @return
     */
    Channel saveChannel(String clientCode, Channel channel);

    /**
     * 通过列出一个类别下的所有栏目
     *
     * @param clientCode
     * @param category
     * @return
     */
    List<Channel> listChannelByCategory(String clientCode, Category category);

    //**********************************************关于文章的API***********************************
    /**
     * 根据标题查找文章
     *
     * @param clientCode
     * @param title
     * @return
     */
    Article getArticleByTitle(String clientCode, String title);

    /**
     * 根据文章Id获取文章
     *
     * @param clientCode
     * @param id
     * @return
     */
    Article getArticleById(String clientCode, String id);

    /**
     * 根据关键字查找文章
     *
     * @param clientCode
     * @param keyword
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listArticleByKeyword(String clientCode, String keyword, PageInfo pageInfo);

    /**
     * 通过类别列出文章
     *
     * @param clientCode
     * @param category
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listArticleByCategory(String clientCode, Category category, PageInfo pageInfo);

    /**
     * 根据主键删除一篇文章
     *
     * @param clientCode
     * @param id
     * @return
     */
    public boolean deleteArticleById(String clientCode, String id);

    /**
     * 创建或更新文章
     * <p>
     * 更新成功之后返回更新成功的文章
     *
     * @param clientCode
     * @param article
     * @return
     */
    public Article saveArticle(String clientCode, Article article);
}
