package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args) {
		//별도의 환경설정 파일에 저장해야 함
		String driver="oracle.jdbc.driver.OracleDriver";
//		String url="jdbc:oracle:thin:@70.12.113.179:1521:xe";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="hr";
		String pw="hr";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int row = 0;
		
		String sql = "select * from dept";
		
		//1. 드라이버 로딩
		try {
			Class.forName(driver); // 클래스 동적
			//2. 커넥션
			con = DriverManager.getConnection(url, user, pw);
			System.out.println(con);
			//3. 스테잇먼트
			st = con.createStatement();
			//4. 실행
			rs = st.executeQuery(sql);
			//5. 결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getString("Loc")+"\t");
				System.out.print(rs.getString("Dname")+"\t");
				System.out.print(rs.getString("Deptno")+"\n");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 확인하세요 ^^;;");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//6. 자원 반납
			try {
				if(rs!=null) {rs.close();}
				if(st!=null) {st.close();}
				if(con!=null) {con.close();}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("App End");
	}

}
