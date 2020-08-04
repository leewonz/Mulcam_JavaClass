package day03.ex;

import java.util.Stack;

//하노니탑문제
public class Ex01 {
	public static void main(String[] args) {
		
		Stack<Integer> from = new Stack<Integer>();
		Stack<Integer> by = new Stack<Integer>();
		Stack<Integer> to = new Stack<Integer>();
		
		from.push(4);
		from.push(3);
		from.push(2);
		from.push(1);
		
		System.out.println(from);
		System.out.println(to);

		hanoi(4,from,by,to);
		System.out.println("-----------------");
		System.out.println(from);
		System.out.println(to);

	}

	private static void hanoi(int n, 
			                  Stack<Integer> from, 
			                  Stack<Integer> by, 
			                  Stack<Integer> to) {
		
		if(n==1) {
			move(from,to);
			return;
		}
		hanoi(n-1, from, to, by);
		move(from,to);
		hanoi(n-1, by, from, to );
		
	}

	private static void move(Stack<Integer> from, Stack<Integer> to) {
		to.push(from.pop());
	}
	
	
}










