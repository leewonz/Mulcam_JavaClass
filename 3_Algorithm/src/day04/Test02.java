package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	static int[][] G;
	static int N;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("src/input/p71.txt"));
		
		N = in.nextInt();
		G = new int[N][N];
		
		count = in.nextInt();
		
		for(int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			G[x][y] = G[y][x] = 1;
		}
		
		print(G);
	}
	static void print(int[][] G) {
		for(int i = 0; i < G.length; i++) {
			System.out.println(Arrays.toString(G[i]));
		}
	}

}
