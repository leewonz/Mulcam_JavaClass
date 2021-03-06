/*
 * === 책 목록 ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== 책 가격의 총합 ===
전체 책 가격의 합 : 132000

 */

package day04_ex;

public class Prob4 {

	public static void main(String[] args) {
		
		BookMgr bookMgr = new BookMgr(5);
		
		bookMgr.addBook(new Book("Java Program", 30000));
		bookMgr.addBook(new Book("JSP Program", 30000));
		bookMgr.addBook(new Book("SQL Fundamentals", 30000));
		bookMgr.addBook(new Book("JDBC Program", 30000));
		bookMgr.addBook(new Book("EJB Program", 30000));
		
		bookMgr.printBookList();
		bookMgr.printTotalPrice();
	}

}
