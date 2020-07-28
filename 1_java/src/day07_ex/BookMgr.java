package day07_ex;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMgr {
	List<Book> bookList;
	
	public BookMgr() {
		bookList = new ArrayList<Book>();
	}
	
	public BookMgr(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book book) {
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
	
	public boolean searchTitle(String title) {
		Iterator<Book> ib = bookList.iterator();
		boolean flag = false;
		if (ib != null) {
			while(ib.hasNext()) {
				Book cBook = ib.next();
				if(cBook.getTitle().toUpperCase().contains(
						title.toUpperCase())) {
					flag = true;
					System.out.println(cBook.toString());
				}
			}
		}
		return flag;
	}
	
	public boolean checkTitle(String title) {
		Iterator<Book> ib = bookList.iterator();
		boolean flag = false;
		if (ib != null) {
			while(ib.hasNext()) {
				Book cBook = ib.next();
				if(cBook.getTitle().toUpperCase().equals(
						title.toUpperCase())) {
					flag = true;
					System.out.println(cBook.toString());
					break;
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
	
	public void bookListPrint() {
		System.out.println("======booklist======");
		bookList.forEach(i -> System.out.println(i));
		System.out.println("====================");
	}
	
}
