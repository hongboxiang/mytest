package com.db;

/**
 * Created on 2018/5/9
 */
public class DbBean {
    /**
     * Oracle���ݿ�����URL
     */
    private String dbUrl ;
    /**
     * Oracle���ݿ���������
     */
    private String dbDriver;
    /**
     * ���ݿ��û���
     */
    private String dbUsername;
    /**
     * ���ݿ�����
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
