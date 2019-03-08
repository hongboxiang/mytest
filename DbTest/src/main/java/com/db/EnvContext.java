package com.db;

import java.io.IOException;

/**
 * Created on 2018/5/9
 */
public class EnvContext {
    private static EnvContext ourInstance = new EnvContext();
    private DbBean dbBean;

    public static EnvContext getInstance() {
        return ourInstance;
    }

    private EnvContext() {
        try {
            dbBean = new EnvParser().load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DbBean getDbBean() {
        return dbBean;
    }
}
