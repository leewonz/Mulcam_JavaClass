package day02;

public class Test08 {

	public static void main(String[] args) {
		f(10,0);

	}
	public static void f(int n, int stack) {
//		for(int i = 0; i < stack; i++) {
//			System.out.print("`");
//		}
//		System.out.println(n);
//		
		if(n <= 0 ) { return;}
		f(n - 1, stack + 1);
		for(int i = 0; i < stack; i++) {
			System.out.print("-");
		}
		System.out.println(n);
		f2(n - 2, stack + 1);
	}
	
	public static void f2(int n, int stack) {
//		for(int i = 0; i < stack; i++) {
//			System.out.print("`");
//		}
//		System.out.println(n);
//		
		if(n <= 0 ) { return;}
		f(n - 1, stack + 1);
		for(int i = 0; i < stack; i++) {
			System.out.print("-");
		}
		System.out.println(n + "#");
		f2(n - 2, stack + 1);
	}
}
