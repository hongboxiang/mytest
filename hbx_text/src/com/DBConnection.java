package com;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DBConnection {
    /**
     * Oracle数据库连接URL
     */
    private final static String DB_URL = "jdbc:oracle:thin:@10.92.243.27:1521:lteems";

    /**
     * Oracle数据库连接驱动
     */
    private final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";

    /**
     * 数据库用户名
     */
    private final static String DB_USERNAME = "ommb";

    /**
     * 数据库密码
     */
    private final static String DB_PASSWORD = "U_tywg_2008";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
//        for (List row : new DBConnection().getList("update LTE_EUTRANCELLTDDLTE set flagSwiMode=1 where subnetwork='1119' and meid='111993'")) {
        for (List row : new DBConnection().getList("DECLARE num NUMBER;BEGIN select count(*) into num from user_tables where table_name = lte_utranrelationtddlt_f_v1;IF num > 0 THEN   select count(*) as RELATEIONSUM from (select * from icm_common.Icm_Neinfo_Live neinfo, icm_common.icm_ra_version ra where neinfo.emsid =3754981441371 and neinfo.version = ra.ppuversion) e, ommb.lte_utranrelationtddlt_f_v1 ralation where (e.subnetid = ralation.subnetwork and e.neid = ralation.meid);END IF;END;"
        )) {
            System.out.println(row);
        }
    }

    public List<List<Object>> getList(String sql, Object... params) {
        Connection connection = getConnection();
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
        return listData;
    }
}
