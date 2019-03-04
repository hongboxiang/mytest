package com.dirmanage.context;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.dirmanage.common.DirConst.DIR_PROP;

/**
 * Created on 2019/3/2
 */
@Slf4j
public class DirLoader {

    public static final String SAVE_DIR = "saveDir";

    public static void load(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(DIR_PROP);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            DirContext.getInstance().setSaveDir(properties.getProperty(SAVE_DIR));
        } catch (IOException e) {
            log.error("load failed",e);
        }

    }

}
