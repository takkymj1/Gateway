/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.model;

import com.creditcloud.cms.enums.Category;
import com.creditcloud.model.BaseObject;
import java.beans.Transient;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class Article extends BaseObject {

    private static final long serialVersionUID = 20140430L;

    /**
     * 新闻主键
     */
    private String id;

    /**
     * 频道
     */
    @NotNull
    private String channelId;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻分类
     */
    @NotNull
    private Category category;

    /**
     * 新闻是否含有图片
     */
    private boolean hasImage;

    /**
     * 新闻是否优先显示
     */
    private boolean priority;

    /**
     * 新闻ID
     */
    private String newsId;

    /**
     * 新闻url
     */
    private String url;

    /**
     * 新闻发布日期
     */
    private Date pubDate;

    /**
     * 新闻发布媒体
     */
    private String media;

    /**
     * 新闻作者
     */
    private String author;

    private Date timeRecorded;
    
    /**
     * 主要用于页面显示,如上一篇文章链接
     */
    private String previous;
    
    /**
     * 主要用于页面显示,如下一篇文章链接
     */
    private String next;
    
    /**
     * 主要用于页面显示，如首页或上级目录
     */
    private String parent;
    
    /**
     * background color
     */
    private String bgColor;

    public Article(String id,
                   String channelId,
                   String title,
                   String content,
                   Category category,
                   boolean hasImage,
                   boolean priority,
                   String newsId,
                   String url,
                   Date pubDate,
                   String media,
                   String author) {
        this.id = id;
        this.channelId = channelId;
        this.title = title;
        this.content = content;
        this.category = category;
        this.hasImage = hasImage;
        this.priority = priority;
        this.newsId = newsId;
        this.url = url;
        this.pubDate = pubDate;
        this.media = media;
        this.author = author;
    }
}
