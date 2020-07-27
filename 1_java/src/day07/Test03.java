package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import util.Util;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("spring", 39900));
		bookList.add(new Book("java", 19900));
		bookList.add(new Book("html5", 29900));
		
		System.out.println(bookList.toString());
		
//		Iterator<Book> booki = bookList.iterator();
//		
//		while(booki.hasNext()) {
//			Book data = booki.next();
//			if (data.title == "sql") {
//				
//			}
//		}
		
		Book[] books = new Book[bookList.size()];
		books = bookList.toArray(books);
		Util.arrayPrint(books);
		Arrays.sort(books);
		Util.arrayPrint(books);
	}
	
	
	

}

class Book implements Comparable<Book>{
	String title;
	int price;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		if (title != null) {
			sb.append(title.toString());
		}
		
		sb.append(", ");
		
		sb.append(Integer.toString(price));
		
		sb.append("]");
		
		return sb.toString();
	}

	@Override
	public int compareTo(Book o) {
		return price - o.price;
	}
	
}