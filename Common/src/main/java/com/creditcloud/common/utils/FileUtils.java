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
import org.apache.commons.lang3.StringUtils;

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
     * @param filePath
     */
    public static void writeToFile(InputStream inputStream,
                                   String filePath) {
        OutputStream out = null;
        try {
            out = new FileOutputStream(new File(filePath));
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
        //保存文件后缀，使得pdf类文件可以直接在浏览器打开
        String hash = DigestUtils.md5Hex(str);
        hash = hash.concat(fileSuffix(fileName));
        return hash;
    }

    /**
     * 返回文件后缀,如".pdf"
     *
     * @param fileName
     * @return
     */
    public static String fileSuffix(String fileName) {
        int index = StringUtils.lastIndexOf(fileName, ".");
        if (index != -1) {
            String suffix = fileName.substring(index);
            return suffix;
        }
        return "";
    }
}
