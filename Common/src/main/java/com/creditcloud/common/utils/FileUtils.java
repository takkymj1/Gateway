/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import com.creditcloud.model.misc.RealmEntity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author rooseek
 */
public class FileUtils {

    private static final Logger logger = Logger.getLogger(FileUtils.class.getName());

    /**
     * write input stream to a local file
     *
     * @param inputStream
     * @param filPath
     */
    public static void writeToFile(InputStream inputStream,
                                   String filPath) {
        OutputStream out = null;
        try {
            out = new FileOutputStream(new File(filPath));
            int read;
            byte[] bytes = new byte[4096];
            while ((read = inputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (out != null) {
                    out.close();
                    out = null;
                }
            } catch (IOException ex) {
                logger.log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * generate md5 hash for the file
     *
     * @param clientCode
     * @param owner
     * @param fileName
     * @return
     */
    public static String hash(String clientCode, RealmEntity owner, String fileName) {
        String str = clientCode.concat(owner.getEntityId()).concat(fileName);
        return DigestUtils.md5Hex(str);
    }
}
