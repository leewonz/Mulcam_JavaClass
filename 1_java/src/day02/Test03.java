package day02;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
	
		int x = 4, y = 1;
		System.out.printf("%d", y++);
		System.out.printf("%d", ++y);
		System.out.printf("%d", y++);
		System.out.printf("%d", ++y);
		
		String msg = JOptionPane.showInputDialog("정수를 입력하세요???");
		System.out.println("입력정보"+ msg);
		int jumsu = Integer.parseInt(msg);
		boolean flag = jumsu >= 0 && jumsu <= 100 ;
		System.out.printf("%d 유효성 검사 %b", jumsu, flag);
	}
}
