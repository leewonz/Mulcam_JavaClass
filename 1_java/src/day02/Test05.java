package day02;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		boolean flag = Character.isDigit(c);
		String r = c >= '0' && c <= '9' ? "숫자" : "문자";
		System.out.printf("%c숫자여부? %s %n", c, r);
		
		// 대문자 => 소문자
		char chr = 'A';
		System.out.printf("%c ==> %c", chr, chr + 32);
	}
}
