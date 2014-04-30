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
     * @return
     */
    List<Channel> listAllChannel();

    /**
     * 删除栏目
     *
     * @param name
     * @return
     */
    boolean deleteChannelByName(String name);

    /**
     * 根据主键删除栏目
     *
     * @param id
     * @return
     */
    boolean deleteChannelById(String id);

    /**
     * 根据主键获取一个栏目
     *
     * @param id
     * @return
     */
    Channel getChannelById(String id);

    /**
     * 保存新的栏目
     *
     * @param channel
     * @return
     */
    Channel saveChannel(Channel channel);

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
    Article getArticleByTitle(String title);

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
    PagedResult<Article> listArticleByKeyword(String keyword, PageInfo pageInfo);

    /**
     * 通过类别列出文章
     *
     * @param category
     * @param pageInfo
     * @return
     */
    PagedResult<Article> listArticleByCategory(Category category, PageInfo pageInfo);

    /**
     * 根据主键删除一篇文章
     *
     * @param id
     * @return 
     */
    public boolean deleteArticleById(String id);

    /**
     * 创建或更新文章
     * <p>
     * 更新成功之后返回更新成功的文章
     *
     * @param article
     * @return
     */
    public Article saveArticle(Article article);
}
