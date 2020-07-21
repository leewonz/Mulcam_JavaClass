package day03;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		boolean[] V = new boolean[5];
		System.out.println(Arrays.toString(V));
		
//			char[] c = {'A', 'B', 'C'};
		char[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i = 0; i < c.length; i++) {
			System.out.printf("%c -> %d %n", c[i], (int)c[i]);
		}
		
		String data = "홍길동/90/80/70/99";
		String[] res = data.split("/");
		
		double sum = 0;
		for(int i = 1; i< res.length; i++) {
			sum += Double.parseDouble(res[i]);
		}
		System.out.printf("%s %.2f %.2f %n", res[0], sum, sum/4);
	}

}
