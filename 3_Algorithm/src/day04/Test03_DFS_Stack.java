package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Test03_DFS_Stack {

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
		dfs(0);
	}
	static void print(int[][] G) {
		for(int i = 0; i < G.length; i++) {
			System.out.println(Arrays.toString(G[i]));
		}
	}
	static void dfs(int node) {
		V[node] = true;
		System.out.printf("%d", node);
		for(int next = 0; next<N; next++) {
			if(!V[next] && G[node][next] != 0) dfs(next);
		}
	}
}
