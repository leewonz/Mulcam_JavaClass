package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Test06_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("java01",  "1234");
		map.put("java02",  "1235");
		map.put("java03",  "1236");
		map.put("java04",  "1237");
		map.put("java05",  "1238");
		
		System.out.printf("java04 => pw %s %n", map.get("java04"));
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("ID를 입력해 주세요.");
			String idInput = in.nextLine();
			
			System.out.println("PW를 입력해 주세요.");
			String pwInput = in.nextLine();
			
			String pwSearched = map.get(idInput);
			//System.out.println(pwSearched);
			if (pwSearched != null && pwSearched.equals(pwInput)) {
				System.out.println("로그인 되었습니다...");
				break;
			}
			System.out.println("로그인 실패...");
		}
		
		map.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.printf("%s%s | ",t, u);
				
			}
			
		});
	}

}
