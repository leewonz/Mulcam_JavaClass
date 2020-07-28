package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {

	public static void main(String[] args) {
		
		Connection con = JDBCUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		int row = 0;
		
		//String sql = "select * from emp";
		String sql = "select * from emp where upper(JOB) = ?";
		
		//1. 드라이버 로딩
		try {
			//3. 스테잇먼트
			st = con.prepareStatement(sql);
			//4. 실행
			rs = st.executeQuery(sql);
			//5. 결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getString("EMPNO") + "\t");
				System.out.print(rs.getString("ENAME") + "\t");
				System.out.print(rs.getString("JOB") + "\t");
				System.out.print(rs.getString("MGR") + "\t");
				System.out.print(rs.getString("HIREDATE") + "\t");
				System.out.print(rs.getString("SAL") + "\t");
				System.out.print(rs.getString("COMM") + "\t");
				System.out.print(rs.getString("DEPTNO") + "\t");
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			//6. 자원 반납
			JDBCUtil.close(con, st, rs);
		}
		System.out.println("App End");
	}

}
