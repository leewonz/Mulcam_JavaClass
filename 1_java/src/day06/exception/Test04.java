package day06.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("input/data.txt"));
			System.out.println("=====================");
			while(scanner.hasNextLine()) {
				String msg = scanner.nextLine();
				System.out.println(msg);
			}
			System.out.println("=====================");
		} catch (FileNotFoundException e) {
			System.out.println("데이터 파일 확인해주세요...^^;;");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("자원 반납 블럭");
			if(scanner != null) {
				scanner.close();
				scanner = null;
			}
		}
		
		System.out.println("end");
	}

}
