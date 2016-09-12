package sku.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws Exception{
		
		String url="jdbc:oracle:thin:@localhost:49169:XE"; 
		String user="sku";
		String password="sku";
		
		return getConnection(url , user ,password );
	}
	
	public static Connection getConnection(String url , String user ,String password)  throws Exception {
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,user,password);
		return conn;
		
	}
	
	public static void close(Connection conn ,PreparedStatement ps , ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		close(conn,ps);
	}
	 public static void close(Connection conn, PreparedStatement ps){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ps!=null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	 }
}
