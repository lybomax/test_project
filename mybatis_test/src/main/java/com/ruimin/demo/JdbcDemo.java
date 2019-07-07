package com.ruimin.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @class: JdbcDemo
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LYY
 * @date: 2019年07月01日 14:45
 * @since: 1.0.0
 */
public class JdbcDemo {

  public static void main(String[] args) throws Exception {
    //加载驱动
    Class.forName("com.mysql.jdbc.Driver");
    //获取连接
    String url = "demo:mysql://127.0.0.1:3306/mybatis";
    String user = "root";
    String password = "1234";
    Connection conn = DriverManager.getConnection(url, user, password);

    //获取语句对象
    String sql = "select * from tb_user where id=?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setLong(1, 1L);
    //发送sql语句  获取结果
    ResultSet rs = ps.executeQuery();
    //处理结果
    while (rs.next()) {
      System.out.println(rs.getString("user_name"));
      System.out.println(rs.getString("name"));
      System.out.println(rs.getInt("age"));
    }

    //释放资源
    if (rs != null) {
      rs.close();
    }
    if (ps != null) {
      ps.close();
    }
    if (conn != null) {
      conn.close();
    }

  }

}
