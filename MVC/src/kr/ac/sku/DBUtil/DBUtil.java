package kr.ac.sku.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() throws Exception
	{

		String url = "jdbc:oracle:thin:@localhost:49172:XE";
		String user = "sku";
		String password = "sku";
		
		return getConnection(url, user, password);
		
	}
	
	
	public static Connection getConnection(String url, String user, String password) throws Exception
	{
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn= DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs)
	{
		
		if(rs !=null ){
			try {

				rs.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		}	
		close(conn, ps);
	}
	public static void close(Connection conn, PreparedStatement ps)
	{
		if(ps !=null ){
			try {

				conn.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

