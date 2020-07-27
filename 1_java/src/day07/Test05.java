package day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import util.Util;

public class Test05 {

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<String>();
		set1.add("hello");
		set1.add("java");
		set1.add("....");
		set1.add("java");
		Util.listPrint(set1);
		
		Set<Book> books = new HashSet<Book>();
		books.add(new Book("java", 7700));
		books.add(new Book("jsp", 7700));
		books.add(new Book("spring", 7700));
		books.add(new Book("html5", 7700));
		books.add(new Book("jsp", 7700));
		Util.listPrint(books);
		
		//"Java"검색
		Iterator<Book> ib = books.iterator();
		String key = "Java";
		while(ib.hasNext()) {
			Book book = (Book) ib.next();
			if(book.getTitle().equalsIgnoreCase(key)) {
				System.out.println("검색결과");
				System.out.println(book);
			}
		}
		
	}

}
