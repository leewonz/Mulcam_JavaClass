package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select ename,job,deptno,sal+nvl(comm,0) 총급여 "
				+ "from emp "
				+ "where deptno=? or deptno=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1, 20);
			ps.setInt(2, 30);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("ENAME") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("총급여") + "\n");
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
