/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rooseek
 */
public class FileUtils {

    private static final Logger logger = Logger.getLogger(FileUtils.class.getName());

    /**
     * write image stream to a local file
     *
     * @param uploadedInputStream
     * @param uploadedFileLocation
     */
    public static void writeToFile(InputStream imageStream,
                                   String filPath) {
        OutputStream out = null;
        try {
            out = new FileOutputStream(new File(filPath));
            int read;
            byte[] bytes = new byte[1024];
            while ((read = imageStream.read(bytes)) != -1) {
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
}
