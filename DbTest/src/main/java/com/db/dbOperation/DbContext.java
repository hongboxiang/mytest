package com.db.dbOperation;

/**
 * Created on 2018/5/10
 */
public class DbContext {
    private final String sql;
    DbOperationHandler dbOperationHandler = null;

    public DbContext(String sql) {
        this.sql = sql;
        if (sql == null || sql.isEmpty());

        if (sql.startsWith("select")){
            dbOperationHandler = new SelectHandler();
        }else if(sql.startsWith("update")){
            dbOperationHandler = new UpdateHandler();
        }else if(sql.startsWith("delete")){
        }else{
        }
    }

    public String dbOperation(){
        if(dbOperationHandler == null){
            return "格式不对，重输！";
        }
        return dbOperationHandler.operation(sql);
    }
}
