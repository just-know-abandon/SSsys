package com.lhj.sql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.lang.Class.forName;


public class UpdateSqlXml {
    private static String databaseName = "studentshome";

    public static void main(String[] args) {
        sqlXmlTxt();
    }

    //查询数据库所有的表明并配置到generatorConfig.xml中
    public static void sqlXmlTxt() {
        try {
            String re = "";
            forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + databaseName + "?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";
            String userName = "";
            String password = "";
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery("select table_name from information_schema.tables where table_schema='"+databaseName+"' and table_type='base table';");
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String Name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
                re = re + " <table tableName=\"" + name + "\" domainObjectName=\"" + Name + "\" enableSelectByExample=\"true\" enableDeleteByExample=\"true\"\n" +
                        "enableCountByExample=\"true\" enableUpdateByExample=\"true\"\n" +
                        "delimitIdentifiers=\"true\"/>\n";
            }
            FileWriter f_writer = new FileWriter("E:\\test\\sql.txt");
            BufferedWriter writer = new BufferedWriter(f_writer);
            writer.write(re);
            writer.close();
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
