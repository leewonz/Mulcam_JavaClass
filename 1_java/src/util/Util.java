package util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Util {
	
	public static void listPrint(Collection obj) {
		Iterator i = obj.iterator();
		System.out.println("---------------");
		while (i.hasNext()) {
			Object object = i.next();
			System.out.println(object);
		}
		System.out.println("---------------");
	}
	
	public static void arrayPrint(Object[] obj) {
		System.out.println("---------------");
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}
		System.out.println("---------------");
	}
	
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
