package day06_ex;

/*
 * 
문제1. Prob6내에 leftPad 메쏘드를 작성하십시오. 
       leftPad 메쏘드의 속성은 다음과 같습니다.

1.	메소드 시그니처 : 
        public static String leftPad(String str, int size, char padChar)

2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
        문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
             큰 경우에는 원본 문자열(str)을 그대로 리턴한다.

실행 예) 
leftPad(“SDS”, 6, ‘#’)  ###SDS 
leftPad(“SDS”, 5, ‘$’)   $$SDS
leftPad(“SDS”, 2, ‘&’)     SDS 
*/

public class Prob6 {
	public static void main(String args[]) {
		
		
		System.out.println( Prob6.leftPad("SDS", 6, '#') );
		System.out.println( Prob6.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob6.leftPad("SDS", 2, '&') ); 
	}
	public static String leftPad(String str, int size, char padChar) {
		
		StringBuilder sb = new StringBuilder();
		
		try {
			if(size < 0) {
				throw new NegativeNumberException();
			}
			
			for(int i = 0; i < size - str.length(); i++) {
				sb.append(padChar);
			}
			
			sb.append(str);
		} 
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return sb.toString();
	}
}  

class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("음수는 허용되지 않습니다.");
	}
}