package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	
	
	public static Connection getConnection() {
		
		String driver="oracle.jdbc.driver.OracleDriver";
//		String url="jdbc:oracle:thin:@70.12.113.179:1521:xe";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="hr";
		String pw="hr";
		
		Connection con = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName(driver); // 클래스 동적
			//2. 커넥션
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 확인하세요 ^^;;");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){

		}
		
		return con;
	}
	
	public static void close(Connection con, Statement st, ResultSet rs) {
		//6. 자원 반납
		try {
			if(rs!=null) {rs.close();}
			if(st!=null) {st.close();}
			if(con!=null) {con.close();}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
