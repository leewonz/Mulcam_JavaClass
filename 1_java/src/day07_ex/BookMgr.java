package day07_ex;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMgr {
	List<Book> bookList;
	
	public BookMgr() {
		bookList = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		bookList.add(book);
	}
	
	public boolean remove(String title) {
		return bookList.remove(new Book(title, 0));
	}
	
	public boolean update(String oldTitle, String newTitle, int price) {
		Iterator<Book> ib = bookList.iterator();
		boolean flag = false;
		if (ib != null) {
			while(ib.hasNext()) {
				Book cBook = ib.next();
				if(cBook.equals(new Book(oldTitle, 0))) {
					flag = true;
					cBook.setTitle(newTitle);
					cBook.setPrice(price);
					break;
				}
			}
		}
		return flag;
	}
	
	public boolean search(String title) {
		Iterator<Book> ib = bookList.iterator();
		boolean flag = false;
		if (ib != null) {
			while(ib.hasNext()) {
				Book cBook = ib.next();
				if(cBook.equals(new Book(title, 0))) {
					flag = true;
					System.out.println(cBook.toString());
				}
			}
		}
		return flag;
	}

	@Override
	public String toString() {
		Iterator<Book> ib = bookList.iterator();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if (ib != null) {
			while(ib.hasNext()) {
				Book cBook = ib.next();
				sb.append(cBook);
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	
}
