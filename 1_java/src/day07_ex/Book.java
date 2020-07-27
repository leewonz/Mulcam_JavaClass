package day07_ex;

public class Book implements Comparable<Book>{
	private String title;
	private int price;
	
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
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return price - o.price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if (!(obj instanceof Book)) {return false;}
		
		Book bookObj = (Book)obj;
		
		if (bookObj.title == null) {return false;}
		
		if (this.title.equals(bookObj.title)) {return true;}
		else {return false;}
	}
}
