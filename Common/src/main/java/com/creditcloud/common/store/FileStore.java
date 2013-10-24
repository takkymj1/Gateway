/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.store;

import com.creditcloud.model.enums.Realm;
import java.io.InputStream;

/**
 * 只用来存取文件
 *
 * @author rooseek
 *
 * @see ImageStore
 */
public interface FileStore {

    /**
     * store a file by file path
     *
     * @param clientCode
     * @param realm
     * @param fileName
     * @param filePath
     * @return
     */
    boolean store(String clientCode, Realm realm, String fileName, String filePath);

    /**
     * store a file by input stream
     *
     * @param clientCode
     * @param realm
     * @param fileName
     * @param fileStream
     * @return
     */
    boolean store(String clientCode, Realm realm, String fileName, InputStream fileStream);

    /**
     * get file uri
     *
     * @param clientCode
     * @param realm
     * @param fileName
     * @return
     */
    String getURI(String clientCode, Realm realm, String fileName);

    /**
     * delete and file
     *
     * @param clientCode
     * @param realm
     * @param fileName
     * @return
     */
    boolean delete(String clientCode, Realm realm, String fileName);
}
