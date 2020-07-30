package book.service;

import java.util.List;

import vo.BookVo;
import book.dao.BookDAO;

public class BookServiceImpl implements BookService {
	
	public int currentId = 1;
	BookDAO bookDAO;
	
	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public BookServiceImpl() {
		super();
	}
	
	@Override
	public BookVo get(String title) {
		return bookDAO.get(title);
	}

	@Override
	public BookVo get(int id) {
		return bookDAO.get(id);
	}

	@Override
	public List<BookVo> getAll() {
		return bookDAO.getAll();
	}

	@Override
	public int insert(BookVo bookVo) {
		//bookVo.setId(currentId++);
		return bookDAO.insert(bookVo);
	}

	@Override
	public int update(int id, BookVo bookVo) {
		return bookDAO.update(id, bookVo);
	}

	@Override
	public int delete(String title) {
		return bookDAO.delete(title);
	}

	@Override
	public int delete(int id) {
		return bookDAO.delete(id);
	}

}
