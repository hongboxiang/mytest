package com.db.dbOperation;

import com.db.DbBean;
import com.db.EnvContext;
import com.db.common.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SelectHandler extends DbOperationHandler{
    @Override
    public String operation(String sql) {
        for (List row : new SelectHandler().getList(sql)) {
            System.out.println(row);
        }
        return "²éÑ¯Íê³É";
    }
    public List<List<Object>> getList(String sql, Object... params) {
        Connection connection = DbUtil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<List<Object>> listData = new LinkedList<List<Object>>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (params != null)
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i + 1, params[i]);
                }
//            preparedStatement.executeUpdate();
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            List<Object> rowDateName = new LinkedList<Object>();
            int columnCount = metaData.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                rowDateName.add(metaData.getColumnName(i+1));
            }
            listData.add(rowDateName);
            while (resultSet.next()) {
                List<Object> rowDate = new LinkedList<Object>();
                for (int i = 0; i < columnCount; i++) {
                    rowDate.add(resultSet.getObject(i+1));
                }
                listData.add(rowDate);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if(resultSet !=null) {
                    resultSet.close();
                }
                if(preparedStatement !=null) {
                    preparedStatement.close();
                }
                if(connection !=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listData;
    }
}
