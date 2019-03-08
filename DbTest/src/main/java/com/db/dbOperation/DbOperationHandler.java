package com.db.dbOperation;

import com.db.DbBean;
import com.db.EnvContext;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created on 2018/5/10
 */
public abstract class DbOperationHandler {

    public abstract String operation(String sql);
}
