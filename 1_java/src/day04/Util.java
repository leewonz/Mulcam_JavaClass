package day04;

public class Util {
	
	public static int add(int ...a) {
		int sum = 0;
		for(int data:a) {
			sum += data;
		}
		return sum;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
		
	}
	
	public static int max(int a, int b) {
		return a >= b ? a : b;
	}
	
	public static int min(int a, int b) {
		return a <= b ? a : b;
	}
}
