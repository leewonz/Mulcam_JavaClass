package day07;

import java.util.Stack;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1 = new Stack<String>();
		
		s1.push("홍길동1");
		s1.push("홍길동2");
		s1.push("홍길동3");
		
		System.out.println(s1.pop().charAt(0));
		System.out.println(s1.peek());
		
		
		
	}

}
