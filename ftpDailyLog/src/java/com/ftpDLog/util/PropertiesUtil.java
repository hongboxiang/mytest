package com.ftpDLog.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.zte.exception.ApplicationException;
import com.zte.tool.RcdCmpDialog;


public class PropertiesUtil {
    public final static String IP = "IP";
    public final static String PORT = "PORT";
    public final static String USERNAME = "USERNAME";
    public final static String PASSWORD = "PASSWORD";
    public final static String FTPTYPE = "FTPTYPE";
    private final static String PRO_NAME = "/com/ftpDLog/ftpconfig.properties";
    private static Properties properties = null;

    private static Properties getProperties(){
        properties = new Properties();
        InputStream fis = null;
        try {
            fis = PropertiesUtil.class.getResourceAsStream(PRO_NAME);
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        }
        return properties;
    }

    public static String getKeyValue(String key){
        getProperties();
        return properties.getProperty(key);
    }
}
