package day02_ex;

public class Prob2_이원기 {
	public static void main(String[] args) {
		/*
		 1. 변수 num의 값에따라 양수 음수 0을 출력하는 코드를 완성하세요. 힌트: 삼항연산자.
		 */
		
		int num = -2;
		System.out.println(num == 0 ? "0" : (num >= 0 ? "앙수" : "음수"));

		/*
		 *2. 소문자는 대문자로 , 대문자는 소문자로 변경하는 코드를 완성 하세요. 
		 * 
		 *
		 */
		
		char c = 'A';
		System.out.printf("%c -> ", c);
		if(c >= 'a' && c <= 'z') {
			c -= 32;
		} else if (c >= 'A' && c <= 'Z') {
			c += 32;
		}
		System.out.println(c);
		
		/* 3. 년도를 입력받아 윤년인지 판별하여 출력해 보세요 */

		int year = 2100;
		boolean isLeapYear;
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					isLeapYear = true;
				}else {
					isLeapYear = false;
				}
			}else {
				isLeapYear = true;
			}
		}else {
			isLeapYear = false;
		}
		
		System.out.printf("%d년은 %s년입니다.%n ", year, isLeapYear ? "윤" : "평");
	}
}
