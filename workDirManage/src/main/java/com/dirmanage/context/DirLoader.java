package com.dirmanage.context;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static com.dirmanage.common.DirConst.DIR_PROP;

/**
 * Created on 2019/3/2
 */
@Slf4j
public class DirLoader {

    public static final String SAVE_DIR = "saveDir";
    public static final String DELETE_DIR = "deleteDir";
    public static final String HOUR_OF_DAY = "hour_of_day";

    public static void load(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(DIR_PROP);
            File file = new File("./");
            file.getAbsoluteFile();
            Properties properties = new Properties();
            properties.load(fileInputStream);
            DirContext.saveDir = properties.getProperty(SAVE_DIR);
            DirContext.deleteDir = properties.getProperty(DELETE_DIR);
            DirContext.hourOfDay = Integer.valueOf(properties.getProperty(HOUR_OF_DAY));
        } catch (IOException e) {
            log.error("load failed",e);
        }

    }

}
