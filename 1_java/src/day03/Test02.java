package day03;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int[] eng = null;
		eng = new int[4];
		eng[0] = 90;
		eng[1] = 65;
		eng[2] = 89;
		eng[3] = 55;
		
		System.out.println(eng.length);
		for(int i = 0; i < eng.length; i++) {
			System.out.printf("%d", eng[i]);
		}
		
		//Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(new FileInputStream("data.txt"));
		//String readData = scanner.nextLine();
		
		String[] names = new String[eng.length];
		
		names[0] = "호익ㄹ동";
		names[1] = null;
		names[2] = "호익ㄹ동";
		names[3] = "호익ㄹ동";
		
		System.out.println(Arrays.toString(names));
		
		double sum = 0;
		for(int i = 0; i < eng.length; i++) {
			if(names[i] != null && names[i].length() > 0)
			System.out.printf("[이름:%s 성적:%d]%n",names[i], eng[i]);
			sum += eng[i];
		}
		System.out.printf("평균 : %.2f %n", sum/eng.length);
		
		for(int data:eng) {
			System.out.println(data);
		}
		
	}

}
