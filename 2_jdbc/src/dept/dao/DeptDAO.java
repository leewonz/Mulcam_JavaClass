package dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DeptVo;

public class DeptDAO {

//	public static void main(String[] args) {
//		//insertDept(91, "인사부", "서울");
//		//insertDept(new DeptVo(92, "인사부", "서울"));
//		
//		//DeptVo vo = new DeptVo(92, "인사부", "서울");
//		//vo.setLoc("멀캠");
//		
//		//updateDept(vo);
//		
//		//deleteDept(92);
//		
//		System.out.println(getDept(30).toString());
//		System.out.println("------------");
//		getDeptAll().forEach(i -> {
//			System.out.println(i.toString());
//		});
//		System.out.println("END");
//	}
	
	
	public void insertDept(
			int deptno, String dname, String loc){
		String sql = "insert into dept (deptno, dname, loc) "
				+ "values(?, ?, ?)";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  deptno);
			ps.setString(2,  dname);
			ps.setString(3,  loc);
			
			row = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
	}
	
	public void insertDept(
			DeptVo dept){
		String sql = "insert into dept (deptno, dname, loc) "
				+ "values(?, ?, ?)";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  dept.getDeptno());
			ps.setString(2,  dept.getDname());
			ps.setString(3,  dept.getLoc());
			
			row = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
	}
	
	public void updateDept(
			DeptVo dept){
		String sql = "update dept set loc = ? "
				+ "where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setString(1,  dept.getLoc());
			ps.setInt(2,  dept.getDeptno());

			row = ps.executeUpdate();
			
			System.out.printf("%d개의 행이 영향받음%n", row);
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
	}
	
	public void deleteDept(
			int deptno){
		String sql = "delete from dept "
				+ "where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  deptno);

			row = ps.executeUpdate();
			
			System.out.printf("%d개의 행이 영향받음%n", row);
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
	}
	
	public DeptVo getDept(int deptno){
		String sql = "select * from dept "
				+ "where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DeptVo vo = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  deptno);

			rs = ps.executeQuery();
			
				while(rs.next()) {
					int no = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					
					vo = new DeptVo(no, dname, loc);
				}
			
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return vo;
	}
	
	public List<DeptVo> getDeptAll(){
		List<DeptVo> depts = new ArrayList<DeptVo>();
		
		String sql = "select * from dept ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();
			
				while(rs.next()) {
					int no = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					
					depts.add(new DeptVo(no, dname, loc));
				}
			
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return depts;
	}
}
