package day02;

public class Test04 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		for(int i = 0; i < 100; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.printf("%d ", stack.pop());
		}
	}

}
