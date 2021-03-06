package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	static int[][] G;
	static boolean[] V;
	static int N;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("input/p71.txt"));
		
		N = in.nextInt();
		G = new int[N][N];
		V = new boolean[N];
		
		count = in.nextInt();
		
		for(int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			G[x][y] = G[y][x] = 1;
		}
		
		print(G);
		dfs_recursive(0);
	}
	private static void dfs_recursive(int node) {
		for(int i = 0; i < G[node].length; i++) {
			if (G[node][i] == 1 && !V[i]) {
				System.out.printf("%d, ",i);
				V[i] = true;
				dfs_recursive(i);
			}
		}
	}
	static void print(int[][] G) {
		for(int i = 0; i < G.length; i++) {
			System.out.println(Arrays.toString(G[i]));
		}
	}

}
