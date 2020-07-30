package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

import vo.BookVo;
import vo.DeptVo;

public class BookDAO {
	public int insert(BookVo bookVo) {
		String sql = "insert into book (book_id, title, author, price) "
				+ "values(?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  bookVo.getId());
			ps.setString(2,  bookVo.getTitle());
			ps.setString(3,  bookVo.getAuthor());
			ps.setInt(4,  bookVo.getPrice());
			row = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return row;
	}
	
	public int delete(
			int id){
		String sql = "delete from book "
				+ "where book_id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1, id);

			row = ps.executeUpdate();
			
			System.out.printf("%d개의 행이 영향받음%n", row);
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return row;
	}
	
	public int delete(
			String title){
		String sql = "delete from book "
				+ "where title = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setString(1, title);

			row = ps.executeUpdate();
			
			System.out.printf("%d개의 행이 영향받음%n", row);
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return row;
	}
	
	public int update(
			int id, BookVo bookVo){
		String sql = "update book set title = ?, author = ?, price = ? "
				+ "where book_id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setString(1,  bookVo.getTitle());
			ps.setString(2,  bookVo.getAuthor());
			ps.setInt(3,  bookVo.getPrice());
			ps.setInt(4,  id);

			row = ps.executeUpdate();
			
			System.out.printf("%d개의 행이 영향받음%n", row);
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return row;
	}
	
	public BookVo get(int id){
		String sql = "select * from book "
				+ "where id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BookVo vo = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setInt(1,  id);

			rs = ps.executeQuery();
			
				while(rs.next()) {
					int book_id = rs.getInt("book_id");
					String book_title = rs.getString("title");
					String author = rs.getString("author");
					int price = rs.getInt("price");
					
					vo = new BookVo(book_id, book_title, author, price);
				}
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return vo;
	}
	
	public BookVo get(String title){
		String sql = "select * from book "
				+ "where title like ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BookVo vo = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			ps.setString(1, "%"+title+"%");

			rs = ps.executeQuery();
			
				while(rs.next()) {
					int book_id = rs.getInt("book_id");
					String book_title = rs.getString("title");
					String author = rs.getString("author");
					int price = rs.getInt("price");
					
					vo = new BookVo(book_id, book_title, author, price);
				}
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return vo;
	}
	
	public List<BookVo> getAll(){
		String sql = "select * from book ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BookVo> voList = new ArrayList<BookVo>();
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();
			
				while(rs.next()) {
					int book_id = rs.getInt("book_id");
					String book_title = rs.getString("title");
					String author = rs.getString("author");
					int price = rs.getInt("price");
					
					voList.add(new BookVo(
							book_id, book_title, author, price));
				}
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return voList;
	}
	
	private int executeQuery(String sql, List<Object> args) {

		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			//?세팅작업
			JDBCUtil.setList(ps, args);
			
			row = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return row;
	}
}
