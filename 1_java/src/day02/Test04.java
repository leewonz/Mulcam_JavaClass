package day02;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요__ex)홍 길동");
		String name = scanner.nextLine();
		System.out.println("점수를 입력하세요__ex)90");
		int jumsu = scanner.nextInt();
		
		System.out.printf("이름:%s, 점수:%d ", name, jumsu);
		
		boolean flag = jumsu >= 0 && jumsu < 100;
		System.out.println(flag);
		
		scanner.close();
		scanner = null;
	}

}