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

    String id;

    String title;

    String content;

    Category category;

    boolean hasImage;

    boolean isDisplay;

    boolean priority;

    Date timeCreated;

    private String newsId;

    private String url;

    private String pubdate;

    private String media;

    private String author;

    private String snap;
}
