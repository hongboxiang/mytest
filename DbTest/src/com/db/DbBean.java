package com.db;

/**
 * Created on 2018/5/9
 */
public class DbBean {
    /**
     * Oracle数据库连接URL
     */
    private String dbUrl ;
    /**
     * Oracle数据库连接驱动
     */
    private String dbDriver;
    /**
     * 数据库用户名
     */
    private String dbUsername;
    /**
     * 数据库密码
     */
    private String dbPassword;

    public DbBean(String dbUrl, String dbDriver, String dbUsername, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbDriver = dbDriver;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
