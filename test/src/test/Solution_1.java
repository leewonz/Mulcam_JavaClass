package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream ("input/Solution_1.txt"));
		Scanner in = new Scanner(System.in);
		
		int tc = 0;
		int r = 0, c = 0;
		char[][] arr= null;
		
		tc = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		
		arr = new char[r][c];
		
		System.out.printf("%d %d %d", tc, r, c);
		
		for(int i = 0; i < r; i++) {
			String msg = in.next();
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = msg.charAt(j);
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
10
5 10
0000000000
0123456789
0000000000
0000000000
0000000000
*/