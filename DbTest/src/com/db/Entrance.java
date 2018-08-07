package com.db;

import com.db.common.DbUtil;
import com.db.dbOperation.DbContext;
import com.db.dbOperation.SelectHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * Created on 2018/5/10
 */
public class Entrance {
    public static void main(String[] args) throws SQLException {
        if (testConnection()) return;
        while (true) {
            System.out.println(" ‰»Îsql:");
            Scanner scanner = new Scanner(System.in);
            String sql = scanner.nextLine();
            String result = new DbContext(sql).dbOperation();
            System.out.println(result);
        }
    }

    private static boolean testConnection() throws SQLException {
        Connection connection = DbUtil.getConnection();
        if(connection == null){
            return true;
        }else {
            connection.close();
        }
        return false;
    }
}
