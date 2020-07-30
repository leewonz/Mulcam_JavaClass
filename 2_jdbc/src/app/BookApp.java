package app;

import java.util.Scanner;

import book.dao.BookDAO;
import book.service.BookService;
import book.service.BookServiceImpl;
import vo.BookVo;

public class BookApp {

	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);

		String cmd = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------===BOOK APP===--------");
		MAINLOOP: while (true) {
			System.out.println("- 메뉴 번호를 입력하세요 -");
			System.out.println("1. 입    력");
			System.out.println("2. 겁    색");
			System.out.println("9. 종    료");
			System.out.print("입력>");
			cmd = scanner.nextLine().trim();
			switch (cmd) {
			case "1":
				break;
			case "2":
				System.out.println("[BOOK 검색]");
				System.out.println("- 검색할 BOOK 제목을 입력하세요 -");
				System.out.print("입력>");
				String key = scanner.nextLine().trim();

				System.out.println("'" + key + "' 검색 시작...");
				BookVo res = service.get("java");

				System.out.println("검색 결과");
				System.out.println(res.toString());

				System.out.println("BOOK 검색 완료. 돌아가려면 엔터를 입력하세요.");
				scanner.nextLine();
				break;
			case "9":
				System.out.println("- 정말 종료하시겠습니까? (Y/N) -");
				String exitCmd = scanner.nextLine().trim();
				if (exitCmd.toUpperCase().equals("Y")) {
					break MAINLOOP;
				}
				break;
			}
		}

//		try {
//
//			System.out.println("ins");
//			service.insert(new BookVo(1, "java", "person", 5000));
//			service.getAll().forEach(i -> System.out.println(i));
//			System.out.println("upd");
//			service.update(1, new BookVo(-1, "javascript", "person", 9000));
//			service.getAll().forEach(i -> System.out.println(i));
//			System.out.println("get");
//			System.out.println(service.get("java").toString());
//			service.getAll().forEach(i -> System.out.println(i));
//			System.out.println("del");
//			service.delete(1);
//			service.getAll().forEach(i -> System.out.println(i));
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}

	}

}
