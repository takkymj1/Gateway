/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.cms.model;

import com.creditcloud.cms.enums.Category;
import com.creditcloud.model.BaseObject;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BaseObject {

    private static final long serialVersionUID = 20140430L;

    /**
     * 新闻主键
     */
    private String id;

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
     * 新闻创建时间
     */
    private Date timeRecorded;

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
    
    
}
