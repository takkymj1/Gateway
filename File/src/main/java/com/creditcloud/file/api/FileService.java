/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.file.api;

import com.creditcloud.file.FileInfo;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FileService {

    /**
     * upload file by filepath,overwrite if fileName under owner already exist
     *
     * @param clientCode
     * @param owner
     * @param fileName
     * @param filePath
     * @return
     */
    FileInfo upload(String clientCode,
                    RealmEntity owner,
                    String fileName,
                    String filePath);

    /**
     * add a new file info for a file, the file must have already been stored
     * somewhere
     *
     * @param clientCode
     * @param owner
     * @param fileName
     * @return
     */
    boolean addNew(String clientCode,
                   RealmEntity owner,
                   String fileName);

    /**
     * download the file info for a file
     *
     * @param clientCode
     * @param owner
     * @param fileName
     * @return
     */
    FileInfo download(String clientCode,
                      RealmEntity owner,
                      String fileName);

    /**
     * list file by owner
     *
     * @param clientCode
     * @param owner
     * @param info
     * @return
     */
    PagedResult<FileInfo> list(String clientCode,
                               RealmEntity owner,
                               PageInfo info);

    /**
     * delete a file
     *
     * @param clientCode
     * @param owner
     * @param fileName
     * @return
     */
    boolean delete(String clientCode,
                   RealmEntity owner,
                   String fileName);

    /**
     * delete all file related to owner
     *
     * @param clientCode
     * @param owner
     * @return
     */
    boolean delete(String clientCode, RealmEntity owner);
}
