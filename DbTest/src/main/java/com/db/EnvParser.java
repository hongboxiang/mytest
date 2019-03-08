package com.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.db.common.DbConst.*;

/**
 * Created on 2018/5/9
 */
public class EnvParser {

    public DbBean load() throws IOException {
        File propFile = new File(System.getProperty("user.dir") + File.separator + "DbTest" + File.separator + "conf" + File.separator + ENV_FILE_NAME);
        if (propFile.exists()) {
            FileInputStream inputStream = new FileInputStream(propFile);
            Properties properties = new Properties();
            properties.load(inputStream);

            String ip = properties.getProperty(DB_IP);
            String sid = properties.getProperty(DB_SID);
            String dbUrl = DB_URL.replace(DB_IP, ip).replace(DB_SID, sid);
            String username = properties.getProperty(DB_USERNAME);
            String password = properties.getProperty(DB_PASSWORD);
            return new DbBean(dbUrl, DB_DRIVER, username, password);
        }
        return null;
    }

}
