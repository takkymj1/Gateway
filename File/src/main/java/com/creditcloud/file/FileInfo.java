/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.file;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.FileConstant;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class FileInfo extends BaseObject {

    private static final long serialVersionUID = 20131024L;

    /**
     * 文件名<p>
     * <b>注意!是原文件名，而不是存储时重命名的文件名<b>
     */
    private String fileName;

    /*
     * 文件唯一uri
     */
    private String uri;

    public FileInfo() {
    }

    public FileInfo(String fileName, String uri) {
        this.fileName = fileName;
        this.uri = uri;
    }

    public String getFileName() {
        return fileName;
    }

    public String getUri() {
        return uri;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * check whether uri is valid for a file
     *
     * @return
     */
    public boolean isValidUri() {
        return uri != null && !FileConstant.FILE_NOT_FOUND_URI.equals(uri);
    }
}
