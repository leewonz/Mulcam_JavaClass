package day06.exception;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("start");
		
		Scanner scanner = new Scanner(System.in);
		
		String msg = scanner.next();
		
		try {
			if(msg.equals("hello")) {
				throw new RuntimeException("예외 발생시킴");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(scanner != null) {
				scanner.close();
				scanner = null;
			}
		}
		
		
		System.out.println("end");
	}

}
