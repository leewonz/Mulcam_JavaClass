package day01;

import java.util.Date;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		String name = new String("hello java");
		
		System.out.println(num);
		System.out.println(name.toUpperCase());
		
		Date d = new Date();
		System.out.println(d);
		d = null;
		
		System.out.println(d);
		
		char c = 'a';
		System.out.println(c);
		System.out.println(Character.isDigit(c));
		
		c = '1';
		System.out.println(c);
		System.out.println(Character.isDigit(c));
		
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
	}

}
