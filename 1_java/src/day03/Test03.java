package day03;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		//int[] num = new int[5];
		int[] num = {76, 83, 68, 26, 89};
		System.out.println(Arrays.toString(num));
		
		int[] numCopy = new int[num.length*2];
		System.out.println(Arrays.toString(numCopy));
		
		System.arraycopy(num, 0, numCopy, 0, num.length);
		System.out.println(Arrays.toString(numCopy));
	}
}
