/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.model;

import com.creditcloud.cms.constant.Category;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class Article {

    /**
     * 新闻主键
     */
    String id;

    /**
     * 新闻标题
     */
    String title;

    /**
     * 新闻内容
     */
    String content;

    /**
     * 新闻分类
     */
    Category category;

    /**
     * 新闻是否含有图片
     */
    boolean hasImage;

    /**
     * 新闻是否优先显示
     */
    boolean priority;

    /**
     * 新闻建立时间
     */
    Date timeCreated;

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
    private String pubdate;

    /**
     * 新闻发布媒体
     */
    private String media;

    /**
     * 新闻作者
     */
    private String author;
    
    public Article(String id, String title, String content, Category category, boolean hasImage, boolean priority, String newsId, String url, String pubdate, String media, String author ){
        this.id=id;
        this.title=title;
        this.content=content;
        this.category=category;
        this.hasImage=hasImage;
        this.priority =priority;
        this.newsId=newsId;
        this.url=url;
        this.pubdate=pubdate;
        this.media=media;
        this.author=author;
        
    }

}
