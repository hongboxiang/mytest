package com.db.dbOperation;

import com.db.common.DbUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UpdateHandler extends DbOperationHandler{
    @Override
    public String operation(String sql) {
        int updateRow = update(sql);
        return "更新" +  updateRow + "行完成";
    }
    public int update(String sql, Object... params) {
        Connection connection = DbUtil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (params != null)
                for (int i = 0; i < params.length; i++) {
                    preparedStatement.setObject(i + 1, params[i]);
                }
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
