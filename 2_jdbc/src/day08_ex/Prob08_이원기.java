package day08_ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Prob08_이원기 {

	public static void main(String[] args) {
		System.out.println("------------------------");
		show(10);
		show(20);
		show(30);
		show(40);
		show(50);
		System.out.println("------------------------");
		show2(1980);
		System.out.println("------------------------");
		show2(1981);
		System.out.println("------------------------");
		show2(1982);
		System.out.println("------------------------");
	}
	
	static void show(int deptno) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select nvl(avg(SAL),0) 평균급여 from emp where DEPTNO = ?";
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, deptno);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				//System.out.print(rs.getString("평균급여") + "\t");
				System.out.printf("%.4f\n", rs.getFloat("평균급여"));
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
	
	static void show2(int hiredate) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select e.ENAME e_ename, e.HIREDATE e_hiredate, e.EMPNO e_empno, m.ENAME m_ename "
				+ "from emp e, emp m "
				+ "where (e.MGR = m.EMPNO and extract(year from e.HIREDATE) = ?)";
		//System.out.println(sql);
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, hiredate);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("e_ename") + "\t");
				System.out.print(rs.getString("e_hiredate") + "\t");
				System.out.print(rs.getString("e_empno") + "\t");
				System.out.print(rs.getString("m_ename") + "\n");

			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}


