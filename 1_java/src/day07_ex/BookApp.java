package day07_ex;

import java.util.Scanner;

public class BookApp {
	
	BookMgr bookMgr;
	Scanner in;
	
	public BookApp() {
		
		bookMgr = new BookMgr();
		in = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.목록");
			System.out.println("2.검색");
			System.out.println("3.추가");
			System.out.println("4.삭제");
			System.out.println("5.변경");
			System.out.println("0.종료");
			System.out.print("번호: ");
			
			String input = in.nextLine();
			int select;
			if (input != null && !input.equals("")) {
				char inputC = input.charAt(0);
				
				if (inputC >= '0' && inputC <= '9') {
					select = Integer.parseInt("" + inputC);
				}else {
					continue;
				}
			}else {
				continue;
			}
			
			switch(select) {
			case 1:
				showList();
				break;
			case 2:
				search();
				break;
			case 3:
				add();
				break;
			case 4:
				delete();
				break;
			case 5:
				modify();
				break;
			case 0:
				in.close();
				return;
			}
		}
	}
	
	private void showList() {
		System.out.println();
		bookMgr.bookListPrint();
		waitForInput();
	}
	
	private void search() {
		System.out.println();
		System.out.print("검색할 책의 제목: ");
		String str = in.nextLine();
		if (!bookMgr.searchTitle(str)) {
			System.out.println("검색 결과가 없습니다.");
		}
		waitForInput();
	}
	
	private void add() {
		System.out.println();
		System.out.print("추가할 책의 제목: ");
		String strTitle = in.nextLine();
		
		System.out.print("추가할 책의 가격: ");
		String strPrice = in.nextLine();
		
		bookMgr.addBook(new Book(strTitle, Integer.parseInt(strPrice)));
		waitForInput();
	}
	
	private void delete() {
		System.out.println();
		System.out.print("삭제할 책의 제목: ");
		String str = in.nextLine();
		if (!bookMgr.remove(str)) {
			System.out.println("해당 제목의 책이 없습니다.");
		}
		waitForInput();
	}
	
	private void modify() {
		System.out.println();
		System.out.print("변경할 책의 제목: ");
		String strOldTitle = in.nextLine();
		
		if (!bookMgr.checkTitle(strOldTitle)) {
			System.out.println("해당 제목의 책이 없습니다.");
		} else {
			System.out.print("새로운 책의 제목: ");
			String strNewTitle = in.nextLine();
			
			System.out.print("새로운 책의 가격: ");
			String strPrice = in.nextLine();
			
			if (!bookMgr.update(
					strOldTitle, strNewTitle, Integer.parseInt(strPrice))) {
				System.out.println("해당 제목의 책이 없습니다.");
			}
		}
		waitForInput();
	}
	
	private void waitForInput() {
		System.out.println("확인하려면 엔터를 누르세요.");
		in.nextLine();
	}
}