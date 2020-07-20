package day02;

public class Test01 {
	 
	
	
	public static void main(String[] args) {
		int num = 1;
		double doubleNum = 1.2;
		System.out.printf("%d%n", num);
		System.out.printf("%f%n", (double)num);
		System.out.printf("%f%n", new Double(num));
		System.out.printf("%f%n", doubleNum);
		System.out.printf("%d%n", (int)doubleNum);
		//System.out.println(new Integer(doubleNum)); //컴파일러 에러
		
		System.out.printf("----------%n");
		
		char c = 'A';
		System.out.printf("%c : %d %n", c, (int)c);
		
		System.out.printf("1/2 = %s, 1/2. = %s %n", 1/2, 1/2.);
		System.out.printf("1/2 = %d, 1/2. = %.2f %n", 1/2, 1/2.);
	}
}
