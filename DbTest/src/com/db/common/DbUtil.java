package com.db.common;

import com.db.DbBean;
import com.db.EnvContext;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created on 2018/5/10
 */
public class DbUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            DbBean dbBean = EnvContext.getInstance().getDbBean();
            Class.forName(dbBean.getDbDriver());
            conn = DriverManager.getConnection(dbBean.getDbUrl(), dbBean.getDbUsername(), dbBean.getDbPassword());
        } catch (Exception ex) {
            System.out.println("数据库连接失败，配的不对");
        }
        return conn;
    }
}
