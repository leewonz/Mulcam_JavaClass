package day04_ex;

/*
 * 1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
 */

public class BookMgr {
	Book[] booklist;
	int count = 0;
	
	public BookMgr(int size) {
		booklist = new Book[size];
	}
	
	public void addBook(Book book) {
		if(count >= booklist.length) {
			Book[] temp = new Book[booklist.length * 2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
			temp = null;
		}
		booklist[count++] = book;
	}
	
	public void printBookList() {
		System.out.printf("=== 책 목록 ===%n");
		for(int i = 0; i < booklist.length; i++) {
			System.out.printf("%s%n", booklist[i].getTitle());
		}
		if (count == 0) {
			System.out.printf("리스트에 책이 없습니다%n");
		}
	}
	
	public int printTotalPrice() {
		System.out.printf("=== 책 가격의 총합 ===%n");
		int sum = 0;
		for(int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.printf("전체 책 가격의 합 : %d%n", sum);
		return sum;
	}
}
