package book.service;

import java.util.List;

import vo.BookVo;

public interface BookService {
//get, getAll, insert, delete, update
	public BookVo get(String title);
	public BookVo get(int id);
	
	public List<BookVo> getAll();
	
	public int insert(BookVo bookVo);
	
	public int update(int id, BookVo bookVo);
	
	public int delete(String title);
	public int delete(int id);
}
