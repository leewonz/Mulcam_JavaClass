package day02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		System.out.printf("%d %d %d %n", num, ++num, num);
		num = 99;
		System.out.printf("%d %d %n", num, num % 10);
		int x = 99, y = 99;
		System.out.printf("%b %b %b %b %n", x > y, x < y, x <= y, x == y);
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.printf("%s == %s ==> %s %n", s1, s2, s1 == s2);
		System.out.printf("%s == %s ==> %s %n", s3, s4, s3 == s4);
		
		System.out.printf("%s == %s ==> %s %n", s1, s2, s1.equals(s2));
		System.out.printf("%s == %s ==> %s %n", s3, s4, s3.equals(s3));
		
	}
}
